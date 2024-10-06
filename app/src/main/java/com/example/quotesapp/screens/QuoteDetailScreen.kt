package com.example.quotesapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuoteDetailScreen(quote: String, author: String) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFf5f7fa),
                        Color(0xFFc3cfe2)
                    )
                )
            )
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            elevation = CardDefaults.cardElevation(16.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(24.dp), // Increase padding for more spacing
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "\"$quote\"",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontSize = 24.sp, // Slightly larger text
                        lineHeight = 32.sp
                    ),
                    modifier = Modifier.padding(bottom = 24.dp),
                    color = Color.DarkGray
                )


                Box(
                    modifier = Modifier
                        .background(
                            color = Color(0xFFE0F7FA),
                            shape = RoundedCornerShape(50)
                        )
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                        .align(Alignment.End)
                ) {
                    Text(
                        text = "- $author",
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = Color(0xFF00796B),
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    )
                }
            }
        }
    }
}
