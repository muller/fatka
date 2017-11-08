package fatka

object Main extends App {
    log4j.start()
    Zookeeper.start()
    Kafka.start()

    scala.sys.addShutdownHook {
        Kafka.stop()
        Zookeeper.stop()
    }
}

object tmpdir {
    def apply(name: String) = {
        val file = java.nio.file.Files.createTempDirectory(name).toFile
        file.deleteOnExit()
        file
    }
}

object Kafka {

    import kafka.server._

    val logs = tmpdir("kafka-logs")

    val config = new java.util.Properties()
    config.setProperty("broker.id", "1")
    config.setProperty("host.name", "localhost")
    config.setProperty("log.dir", logs.getAbsolutePath)
    config.setProperty("port", "9092")
    config.setProperty("zookeeper.connect", "localhost:2181")

    val broker = new KafkaServerStartable(new KafkaConfig(config))

    def start() = broker.startup()
    def stop() = broker.shutdown()
}

object Zookeeper {

    import org.apache.zookeeper.server._

    val logs = tmpdir("zookeeper-logs")
    val snapshots = tmpdir("zookeeper-snapshot")
    val address = new java.net.InetSocketAddress("localhost", 2181)

    val server = new ZooKeeperServer(snapshots, logs, 500)
    val cnxn = ServerCnxnFactory.createFactory()
    cnxn.configure(address, 16)

    def start() = cnxn.startup(server)

    def stop() = cnxn.shutdown()
}

object log4j {

    import org.apache.log4j._

    val console = new ConsoleAppender
    console.setLayout(new PatternLayout("%-5p [%t]: %m%n"))
    console.setThreshold(Level.INFO)
    console.activateOptions()

    def start() = Logger.getRootLogger().addAppender(console)
}
