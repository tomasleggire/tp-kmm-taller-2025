pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.1.1"
        id("org.jetbrains.kotlin.multiplatform") version "1.9.10"
        id("org.jetbrains.compose") version "1.5.1"
    }
}

rootProject.name = "APPNVIDIAKMM"
include(":composeApp")
