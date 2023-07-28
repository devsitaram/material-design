package com.compose.materialdesign.features.material_design3.features.textfield.textfieldscreen

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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.material_design3.features.textfield.MainTextFieldScreen
import com.compose.materialdesign.features.material_design3.features.textfield.SimpleTextField


@Composable
fun TextFieldViewScreen() {
    val navTextFieldController = rememberNavController()
    NavHost(navController = navTextFieldController, startDestination = "MainTextFieldScreen"){
        composable("MainTextFieldScreen"){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.SimpleTextField.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextField.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.SimpleOutlineTextField.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.OutlineTextField.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextFieldWithIcons.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextFieldWithPlaceholder.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextFieldWithPrefixAndSuffix.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextFieldWithErrorState.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextFieldWithSupportingText.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.PasswordTextField.route){
            MainTextFieldScreen()
        }
        composable(Material3TextFieldItem.TextArea.route){
            MainTextFieldScreen()
        }
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextFieldScreens() {
    var name by remember { mutableStateOf("") }
    Column(
        Modifier
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
            // all the text fields
            SimpleTextField(
                value = name,
                onValueChange = { name = it },
                label = "Label"
            )
            Spacer(modifier = Modifier.height(25.dp))
        }
    }
}