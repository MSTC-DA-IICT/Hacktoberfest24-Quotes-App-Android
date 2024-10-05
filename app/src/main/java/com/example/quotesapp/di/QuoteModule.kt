package com.example.quotesapp.di

import com.example.quotesapp.model.repository.QuotesRepository
import com.example.quotesapp.viewModel.QuotesViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val quoteRepoModule = module{
    single{
        QuotesRepository(androidContext())
    }
    viewModel{
        QuotesViewModel(get())
    }
}