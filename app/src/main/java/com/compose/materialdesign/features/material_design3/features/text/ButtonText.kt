package com.compose.materialdesign.features.material_design3.features.text

import androidx.compose.foundation.background
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonTextViewScreen(navTextController: NavHostController) {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        // top bar
        TopAppBar(
            title = { Text(text = "Input Text") },
            navigationIcon = {
                IconButton(onClick = { navTextController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LargeButtonText(text = "Large Button Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            MediumButtonText(text = "Medium Button Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            SmallButtonText(text = "Medium Button Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
        }
        Divider()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            LargeButtonText(text = "Large Button Text", color = Color.DarkGray)
            TextDescription(
                text = "Large Button Text",
                fontSize = "16.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "14.sp"
            )

            MediumButtonText(text = "Medium Button Text", color = Color.DarkGray)
            TextDescription(
                text = "Medium Button Text",
                fontSize = "14.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            SmallButtonText(text = "Small Button Text", color = Color.DarkGray)
            TextDescription(
                text = "Small Button Text",
                fontSize = "12.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "24.sp"
            )
        }
    }
}

/**
 * the text is: Large Button Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun LargeButtonText(text: String, color: Color) {
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

/**
 * the text is: IMedium Button Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun MediumButtonText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 24.sp,
    )
}

/**
 * the text is: Small Button Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun SmallButtonText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 24.sp,
    )
}