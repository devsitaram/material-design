package com.compose.materialdesign.features.material_design3.features.textfield

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.compose.materialdesign.R

@Composable
fun TextFieldWithIconsViewScreen() {
    var textFieldWithIcons by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldWithIcons(
                value = textFieldWithIcons,
                onValueChange = { textFieldWithIcons = it },
                label = "Label",
                leadingIcon = painterResource(id = R.drawable.ic_person),
                trailingIcon = painterResource(id = R.drawable.ic_info)
            )
        }
    }
}

@Composable
fun TextFieldWithIcons(
    value: String,
    onValueChange: (String) -> Unit = {},
    label: String,
    leadingIcon: Painter,
    trailingIcon: Painter
) {
    androidx.compose.material.TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        leadingIcon = {
            Icon(painter = leadingIcon, contentDescription = "leadingIcon")
        },
        trailingIcon = {
            Icon(painter = trailingIcon, contentDescription = "trailingIcon")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
    )
}