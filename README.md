# fatka

Kafka fatjar

Fatjar for quickstart with kafka.

## Start kafka broker - localhost:9092 (with zookeeper - localhost:2181) 
`java -jar fatka_deploy.jar`

## Start console consumer
`java -cp fatka_deploy.jar kafka.tools.ConsoleConsumer --zookeeper localhost:2181 --topic test-topic`

## Start console producer
`java -cp fatka_deploy.jar kafka.tools.ConsoleProducer --broker-list localhost:9092 --topic test-topic`

## Explore zookeeper
`java -cp bazel-bin/src/main/scala/fatka/fatka_deploy.jar org.apache.zookeeper.ZooKeeperMain`
