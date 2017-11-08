
rules_scala_version = "85308acbd316477f3072e033e7744debcba4f054"

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()

maven_jar(name = "jackson_annotations", artifact = "com.fasterxml.jackson.core:jackson-annotations:2.8.7")
maven_jar(name = "jackson_core", artifact = "com.fasterxml.jackson.core:jackson-core:2.8.7")
maven_jar(name = "jackson_databind", artifact = "com.fasterxml.jackson.core:jackson-databind:2.8.7")
maven_jar(name = "jopt", artifact = "net.sf.jopt-simple:jopt-simple:5.0.4")
maven_jar(name = "kafka", artifact = "org.apache.kafka:kafka_2.11:1.0.0")
maven_jar(name = "kafka_clients", artifact = "org.apache.kafka:kafka-clients:1.0.0")
maven_jar(name = "log4j", artifact = "log4j:log4j:1.2.17")
maven_jar(name = "slf4j_api", artifact = "org.slf4j:slf4j-api:1.7.25")
maven_jar(name = "slf4j_log4j", artifact = "org.slf4j:slf4j-log4j12:1.7.25")
maven_jar(name = "yammer", artifact = "com.yammer.metrics:metrics-core:2.2.0")
maven_jar(name = "zkclient", artifact = "com.101tec:zkclient:0.10")
maven_jar(name = "zookeeper", artifact = "org.apache.zookeeper:zookeeper:3.4.10")
maven_jar(name = "jline", artifact = "jline:jline:1.0.0")
