package com.example.currencies.repository

import com.example.currencies.api.ApiService
import com.example.currencies.api.models.Currency
import com.example.currencies.api.models.CurrenciesResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ApiRepository(private val apiService: ApiService) {

    fun getCurrencies(
        currency: Currency = Currency.RUB
    ) : Flow<RequestResult<CurrenciesResponse>> = flow { emit(apiService.getCurrencies().toRequestResult()) }
}