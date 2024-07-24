package com.example.converter

import android.view.View
import android.widget.AdapterView
import com.example.currencies.api.models.Currency

class InputCurrencyItemSelectedListener(private val viewModel: ConverterViewModel): AdapterView.OnItemSelectedListener {
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent != null) {
            viewModel.getCurrencies(Currency.entries.toTypedArray()[position])
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}