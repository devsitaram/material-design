package com.compose.materialdesign.features.material_design3.features.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun HeadingTextViewScreen() {
    Column(Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LargeTitle1(text = "Large Title 1", color = Color.Black)
        Title2(text = "Title 2", color = Color.Black)
        Title3(text = "Title 3", color = Color.Black)
        Title4(text = "Title 4", color = Color.Black)
        HEADLINE(text = "HEADLINE", color = Color.Black)
    }
}

// LargeTitle1
@Composable
fun LargeTitle1(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

// Title 2
@Composable
fun Title2(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

// Title3
@Composable
fun Title3(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 32.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

// Title 4
@Composable
fun Title4(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 24.sp,
    )
}

// HEADLINE
@Composable
fun HEADLINE(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 20.sp,
    )
}