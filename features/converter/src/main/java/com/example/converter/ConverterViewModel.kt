package com.example.converter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencies.api.models.Currency
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ConverterViewModel(private val getCurrenciesUseCase: GetCurrenciesUseCase) : ViewModel() {

    private val _state: MutableStateFlow<State> = MutableStateFlow(State.None)
    val state: StateFlow<State> = _state

    fun getCurrencies(currency: Currency) {
        viewModelScope.launch(Dispatchers.IO) {
            //_state.value = getCurrenciesUseCase(currency)
            _state.value = State.Error
        }
    }
}