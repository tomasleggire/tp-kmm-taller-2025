plugins {
    id("com.android.application")
    kotlin("multiplatform")
    kotlin("plugin.serialization")
    id("org.jetbrains.compose")
    id("app.cash.sqldelight") version "2.0.0"
}

kotlin {
    android()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material3)
                implementation(compose.ui)
                //Koin
                implementation(libs.koin.core)
                //Napier
                implementation(libs.napier)
                //SQLDelight
                implementation("app.cash.sqldelight:runtime:2.0.0")
                // Ktor
                implementation("io.ktor:ktor-client-core:2.3.3")
                implementation("io.ktor:ktor-client-content-negotiation:2.3.3")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.3")
                implementation("io.ktor:ktor-client-logging:2.3.3")

                //dependencia directa de Kotlin Serialization
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(compose.preview)
                implementation("androidx.activity:activity-compose:1.8.2")
                // Koin para Android + Compose
                implementation(libs.koin.android)
                implementation(libs.koin.androidx.compose)
                //Ktor
                implementation("io.ktor:ktor-client-okhttp:2.3.3")
                //SQLDelight
                implementation("app.cash.sqldelight:android-driver:2.0.0")
            }
        }
    }
}



android {
    namespace = "com.example.app_nvidia_kmm"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.example.app_nvidia_kmm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
