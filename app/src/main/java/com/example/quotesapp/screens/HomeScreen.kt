package com.example.quotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotesapp.R

@Composable
fun HomeScreen(){
    Column {
        Text(
            text = stringResource(id = R.string.app_name),
            textAlign =  TextAlign.Center,
            modifier = Modifier
                .padding(8.dp,16.dp)
                .fillMaxWidth(1f),

            style = MaterialTheme.typography.titleLarge
        )
    }
}