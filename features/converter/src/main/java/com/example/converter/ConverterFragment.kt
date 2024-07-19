package com.example.converter

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.converter.databinding.FragmentConverterBinding

class ConverterFragment : Fragment() {

    private var binding: FragmentConverterBinding? = null

    private val viewModel: ConverterViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentConverterBinding.inflate(layoutInflater)

        return inflater.inflate(R.layout.fragment_converter, container, false)
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}