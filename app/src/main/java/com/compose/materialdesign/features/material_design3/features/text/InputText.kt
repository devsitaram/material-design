package com.compose.materialdesign.features.material_design3.features.text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.material_design3.features.text.textscreen.TextDescription
import com.compose.materialdesign.features.util.ButtonTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputTextViewScreen(navTextController: NavHostController) {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        // top bar
        ButtonTopAppBar(
            title = "Input Text",
            navController = navTextController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Label(text = "Label", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            InputText(text = "Input Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
        }
        Divider()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Label(text = "Label", color = Color.DarkGray)
            TextDescription(
                text = "Label",
                fontSize = "12.sp",
                fontWeight = "Normal",
                color = "DarkGray",
                lineHeight = "16.sp"
            )

            InputText(text = "Input Text", color = Color.DarkGray)
            TextDescription(
                text = "Input Text",
                fontSize = "14.sp",
                fontWeight = "Normal",
                color = "DarkGray",
                lineHeight = "24.sp"
            )
        }
    }
}

/**
 * the text is: Label
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun Label(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        ),
        color = color,
        lineHeight = 16.sp,
    )
}

/**
 * the text is: Input Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun InputText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        ),
        color = color,
        lineHeight = 24.sp,
    )
}