plugins {
    java
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_13
}

dependencies {
    testImplementation(Libraries.junit)
    testImplementation(Libraries.assertj)
}
