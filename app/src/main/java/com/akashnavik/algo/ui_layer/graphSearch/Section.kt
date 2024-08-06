package com.akashnavik.algo.ui_layer.graphSearch

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Section(title: String, content: String ) {
    Column(
        modifier = Modifier.padding(bottom = 4.dp)
    ) {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
        Text(
            text = content,
            fontSize = 16.sp
        )
    }
}

@Composable
fun CodeBlock(code: String) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(243, 234, 235, 255)),
        elevation = CardDefaults.elevatedCardElevation(1.dp),
        shape = RectangleShape,
    ) {
        Text(
            text = code,
            fontSize = 12.sp,
            color = Color(61, 61, 61, 255)
        )
    }
}