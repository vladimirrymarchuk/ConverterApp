package com.example.currencies.repository

import com.example.currencies.api.ApiService
import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.api.models.Currency


class ApiRepository(private val apiService: ApiService) {

    suspend fun getCurrencies(
        currency: Currency = Currency.RUB
    ) : RequestResult<CurrenciesResponse>{
        return apiService.getCurrencies(currency).toRequestResult()
    }

}