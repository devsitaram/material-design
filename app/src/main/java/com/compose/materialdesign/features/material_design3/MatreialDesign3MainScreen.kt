package com.compose.materialdesign.features.material_design3

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Card
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.text.textscreen.TextViewScreen
import com.compose.materialdesign.features.material_design3.features.button.ButtonViewScreen
import com.compose.materialdesign.features.material_design3.features.dialogbox.DialogBoxViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.textfieldscreen.TextFieldViewScreen

//@Preview
@Composable
fun MaterialDesign3MainScreen() {
    val navMaterialController = rememberNavController()
    NavHost(navController = navMaterialController, startDestination = "MainScreen"){
        // all material design 3 main screen
        composable("MainScreen"){
            MaterialDesign3MainScree(navMaterialController)
        }

        // texts screen
        composable(MaterialDesign3Item.Text.route){
            TextViewScreen(navMaterialController)
        }

        // buttons screen
        composable(MaterialDesign3Item.Button.route){
            ButtonViewScreen()
        }

        // text fields screen
        composable(MaterialDesign3Item.TextField.route){
            TextFieldViewScreen(navMaterialController)
        }

        // dialog boxes screen
        composable(MaterialDesign3Item.DialogBox.route){
            DialogBoxViewScreen()
        }

        // add new screen

    }
}

@Composable
fun MaterialDesign3MainScree(navMaterialController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            // text components
            MaterialComponents(
                title = "Text",
            ) { navMaterialController.navigate(MaterialDesign3Item.Text.route) }

            // button components
            MaterialComponents(
                title = "Button",
            ) { navMaterialController.navigate(MaterialDesign3Item.Button.route) }

            // input text field components
            MaterialComponents(
                title = "TextField",
            ) { navMaterialController.navigate(MaterialDesign3Item.TextField.route) }

            // dialog box components
            MaterialComponents(
                title = "Dialog Box",
            ) { navMaterialController.navigate(MaterialDesign3Item.DialogBox.route) }

            // add new component

        }
    }
}
@Composable
fun MaterialComponents(title: String, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp).clickable { onClick() }
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_material_design),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = title,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}