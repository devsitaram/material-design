package com.compose.materialdesign.features.material_design3.features.textfield

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
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextFieldScreen() {

    var name by remember { mutableStateOf("") }

    var simpleTextField by remember { mutableStateOf("") }
    var textField by remember { mutableStateOf("name") }
    var simpleOutlineTextField by remember { mutableStateOf("name") }

    Column(modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        TopAppBar(
            title = { Text(text = "Input Text") },
            navigationIcon = {
                IconButton(onClick = {
                    // MaterialDesign3Item.navigateUp()
                }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        )
        Column(modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleTextField(value = simpleTextField, onValueChange = { simpleTextField = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextField(value = textField, onValueChange = { textField = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))

            SimpleOutlineTextField(value = simpleOutlineTextField, onValueChange = { simpleOutlineTextField = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            OutlineTextField(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithIcons(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithPlaceholder(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithPrefixAndSuffix(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithErrorState(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithSupportingText(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            PasswordTextField(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            TextArea(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
        }
    }
}

@Composable
fun SimpleTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun SimpleOutlineTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun OutlineTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithIcons(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithPlaceholder(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithPrefixAndSuffix(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithErrorState(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithSupportingText(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun PasswordTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextArea(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}