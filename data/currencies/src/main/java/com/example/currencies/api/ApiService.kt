package com.example.currencies.api

import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.api.models.Currency
import com.skydoves.retrofit.adapters.result.ResultCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface ApiService {

    @GET("latest/{currency}")
    suspend fun getCurrencies(
        @Path("currency") currency: Currency = Currency.RUB
    ): Result<CurrenciesResponse>
}

fun ApiService(
    baseUrl: String,
    apiKey: String,
): ApiService {
    val retrofit = retrofit(baseUrl, apiKey)
    return retrofit.create(ApiService::class.java)
}

internal fun retrofit(
    baseUrl: String,
    apiKey: String,
): Retrofit {
    return Retrofit.Builder()
        .baseUrl("$baseUrl/$apiKey/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(ResultCallAdapterFactory.create())
        .build()
}
