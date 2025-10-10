package com.example.app_nvidia_kmm.network

import io.ktor.client.engine.*
import io.ktor.client.engine.okhttp.*

actual fun getPlatformHttpClientEngine(): HttpClientEngine {
    return OkHttp.create() // Engine de Android
}
