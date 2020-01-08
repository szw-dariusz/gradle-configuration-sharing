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
    testImplementation(Library.JUNIT.notation)
    testImplementation(Library.ASSERTJ.notation)
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging.events("passed", "skipped", "failed")
    maxParallelForks = 4
}
