package com.example.app_nvidia_kmm.di

import org.koin.core.module.Module
import org.koin.dsl.module

// Este es tu módulo principal de Koin
val appModule: Module = module {
    // Provee una instancia de SampleRepository como singleton
    single { SampleRepository() }
}
