package com.example.converter.models

data class CurrenciesUi(
    val baseCode: String,
    val conversionRates: Map<String, Double>
)
