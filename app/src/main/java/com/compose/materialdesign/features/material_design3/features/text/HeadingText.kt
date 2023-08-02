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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.material_design3.features.text.textscreen.TextDescription

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeadingTextViewScreen(navTextController: NavHostController) {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        // top bar
        TopAppBar(
            title = { Text(text = "Heading") },
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
            LargeTitle1(text = "Large Title 1", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            Title2(text = "Title 2", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            Title3(text = "Title 3", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            Title4(text = "Title 4", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            HEADLINE(text = "HEADLINE", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
        }
        Divider()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            LargeTitle1(text = "Large Title 1", color = Color.DarkGray)
            TextDescription(
                text = "Large Title 1",
                fontSize = "26.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "40.sp"
            )

            Title2(text = "Title 2", color = Color.DarkGray)
            TextDescription(
                text = "Title 2",
                fontSize = "24.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "32.sp"
            )

            Title3(text = "Title 3", color = Color.DarkGray)
            TextDescription(
                text = "Title 3",
                fontSize = "20.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "32.sp"
            )

            Title4(text = "Title 4", color = Color.DarkGray)
            TextDescription(
                text = "Title 4",
                fontSize = "16.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            HEADLINE(text = "HEADLINE", color = Color.DarkGray)
            TextDescription(
                text = "HEADING",
                fontSize = "14.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "20.sp"
            )
        }
    }
}

/**
 * the text is: Large Title 1
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun LargeTitle1(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

/**
 * the text is: Title 2
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun Title2(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

/**
 * the text is: Title 3
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun Title3(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}

/**
 * the text is: Title 4
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
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

/**
 * the text is: HEADLINE
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
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