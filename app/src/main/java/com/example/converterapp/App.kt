package com.example.converterapp


import android.app.Application
import android.util.Log
import com.example.converterapp.di.converterModule
import com.example.converterapp.di.currenciesModule
import org.koin.core.context.startKoin

class App: Application()  {

    override fun onCreate() {
        super.onCreate()
        Log.i("App", "${BuildConfig.API_BASE_URL}/${BuildConfig.API_KEY}/")
        startKoin {
            applicationContext
            modules(converterModule, currenciesModule)
        }
    }
}