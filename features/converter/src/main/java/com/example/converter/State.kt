package com.example.converter

import com.example.converter.models.CurrenciesUi

sealed class State {

    data object None : State()

    data object Error : State()

    class Success(val data: CurrenciesUi) : State()

//    class Loading(val data: CurrenciesUi?) : State()

}