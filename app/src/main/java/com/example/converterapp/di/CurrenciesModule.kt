package com.example.converterapp.di

import com.example.converterapp.BuildConfig
import com.example.currencies.api.ApiService
import com.example.currencies.repository.ApiRepository
import org.koin.dsl.module

val currenciesModule = module {
    single<ApiService> {
        ApiService(
            baseUrl = BuildConfig.API_BASE_URL,
            apiKey = BuildConfig.API_KEY
        )
    }
    single<ApiRepository> { ApiRepository(get()) }
}