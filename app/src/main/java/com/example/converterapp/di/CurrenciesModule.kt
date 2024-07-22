package com.example.converterapp.di

import com.example.currencies.api.ApiService
import com.example.currencies.repository.ApiRepository
import org.koin.dsl.module

val currenciesModule = module {
    single<ApiService> {
        ApiService(
            baseUrl = "https://v6.exchangerate-api.com/v6",
            apiKey = "d5894079a1ea4958014be16c"
        )
    }
    single<ApiRepository> { ApiRepository(get()) }
}