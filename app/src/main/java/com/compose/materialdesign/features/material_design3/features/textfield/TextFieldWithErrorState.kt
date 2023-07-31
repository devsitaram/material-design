package com.compose.materialdesign.features.material_design3.features.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldWithErrorStateViewScreen() {
    var errorState by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldWithErrorState(
                value = errorState,
                onValueChange = { errorState = it },
                label = "Label"
            )
        }
    }
}

@Composable
fun TextFieldWithErrorState(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    val numOfText =  value.length
    var color: Color = Color.DarkGray
    if (numOfText >=10){ color = Color.Red }
    Column(horizontalAlignment = Alignment.End) {
        androidx.compose.material.TextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(text = label, color = color, fontSize = 14.sp) },
            colors = TextFieldDefaults.textFieldColors(
                textColor = color, // Set the color for the input text as well
                // backgroundColor = Color.White, // Set the background color (optional)
                cursorColor = color, // Set the cursor color (optional)
                errorCursorColor = color, // Set the error cursor color (optional)
                // disabledTextColor = Color.Gray // Set the disabled text color (optional)
                focusedIndicatorColor = color,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            singleLine = true,
            maxLines = 1,
        )
        Text(
            text = "Limit: $numOfText+/10",
            style = TextStyle(fontSize = 12.sp),
            color = color
        )
    }
}