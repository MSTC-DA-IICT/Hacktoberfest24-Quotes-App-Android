package com.example.quotesapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.quotesapp.model.Quote
import com.example.quotesapp.model.repository.QuotesRepository

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class QuotesManagerViewModel(private val quotesRepository: QuotesRepository) : ViewModel() {

    private val _quotes = MutableStateFlow<List<Quote>>(emptyList())
    val quotes: StateFlow<List<Quote>> = _quotes

    init {
        loadQuotes("quotes.json")
    }

    private fun loadQuotes(fileName: String) {
        viewModelScope.launch {
            val quoteList = quotesRepository.getQuotesFromAssets(fileName)
            _quotes.value = quoteList
        }
    }
}