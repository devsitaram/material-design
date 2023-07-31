package com.compose.materialdesign.features.material_design3.features.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.materialdesign.R

@Composable
fun PasswordTextFieldViewScreen() {
    var password by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PasswordTextField(value = password,
                onValueChange = { password = it },
                label = "Enter password"
            )
        }
    }
}

@Composable
fun PasswordTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    val passwordVisibility = remember { mutableStateOf(false) }
    androidx.compose.material.TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label, fontSize = 14.sp) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        maxLines = 1,
        trailingIcon = {
            IconButton(
                onClick = { passwordVisibility.value = !passwordVisibility.value }
            ) {
                Icon(
                    painter = if (passwordVisibility.value) painterResource(id = R.drawable.ic_visibility) else painterResource(
                        id = R.drawable.ic_visibility_off
                    ),
                    contentDescription = "visibility",
//                    tint = Color.Red
                )
            }
        },
        visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation()
    )
}