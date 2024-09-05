plugins {
    kotlin("jvm") apply false
}

group = "by.boiko.otus"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    group = rootProject.group
    version = rootProject.version
}