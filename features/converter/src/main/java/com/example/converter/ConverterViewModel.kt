package com.example.converter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class ConverterViewModel(private val getCurrenciesUseCase: GetCurrenciesUseCase) : ViewModel() {

    val state: StateFlow<State> = getCurrenciesUseCase()
        .stateIn(viewModelScope, SharingStarted.Lazily, State.None)
}