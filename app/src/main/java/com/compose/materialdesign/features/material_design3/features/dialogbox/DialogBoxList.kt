package com.compose.materialdesign.features.material_design3.features.dialogbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties

/**
 * this is the sample of normal dialog box
 * this dialog box can required for
 * @param title
 * @param text
 * @param onDismiss function
 */
@Composable
fun SampleDialogBox(title: String, text: String, onDismiss: () -> Unit) {
//    val activity = (LocalContext.current as Activity)
    AlertDialog(
        onDismissRequest = { onDismiss() },
        title = { Text( text = title ) },
        text = { Text( text = text ) },
        modifier = Modifier.fillMaxWidth(),
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text(text = "Dismiss")
            }
        },
        confirmButton = {
            TextButton(
                onClick = { onDismiss() } // activity.finish()
            ) {
                Text(text = "Confirm")
            }
        }
    )
}

/**
 * this is the icon dialog box
 * this dialog box can required for
 * @param title
 * @param text
 * @param onDismiss function
 */
@Composable
fun IconDialogBox(title: String, text: String, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        icon = { Icon(imageVector = Icons.Default.Favorite, contentDescription = null) },
        title = { Text( text = title ) },
        text = { Text( text = text ) },
        modifier = Modifier.fillMaxWidth(),
        dismissButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text(text = "Dismiss")
            }
        },
        confirmButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text(text = "Confirm")
            }
        }
    )
}

/**
 * this is the custom dialog box
 * this dialog box can required for
 * @param text
 * @param onDismiss function
 */
@Composable
fun CustomDialogBox(text: String, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = { onDismiss() },
        text = { Text( text = text ) },
        modifier = Modifier.fillMaxWidth(),
        confirmButton = {
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text(text = "Confirm")
            }
        }
    )
}

/**
 * this is the custom dialog box
 * this dialog box can required for
 * @param text
 * @param onDismiss function
 * @param onSubmit function which is getting for input text value
 */
@Composable
fun InputDialogBox(text: String, onDismiss: () -> Unit, onSubmit: (String) -> Unit) {
    var textValue by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text( text = "Title" ) },
        text = { Text( text = "This is the input dialog box." ) },
        confirmButton = {
            Column {
                TextField(
                    value = textValue,
                    onValueChange = { textValue = it },
                    label = { Text(text = "Text", fontSize = 14.sp) },
                    placeholder = { Text(text = text, fontSize = 14.sp) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            onSubmit(textValue)
                            onDismiss()
                        }
                    ),
                    singleLine = true,
                    maxLines = 1
                )
                Row(
                    Modifier.fillMaxWidth().padding(5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ) {
                    TextButton(
                        onClick = {
                            onDismiss()
                        }
                    ) {
                        Text("Dismiss")
                    }
                    TextButton(
                        onClick = {
                            onSubmit(textValue)
                            onDismiss()
                        }
                    ) {
                        Text("Submit")
                    }
                }
            }
        },
        properties = DialogProperties(dismissOnClickOutside = false),
    )
}