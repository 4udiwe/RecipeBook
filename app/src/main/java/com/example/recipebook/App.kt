package com.example.recipebook

import android.app.Application
import com.example.recipebook.di.appModule
import com.example.recipebook.di.authModule
import com.example.recipebook.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(Level.INFO)
            androidContext(this@App)
            modules(listOf(appModule, authModule, dataModule))
        }
    }
}