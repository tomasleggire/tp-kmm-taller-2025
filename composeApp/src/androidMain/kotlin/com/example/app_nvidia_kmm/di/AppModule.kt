package com.example.app_nvidia_kmm.di
import com.example.app_nvidia_kmm.cache.DatabaseDriverFactory
import com.example.app_nvidia_kmm.cache.MovieCache
import com.example.app_nvidia_kmm.data.repository.MovieRepository
import com.example.app_nvidia_kmm.data.source.remote.MovieService
import com.example.app_nvidia_kmm.network.HttpClientFactory
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {

    // 🔹 Driver de SQLDelight
    single { DatabaseDriverFactory(get()).createDriver() }

    // 🔹 Instancia del caché
    single { MovieCache(get()) }

    // 🔹 Cliente HTTP de Ktor
    single { HttpClientFactory }

    // 🔹 Servicio de la API con su cliente HTTP
    single { MovieService(get()) }

    // 🔹 Repositorio que usa el servicio + caché
    single { MovieRepository(get(), get()) }
}