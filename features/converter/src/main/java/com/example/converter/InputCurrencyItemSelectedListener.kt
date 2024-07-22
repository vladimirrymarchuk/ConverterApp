package com.example.converter

import android.view.View
import android.widget.AdapterView
import android.widget.Toast

class InputCurrencyItemSelectedListener(private val viewModel: ConverterViewModel): AdapterView.OnItemSelectedListener {
    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent != null) {
            //viewModel.getCurrencies(parent.selectedItem as Currency)
            Toast.makeText(parent.context, "input", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}