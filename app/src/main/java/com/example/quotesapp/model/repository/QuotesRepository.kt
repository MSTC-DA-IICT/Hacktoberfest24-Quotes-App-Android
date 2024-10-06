package com.example.quotesapp.model.repository

import android.content.Context
import com.example.quotesapp.model.Quote
import kotlinx.serialization.json.Json

class QuotesRepository(private val context: Context) {

    fun getQuotesFromAssets(fileName: String): List<Quote>{
        val jsonString = loadJsonFromAssets(fileName)
        return parseQuotesJson(jsonString)
    }

    private fun loadJsonFromAssets(fileName: String): String{
        return context.assets.open(fileName).bufferedReader().use{
            it.readText()
        }
    }

    private fun parseQuotesJson(jsonString: String): List<Quote>{
        return Json.decodeFromString(jsonString)
    }

}