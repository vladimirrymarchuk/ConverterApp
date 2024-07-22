package com.example.converterapp


import android.app.Application
import com.example.converterapp.di.converterModule
import com.example.converterapp.di.currenciesModule
import org.koin.core.context.startKoin

class App: Application()  {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            applicationContext
            modules(converterModule, currenciesModule)
        }
    }
}