package com.example.converter

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.converter.databinding.FragmentConverterBinding
import com.example.currencies.api.models.Currency
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class ConverterFragment : Fragment() {

    private var binding: FragmentConverterBinding? = null

    private val inputCurrencyList = Currency.entries.toTypedArray()

    private val viewModel: ConverterViewModel by viewModel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConverterBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputCurrencyAdapter =
            ArrayAdapter(requireContext(), R.layout.simple_spinner_item, inputCurrencyList)
        val outputCurrencyAdapter =
            ArrayAdapter(requireContext(), R.layout.simple_spinner_item, inputCurrencyList)

        inputCurrencyAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)
        outputCurrencyAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        binding?.apply {
            spnInputCurrency.apply {
                adapter = inputCurrencyAdapter
                setSelection(inputCurrencyList.indexOf(Currency.RUB))
                onItemSelectedListener = context?.let {
                    InputCurrencyItemSelectedListener(
                        viewModel
                    )
                }
            }
            spnOutputCurrency.apply {
                adapter = inputCurrencyAdapter
                setSelection(inputCurrencyList.indexOf(Currency.USD))
            }
            lifecycleScope.launch {
                viewModel.state.collect { state ->
                    when (state) {
                        State.Error -> {
                            val errorMessage = Toast.makeText(
                                context,
                                "Ошибка, проверьте подключение к интернету",
                                Toast.LENGTH_SHORT
                            )
                            errorMessage.show()
                            button.setOnClickListener {
                                errorMessage.show()
                            }
                        }

                        State.None -> {

                        }

                        is State.Success -> {
                            button.setOnClickListener {
                                outputSum.text =
                                    ((state.data.conversionRates[spnOutputCurrency.selectedItem.toString()]
                                        ?: 0.0) * inputSum.text.toString().toDouble()).toString()
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}