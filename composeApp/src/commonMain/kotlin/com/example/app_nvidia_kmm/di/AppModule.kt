package com.example.app_nvidia_kmm.di

import com.example.app_nvidia_kmm.data.repository.MovieRepository
import com.example.app_nvidia_kmm.data.source.remote.MovieService
import com.example.app_nvidia_kmm.network.HttpClientFactory
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule: Module = module {
    // Cliente HTTP de Ktor
    single { HttpClientFactory }

    // Servicio remoto que usa el cliente HTTP
    single { MovieService(get()) }

    // Repositorio que usa el servicio remoto
    single { MovieRepository(get()) }
}
