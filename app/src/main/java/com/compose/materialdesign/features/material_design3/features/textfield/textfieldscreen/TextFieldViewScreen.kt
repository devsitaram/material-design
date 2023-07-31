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
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldViewScreens
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithErrorStateViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithIconsViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithPlaceholderViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithPrefixAndSuffixViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.TextFieldWithSupportingTextViewScreen


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
        composable(Material3TextFieldItem.TextField.route){
            TextFieldViewScreens(navTextFieldController)
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextFieldScreens(navTextFieldController: NavHostController,
    navMaterialController: NavHostController
) {
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
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // SimpleTextField
            InputTextFieldsCard(
                title = "SimpleTextField",
                subTitle = "example of TextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.SimpleTextField.route)
                }
            )
            InputTextFieldsCard(
                title = "TextField",
                subTitle = "example of TextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.SimpleTextField.route)
                }
            )
            InputTextFieldsCard(
                title = "SimpleOutlineTextField",
                subTitle = "example of SimpleOutlineTextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.SimpleOutlineTextField.route)
                }
            )
            InputTextFieldsCard(
                title = "OutlineTextFields",
                subTitle = "example of OutlineTextFields",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.OutlineTextFields.route)
                }
            )
            InputTextFieldsCard(
                title = "TextFieldWithIcons",
                subTitle = "example of TextFieldWithIcons",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithIcons.route)
                }
            )
            InputTextFieldsCard(
                title = "TextFieldWithPlaceholder",
                subTitle = "example of TextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithPlaceholder.route)
                }
            )
            InputTextFieldsCard(
                title = "TextFieldWithPrefixAndSuffix",
                subTitle = "example of TextFieldWithPrefixAndSuffix",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithPrefixAndSuffix.route)
                }
            )
            InputTextFieldsCard(
                title = "TextFieldWithErrorState",
                subTitle = "example of TextFieldWithErrorState",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithErrorState.route)
                }
            )
            InputTextFieldsCard(
                title = "TextFieldWithSupportingText",
                subTitle = "example of TextFieldWithSupportingText",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextFieldWithSupportingText.route)
                }
            )
            InputTextFieldsCard(
                title = "PasswordTextField",
                subTitle = "example of PasswordTextField",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.PasswordTextField.route)
                }
            )
            InputTextFieldsCard(
                title = "TextArea",
                subTitle = "example of TextArea",
                onClickAction = {
                    navTextFieldController.navigate(Material3TextFieldItem.TextArea.route)
                }
            )
        }
    }
}

@Composable
fun InputTextFieldsCard(title: String, subTitle: String, onClickAction: () -> Unit) {
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