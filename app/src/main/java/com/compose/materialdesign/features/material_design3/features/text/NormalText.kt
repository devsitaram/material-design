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
fun NormalTextViewScreen(navTextController: NavHostController) {
    Column(
        Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        // top bar
        TopAppBar(
            title = { Text(text = "Normal Text") },
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
            ExtraLargeText(text = "Extra Large Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            LargeTextBold(text = "Large Text Bold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            LargeTextSemiBold(text = "Large Text SemiBold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            LargeText(text = "Large Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            RegularTextBold(text = "Regular Text Bold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            RegularTextSemiBold(text = "Regular Text SemiBold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            LargeTextSemiBold(text = "Large Text SemiBold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            RegularText(text = "Regular Text", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            SmallTextBold(text = "Small Text Bold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
            SmallTextSemiBold(text = "Small Text SemiBold", color = Color.DarkGray)
            Spacer(modifier = Modifier.height(25.dp))
        }
        Divider()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            ExtraLargeText(text = "Extra Large Text", color = Color.DarkGray)
            TextDescription(
                text = "Extra Large Text",
                fontSize = "20.sp",
                fontWeight = "Normal",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            LargeTextBold(text = "Large Text Bold", color = Color.DarkGray)
            TextDescription(
                text = "Large Text Bold",
                fontSize = "16.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            LargeTextSemiBold(text = "Large Text SemiBold", color = Color.DarkGray)
            TextDescription(
                text = "Large Text SemiBold",
                fontSize = "16.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            LargeText(text = "Large Text", color = Color.DarkGray)
            TextDescription(
                text = "Large Text",
                fontSize = "16.sp",
                fontWeight = "Normal",
                color = "DarkGray",
                lineHeight = "24.sp"
            )

            RegularTextBold(text = "Regular Text Bold", color = Color.DarkGray)
            TextDescription(
                text = "Regular Text Bold",
                fontSize = "14.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "40.sp"
            )

            RegularTextSemiBold(text = "Regular Text SemiBold", color = Color.DarkGray)
            TextDescription(
                text = "Regular Text SemiBold",
                fontSize = "14.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "20.sp"
            )

            RegularText(text = "Regular Text", color = Color.DarkGray)
            TextDescription(
                text = "Regular Text",
                fontSize = "14.sp",
                fontWeight = "Normal",
                color = "DarkGray",
                lineHeight = "20.sp"
            )

            SmallTextBold(text = "Small Text Bold", color = Color.DarkGray)
            TextDescription(
                text = "Small Text Bold",
                fontSize = "12.sp",
                fontWeight = "Bold",
                color = "DarkGray",
                lineHeight = "16.sp"
            )

            SmallTextSemiBold(text = "Small Text SemiBold", color = Color.DarkGray)
            TextDescription(
                text = "Small Text SemiBold",
                fontSize = "12.sp",
                fontWeight = "SemiBold",
                color = "DarkGray",
                lineHeight = "16.sp"
            )
        }
    }
}


/**
 * the text is: Extra Large Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun ExtraLargeText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal
        ),
        color = color,
        lineHeight = 24.sp,
    )
}

/**
 * the text is: Large Text Bold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun LargeTextBold(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 24.sp,
    )
}

/**
 * the text is: Large Text SemiBold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun LargeTextSemiBold(text: String, color: Color) {
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
 * the text is: Large Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun LargeText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        ),
        color = color,
        lineHeight = 24.sp,
    )
}

/**
 * the text is: Regular Text Bold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun RegularTextBold(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 40.sp,
    )
}


/**
 * the text is: Regular Text SemiBold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun RegularTextSemiBold(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 20.sp,
    )
}

/**
 * the text is: Regular Text
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun RegularText(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal
        ),
        color = color,
        lineHeight = 20.sp,
    )
}

/**
 * the text is: Small Text Bold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun SmallTextBold(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold
        ),
        color = color,
        lineHeight = 16.sp,
    )
}

/**
 * the text is: Small Text SemiBold
 * fontSize, fontWeight, color and also lineHeight
 * it it reusable component
 */
@Composable
fun SmallTextSemiBold(text: String, color: Color) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight = FontWeight.SemiBold
        ),
        color = color,
        lineHeight = 16.sp,
    )
}