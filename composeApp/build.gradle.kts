plugins {
    id("com.android.application")
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }

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
                // Ktor
                implementation("io.ktor:ktor-client-core:2.3.3")
                implementation("io.ktor:ktor-client-content-negotiation:2.3.3")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.3")
                implementation("io.ktor:ktor-client-logging:2.3.3")
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
