enum class Library(group: String,
                   artifact: String,
                   version: String,
                   val notation: String = "${group}:${artifact}:${version}") {
    JUNIT("org.junit.jupiter", "junit-jupiter", "5.4.2"),
    ASSERTJ("org.assertj", "assertj-core", "3.14.0");
}
