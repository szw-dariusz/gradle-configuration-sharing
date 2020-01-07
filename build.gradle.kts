group = "ds"
description = "Project for exploring Dependency management in Gradle build scripts with Kotlin DSL"
version = "0.1.0"

subprojects {
    repositories {
        mavenCentral()
        jcenter()
    }

    tasks {
        withType<Test> {
            useJUnitPlatform()
            testLogging.events("passed", "skipped", "failed")
            maxParallelForks = 4
        }
    }
}
