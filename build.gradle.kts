buildscript {
    repositories {
        maven(url = "https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:9.1.0")
    }
}
plugins {
    id("org.jlleitschuh.gradle.ktlint") version "9.1.0"
}
