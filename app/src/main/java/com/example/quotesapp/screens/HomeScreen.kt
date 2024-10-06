package com.example.quotesapp.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quotesapp.ui.theme.QuotesAppTheme
import org.koin.androidx.compose.koinViewModel
import androidx.compose.runtime.*
import androidx.compose.runtime.collectAsState

import androidx.compose.runtime.rememberCoroutineScope
import com.example.quotesapp.di.QuoteListItem
import com.example.quotesapp.viewModel.QuotesManagerViewModel

@Composable
fun HomeScreen(viewModel: QuotesManagerViewModel = koinViewModel()) {
    val quotes by viewModel.quotes.collectAsState()
    val coroutineScope = rememberCoroutineScope()

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(quotes) { quote ->
            QuoteListItem(quote = quote)
        }
    }
}

@Preview
@Composable
fun TestHomeScreen(){
    QuotesAppTheme {
        HomeScreen()
    }
}