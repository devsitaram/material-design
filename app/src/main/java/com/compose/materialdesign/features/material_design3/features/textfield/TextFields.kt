package com.compose.materialdesign.features.material_design3.features.textfield

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.materialdesign.R

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextFieldScreen() {

    var name by remember { mutableStateOf("") }

    var simpleTextField by remember { mutableStateOf("") }
    var textField by remember { mutableStateOf("example") }
    var simpleOutlineTextField by remember { mutableStateOf("") }
    var outlineTextFields by remember { mutableStateOf("example") }
    var textFieldWithIcons by remember { mutableStateOf("") }
    var textFieldWithPlaceholder by remember { mutableStateOf("") }
    var prefixAndSuffix by remember { mutableStateOf("") }
//    var outlineTextFields by remember { mutableStateOf("example") }
    Column(
        modifier = Modifier
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SimpleTextField(
                value = simpleTextField,
                onValueChange = { simpleTextField = it },
                label = "Label"
            )
            Spacer(modifier = Modifier.height(25.dp))
            TextField(value = textField, onValueChange = { textField = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
            SimpleOutlineTextField(
                value = simpleOutlineTextField,
                onValueChange = { simpleOutlineTextField = it },
                label = "Label"
            )
            Spacer(modifier = Modifier.height(25.dp))
            OutlineTextFields(
                value = outlineTextFields,
                onValueChange = { outlineTextFields = it },
                label = "Label"
            )
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithIcons(
                value = textFieldWithIcons,
                onValueChange = { textFieldWithIcons = it },
                label = "Label",
                leadingIcon = painterResource(id = R.drawable.ic_person),
                trailingIcon = painterResource(id = R.drawable.ic_info)
            )
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithPlaceholder(
                value = textFieldWithPlaceholder,
                onValueChange = { textFieldWithPlaceholder = it },
                label = "Label",
                placeholder = "example@gmail.com"
            )
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithPrefixAndSuffix(
                value = prefixAndSuffix,
                onValueChange = { prefixAndSuffix = it },
                label = "Label",
                placeholder = "google",
                prefix = "www.",
                suffix = ".com",
            )
            Spacer(modifier = Modifier.height(25.dp))
            TextFieldWithErrorState(value = name, onValueChange = { name = it }, label = "Label")
            Spacer(modifier = Modifier.height(25.dp))
//            TextFieldWithSupportingText(value = name, onValueChange = { name = it }, label = "Label")
//            Spacer(modifier = Modifier.height(25.dp))
//            PasswordTextField(value = name, onValueChange = { name = it }, label = "Label")
//            Spacer(modifier = Modifier.height(25.dp))
//            TextArea(value = name, onValueChange = { name = it }, label = "Label")
//            Spacer(modifier = Modifier.height(25.dp))
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
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun OutlineTextFields(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) }
    )
}

@Composable
fun TextFieldWithIcons(
    value: String,
    onValueChange: (String) -> Unit = {},
    label: String,
    leadingIcon: Painter,
    trailingIcon: Painter
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        leadingIcon = {
            Icon(painter = leadingIcon, contentDescription = "leadingIcon")
        },
        trailingIcon = {
            Icon(painter = trailingIcon, contentDescription = "trailingIcon")
        },
    )
}

@Composable
fun TextFieldWithPlaceholder(
    value: String,
    onValueChange: (String) -> Unit = {},
    label: String,
    placeholder: String
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        placeholder = { Text(text = placeholder) }
    )
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
    TextField(
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
        leadingIcon = { Text(text = prefix, modifier = Modifier.padding(start = 5.dp), fontSize = 14.sp) },
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
        }
    )
}

@Composable
fun TextFieldWithErrorState(value: String, onValueChange: (String) -> Unit = {}, label: String) {
    val numOfText =  value.length
    var color: Color = Color.Black
    if (numOfText >=10){
        color = Color.Red
    }
    Column(horizontalAlignment = Alignment.End) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(text = label) },
            colors = TextFieldDefaults.textFieldColors(
                textColor = color,
//                disabledTextColor = color,
//                backgroundColor = color,
//                cursorColor = color,
//                errorCursorColor = color,
            ),
        )
        Text(
            text = "Limit: $numOfText+/10",
            style = TextStyle(fontSize = 12.sp),
            color = color
        )
    }
}
//
//@Composable
//fun TextFieldWithSupportingText(
//    value: String,
//    onValueChange: (String) -> Unit = {},
//    label: String
//) {
//    TextField(
//        value = value,
//        onValueChange = onValueChange,
//        label = { Text(text = label) }
//    )
//}
//
//@Composable
//fun PasswordTextField(value: String, onValueChange: (String) -> Unit = {}, label: String) {
//    TextField(
//        value = value,
//        onValueChange = onValueChange,
//        label = { Text(text = label) }
//    )
//}
//
//@Composable
//fun TextArea(value: String, onValueChange: (String) -> Unit = {}, label: String) {
//    TextField(
//        value = value,
//        onValueChange = onValueChange,
//        label = { Text(text = label) }
//    )
//}

//colors = TextFieldDefaults.outlinedTextFieldColors(
//cursorColor = Color.Black,
//textColor = Color.Black,
//focusedBorderColor = Color.Black
//),