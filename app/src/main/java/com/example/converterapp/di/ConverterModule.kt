package com.example.converterapp.di

import com.example.converter.ConverterViewModel
import com.example.converter.GetCurrenciesUseCase
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val converterModule = module {
    single<GetCurrenciesUseCase> { GetCurrenciesUseCase(get())}
    viewModel<ConverterViewModel> { ConverterViewModel(get()) }
}