package com.example.converter

import android.util.Log
import com.example.currencies.api.models.Currency
import com.example.currencies.repository.ApiRepository

class GetCurrenciesUseCase(private val repository: ApiRepository) {
    suspend operator fun invoke(currency: Currency): State {
        val response = repository.getCurrencies(currency)
        Log.i(
            "usecase",
            "${response.result}, ${response.documentation}, ${response.termsOfUse}, ${response.timeLastUpdateUnix}, ${response.timeLastUpdateUtc}, ${response.timeNextUpdateUnix}, ${response.timeNextUpdateUnix}, ${response.baseCode}, ${response.conversionRates}"
        )
        return State.Success(response.toCurrenciesUi())//.toState()
    }
}