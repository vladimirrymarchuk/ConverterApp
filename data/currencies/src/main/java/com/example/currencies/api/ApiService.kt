package com.example.currencies.api

import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.api.models.Currency
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
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
    val jsonConverterFactory = Json.asConverterFactory(MediaType.get("application/json"))

    return Retrofit.Builder()
        .baseUrl("$baseUrl/$apiKey/")
        .addConverterFactory(jsonConverterFactory)
        .build()
}
