package com.compose.materialdesign.features.material_design3

import MainCardScreen
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.compose.materialdesign.features.material_design3.features.badge.MainBadgeScreen
import com.compose.materialdesign.features.material_design3.features.button.MainButtonScreen
import com.compose.materialdesign.features.material_design3.features.checkboxes.MainCheckBoxScreen
import com.compose.materialdesign.features.material_design3.features.navigationbar.MainNavigationScreen
import com.compose.materialdesign.features.material_design3.features.progressIndicators.MainIndicatorsScreen
import com.compose.materialdesign.features.material_design3.features.radiobutton.MainRadioButtonScreen
import com.compose.materialdesign.features.material_design3.features.switches.MainSwitchScreen

//@Preview
@Composable

fun MaterialDesign3MainScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainScreen"){
        // all material design 3 main screen
        composable("MainScreen"){
            MaterialDesign3MainScree(navController)
        }
        composable(MaterialDesign3Item.Badge.route) {
            MainBadgeScreen()

        }
        // texts screen
        composable(MaterialDesign3Item.Text.route){

        }
        // buttons screen
        composable(MaterialDesign3Item.Button.route){
                      MainButtonScreen()
        }
        // text fields screen
        composable(MaterialDesign3Item.TextField.route){

        }
        // dialog boxes screen
        composable(MaterialDesign3Item.DialogBox.route){

        }

        composable(MaterialDesign3Item.RadioButton.route){
            MainRadioButtonScreen()

        }
        composable(MaterialDesign3Item.Card.route){
            MainCardScreen()
        }

        composable(MaterialDesign3Item.Switches.route){
            MainSwitchScreen()
        }

        composable(MaterialDesign3Item.CheckBoxes.route){
            MainCheckBoxScreen()
        }

        composable(MaterialDesign3Item.ProgressIndicators.route){
            MainIndicatorsScreen()
        }

        composable(MaterialDesign3Item.NavigationBar.route){
            MainNavigationScreen()
        }
        // add new screen
    }
}

@Composable
fun MaterialDesign3MainScree(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .verticalScroll(rememberScrollState())
        ) {
            MaterialComponents(
                title = "Badge",
            ) { navController.navigate(MaterialDesign3Item.Badge.route) }

            // text components
            MaterialComponents(
                title = "Text",
            ) { navController.navigate(MaterialDesign3Item.Text.route) }
            // button components
            MaterialComponents(
                title = "Button",
            ) { navController.navigate(MaterialDesign3Item.Button.route) }
            // input text field components
            MaterialComponents(
                title = "TextField",
            ) { navController.navigate(MaterialDesign3Item.TextField.route) }
            // dialog box components
            MaterialComponents(
                title = "Dialog Box",
            ) { navController.navigate(MaterialDesign3Item.DialogBox.route) }

            MaterialComponents(title = "Radio Button" ,
            ) {navController.navigate(MaterialDesign3Item.RadioButton.route)}

            MaterialComponents(title = "Cards" ,
            ) {navController.navigate(MaterialDesign3Item.Card.route)}

            MaterialComponents(title = "Switches" ,
            ) {navController.navigate(MaterialDesign3Item.Switches.route)}

            MaterialComponents(title = "CheckBoxes" ,
            ) {navController.navigate(MaterialDesign3Item.CheckBoxes.route)}

            MaterialComponents(title = "Progress Indicators" ,
            ) {navController.navigate(MaterialDesign3Item.ProgressIndicators.route)}

            MaterialComponents(title = "Navigation Bar" ,
            ) {navController.navigate(MaterialDesign3Item.NavigationBar.route)}

            // add new component

        }
    }
}


@Composable
fun MaterialComponents(title: String, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.White, shape = ShapeDefaults.Small),
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