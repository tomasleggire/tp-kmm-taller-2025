package com.example.app_nvidia_kmm

import android.app.Application
import com.example.app_nvidia_kmm.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Inicializamos Koin
        startKoin {
            androidContext(this@MyApp)
            modules(appModule)
        }
    }
}