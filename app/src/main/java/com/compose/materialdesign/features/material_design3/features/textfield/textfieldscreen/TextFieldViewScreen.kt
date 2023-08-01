package com.compose.materialdesign.features.material_design3.features.textfield.textfieldscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.material_design3.features.textfield.OutlineTextFieldsViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.PasswordTextFieldViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.SimpleOutlineTextFieldViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.SimpleTextFieldViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextAreaViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.NormalTextFieldViewScreens
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithErrorStateViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithIconsViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithPlaceholderViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithPrefixAndSuffixViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithSupportingTextViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard


@Composable
fun TextFieldViewScreen(navMaterialController: NavHostController) {
    val navTextFieldController = rememberNavController()
    NavHost(navController = navTextFieldController, startDestination = "MainTextFieldScreen"){
        composable("MainTextFieldScreen"){
            MainTextFieldScreens(navTextFieldController, navMaterialController)
        }
        composable(Material3TextFieldItem.SimpleTextField.route){
            SimpleTextFieldViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.NormalTextField.route){
            NormalTextFieldViewScreens(navTextFieldController)
        }
        composable(Material3TextFieldItem.SimpleOutlineTextField.route){
            SimpleOutlineTextFieldViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.OutlineTextFields.route){
            OutlineTextFieldsViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextFieldWithIcons.route){
            TextFieldWithIconsViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextFieldWithPlaceholder.route){
            TextFieldWithPlaceholderViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextFieldWithPrefixAndSuffix.route){
            TextFieldWithPrefixAndSuffixViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextFieldWithErrorState.route){
            TextFieldWithErrorStateViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextFieldWithSupportingText.route){
            TextFieldWithSupportingTextViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.PasswordTextField.route){
            PasswordTextFieldViewScreen(navTextFieldController)
        }
        composable(Material3TextFieldItem.TextArea.route){
            TextAreaViewScreen(navTextFieldController)
        }
    }
}

@Composable
fun MainTextFieldScreens(navTextFieldController: NavHostController, navMaterialController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
    ) {
        ButtonTopAppBar(
            title = "Input TextFields",
            navController = navMaterialController
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // SimpleTextField
            ListOfDataCard(
                title = "SimpleTextField",
                subTitle = "example of TextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.SimpleTextField.route)
                }
            )
            ListOfDataCard(
                title = "NormalTextField",
                subTitle = "example of NormalTextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.NormalTextField.route)
                }
            )
            ListOfDataCard(
                title = "SimpleOutlineTextField",
                subTitle = "example of SimpleOutlineTextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.SimpleOutlineTextField.route)
                }
            )
            ListOfDataCard(
                title = "OutlineTextFields",
                subTitle = "example of OutlineTextFields",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.OutlineTextFields.route)
                }
            )
            ListOfDataCard(
                title = "TextFieldWithIcons",
                subTitle = "example of TextFieldWithIcons",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithIcons.route)
                }
            )
            ListOfDataCard(
                title = "TextFieldWithPlaceholder",
                subTitle = "example of TextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithPlaceholder.route)
                }
            )
            ListOfDataCard(
                title = "TextFieldWithPrefixAndSuffix",
                subTitle = "example of TextFieldWithPrefixAndSuffix",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithPrefixAndSuffix.route)
                }
            )
            ListOfDataCard(
                title = "TextFieldWithErrorState",
                subTitle = "example of TextFieldWithErrorState",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithErrorState.route)
                }
            )
            ListOfDataCard(
                title = "TextFieldWithSupportingText",
                subTitle = "example of TextFieldWithSupportingText",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithSupportingText.route)
                }
            )
            ListOfDataCard(
                title = "PasswordTextField",
                subTitle = "example of PasswordTextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.PasswordTextField.route)
                }
            )
            ListOfDataCard(
                title = "TextArea",
                subTitle = "example of TextArea",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextArea.route)
                }
            )
        }
    }
}