package com.example.converter

import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.repository.ApiRepository
import com.example.currencies.repository.RequestResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetCurrenciesUseCase(private val repository: ApiRepository) {

    operator fun invoke(): Flow<State> = repository.getCurrencies().map { it.toState() }
}