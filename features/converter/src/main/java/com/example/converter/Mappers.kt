package com.example.converter

import com.example.converter.models.CurrenciesUi
import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.api.models.Currency
import com.example.currencies.repository.RequestResult

fun RequestResult<CurrenciesResponse>.toState(): State = when(this) {
    is RequestResult.Success -> State.Success(this.data.toCurrenciesUi())
    is RequestResult.Error -> State.Error
}

fun CurrenciesResponse.toCurrenciesUi(): CurrenciesUi {
    TODO("Not implemented")
}