package com.example.quotesapp.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.quotesapp.model.Quote
import com.example.quotesapp.model.repository.QuotesRepository

class QuotesViewModel(private val quotesRepository: QuotesRepository): ViewModel() {

    private var quotes =  mutableStateListOf<Quote>()
    val _quotes = quotes

    fun loadQuotes(fileName:String){
        val quoteList = quotesRepository.getQuotesFromAssets(fileName)
        quotes.addAll(quoteList)
    }

}