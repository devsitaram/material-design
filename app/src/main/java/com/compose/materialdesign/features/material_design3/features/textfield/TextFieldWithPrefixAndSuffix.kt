package com.compose.materialdesign.features.material_design3.features.textfield

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldWithPrefixAndSuffixViewScreen() {
    var prefixAndSuffix by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldWithPrefixAndSuffix(
                value = prefixAndSuffix,
                onValueChange = { prefixAndSuffix = it },
                label = "Label",
                placeholder = "google",
                prefix = "www.",
                suffix = ".com",
            )
        }
    }
}


/**
 * this is the TextFieldWithPrefixAndSuffix
 *  Add the suffix and prefix parameter here
 */
@Composable
fun TextFieldWithPrefixAndSuffix(
    value: String,
    onValueChange: (String) -> Unit = {},
    label: String,
    placeholder: String,
    prefix: String,
    suffix: String
) {
    val context = LocalContext.current
    val trimmedValue = value.removePrefix(prefix).removeSuffix(suffix)
    androidx.compose.material.TextField(
        value = if (value.isEmpty()) placeholder else value,
        onValueChange = { newValue ->
            // Don't allow the prefix or suffix to be deleted
            if (newValue.startsWith(prefix) || newValue.endsWith(suffix)) {
                onValueChange(value)
            } else {
                onValueChange("$prefix$newValue$suffix")
            }
        },
        label = { Text(text = label, fontSize = 14.sp) },
        placeholder = { Text(text = placeholder, fontSize = 14.sp) },
        leadingIcon = {
            Text(
                text = prefix,
                modifier = Modifier.padding(start = 5.dp),
                fontSize = 14.sp
            )
        },
        trailingIcon = {
            Text(
                text = suffix,
                modifier = Modifier
                    .padding(end = 5.dp)
                    .clickable {
                        Toast
                            .makeText(context, trimmedValue, Toast.LENGTH_SHORT)
                            .show()
                    },
                fontSize = 14.sp
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
    )
}