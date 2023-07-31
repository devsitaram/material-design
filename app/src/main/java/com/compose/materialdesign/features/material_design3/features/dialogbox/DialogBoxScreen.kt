package com.compose.materialdesign.features.material_design3.features.dialogbox

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ShapeDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogBoxViewScreen(navMaterialController: NavHostController) {
    val showAlertDialog = remember { mutableStateOf(false) }
    val showIconAlertDialog = remember { mutableStateOf(false) }
    val showCustomAlertDialog = remember { mutableStateOf(false) }
    // input dialog box
    val showInputDialog = remember { mutableStateOf(false) }
    var userInput by remember { mutableStateOf("") }

    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
        ) {
            TopAppBar(
                title = { Text(text = "Dialog Box") },
                navigationIcon = {
                    IconButton(onClick = {
                        navMaterialController.navigateUp()
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
                // AlertDialogSample
                DialogBoxCard(title = "AlertDialogSample", subTitle = "example of AlertDialogSample", onClickAction = { showAlertDialog.value = true })
                if (showAlertDialog.value){
                    SampleDialogBox(title = "Title", text = "Turned on by default!", onDismiss = {showAlertDialog.value = false})
                }

                // AlertDialogSWithIcon
                DialogBoxCard(
                    title = "AlertDialogWithIcon",
                    subTitle = "example of AlertDialogSWithIcon",
                    onClickAction = {
                        // show dialog box
                        showIconAlertDialog.value = true
                    }
                )
                if (showIconAlertDialog.value){
                    IconDialogBox(title = "Title", text = "This area typically contains the supportive text which presents the details regarding the Dialog's purpose.", onDismiss = {showIconAlertDialog.value = false})
                }

                // AlertDialogSWithCustomContent
                DialogBoxCard(
                    title = "AlertDialogWithCustomContent",
                    subTitle = "example of AlertDialogSWithCustomContent",
                    onClickAction = {
                        // show dialog box
                        showCustomAlertDialog.value = true
                    }
                )
                if (showCustomAlertDialog.value){
                    CustomDialogBox(text = "This area typically contains the supportive text which presents the details regarding the Dialog's purpose.", onDismiss = {showCustomAlertDialog.value = false})
                }

                // input dialog box
                DialogBoxCard(
                    title = "showInputDialog",
                    subTitle = "example of showInputDialog",
                    onClickAction = {
                        // show dialog box
                        showInputDialog.value = true
                    }
                )
                if (showInputDialog.value) {
                    InputDialogBox(
                        text = "Enter the text:",
                        onDismiss = { showInputDialog.value = false },
                        onSubmit = { inputText ->
                            userInput = inputText
                            showInputDialog.value = false
                        }
                    )
                }
                if (userInput.isNotBlank()) {
                    Text("Input Text: $userInput")
                }
            }
        }
    }
}

@Composable
fun DialogBoxCard(title: String, subTitle: String, onClickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClickAction() }
            .border(width = 0.5.dp, color = Color.LightGray, shape = ShapeDefaults.Small),
    ) {
        Row(
            modifier = Modifier
                .background(Color.White)
                .padding(15.dp)
                .fillMaxWidth()
                .width(IntrinsicSize.Max), // Set the width to the maximum intrinsic width
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column {
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                )
                Text(
                    text = subTitle,
                    style = TextStyle(fontSize = 12.sp),
                    modifier = Modifier.padding(top = 5.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }
    }
}