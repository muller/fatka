load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "fatka",
    srcs = ["Main.scala"],
    deps = [
        "@kafka//jar",
        "@kafka_clients//jar",
        "@log4j//jar",
        "@zookeeper//jar",
    ],
    runtime_deps = [
        "@jackson_annotations//jar",
        "@jackson_core//jar",
        "@jackson_databind//jar",
        "@jline//jar",
        "@jopt//jar",
        "@slf4j_api//jar",
        "@slf4j_log4j//jar",
        "@yammer//jar",
        "@zkclient//jar",
    ],
    main_class = "fatka.Main",
    visibility = ["//visibility:public"],
)
