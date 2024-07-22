package com.example.converter

import android.util.Log
import com.example.converter.models.ConversionRates
import com.example.converter.models.CurrenciesUi
import com.example.currencies.api.models.ConversionRatesDTO
import com.example.currencies.api.models.CurrenciesResponse
import com.example.currencies.repository.RequestResult

fun RequestResult<CurrenciesResponse>.toState(): State {
    Log.i("ssdf", data.toString())
    return when (this) {
        is RequestResult.Success -> State.Success(this.data.toCurrenciesUi())
        is RequestResult.Error -> State.Error
    }
}

fun CurrenciesResponse.toCurrenciesUi(): CurrenciesUi = CurrenciesUi(
    baseCode = baseCode.toString(),
    conversionRates = conversionRates.toConversionRates()
)

fun ConversionRatesDTO.toConversionRates(): ConversionRates {
    TODO("Not implemented")
}