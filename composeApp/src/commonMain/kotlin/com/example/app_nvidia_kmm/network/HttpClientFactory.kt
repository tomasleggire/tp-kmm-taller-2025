package com.example.app_nvidia_kmm.network

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

expect fun getPlatformHttpClientEngine(): io.ktor.client.engine.HttpClientEngine

object HttpClientFactory {
    fun createClient(): HttpClient {
        return HttpClient(getPlatformHttpClientEngine()) {
            install(ContentNegotiation) {
                json(
                    Json {
                        prettyPrint = true
                        isLenient = true
                        ignoreUnknownKeys = true
                    }
                )
            }
            install(Logging) {
                level = LogLevel.ALL
            }
        }
    }
}
