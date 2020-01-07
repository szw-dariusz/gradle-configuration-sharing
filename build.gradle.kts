group = "ds"
description = "Project for exploring Dependency management in Gradle build scripts with Kotlin DSL"
version = "0.1.0"

repositories {
    mavenCentral()
    jcenter()
}

plugins {
    java
}

java {
    val version = JavaVersion.VERSION_13
    sourceCompatibility = version
    targetCompatibility = version
}

dependencies {
    testImplementation(Libraries.junit)
    testImplementation(Libraries.assertj)
}

tasks {
    withType<Test> {
        useJUnitPlatform()
        testLogging.events("skipped", "failed")
        maxParallelForks = 4
    }
}
