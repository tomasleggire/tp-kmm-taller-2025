pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
    }
    plugins {
        id("com.android.application") version "8.1.1"
        id("org.jetbrains.kotlin.multiplatform") version "1.9.10"
        id("org.jetbrains.compose") version "1.5.1"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://jitpack.io")
    }
}

rootProject.name = "APPNVIDIAKMM"
include(":composeApp")
