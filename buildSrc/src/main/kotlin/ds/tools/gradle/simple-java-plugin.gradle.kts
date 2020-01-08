package ds.tools.gradle

plugins {
    java
}

repositories {
    mavenCentral()
    jcenter()
}

java {
    val version = JavaVersion.VERSION_13
    sourceCompatibility = version
    targetCompatibility = version
}

dependencies {
    testImplementation(Library.JUNIT)
    testImplementation(Library.ASSERTJ)
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging.events("passed", "skipped", "failed")
    maxParallelForks = 4
}
