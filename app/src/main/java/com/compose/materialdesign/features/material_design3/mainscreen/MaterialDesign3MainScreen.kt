package com.compose.materialdesign.features.material_design3.mainscreen

import MainCardViewScreen
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
import androidx.compose.material3.Card
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.badge.MainBadgeViewScreen
import com.compose.materialdesign.features.material_design3.features.button.MainButtonViewScreen
import com.compose.materialdesign.features.material_design3.features.buttonappbar.appbarscreen.MainBottomAppBarViewScreen
import com.compose.materialdesign.features.material_design3.features.checkboxes.MainCheckBoxViewScreen
import com.compose.materialdesign.features.material_design3.features.dialogbox.MainDialogBoxViewScreen
import com.compose.materialdesign.features.material_design3.features.divider.MainDividerViewScreen
import com.compose.materialdesign.features.material_design3.features.menus.menuscreen.MainMenusViewScreen
import com.compose.materialdesign.features.material_design3.features.navigationbar.MainNavigationViewScreen
import com.compose.materialdesign.features.material_design3.features.progressIndicators.MainIndicatorsViewScreen
import com.compose.materialdesign.features.material_design3.features.radiobutton.MainRadioButtonViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.sliderscreen.MainSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.switches.MainSwitchViewScreen
import com.compose.materialdesign.features.material_design3.features.text.textscreen.MainTextViewScreen
import com.compose.materialdesign.features.material_design3.features.textfield.textfieldscreen.MainTextFieldViewScreen
import com.compose.materialdesign.features.material_design3.features.tooltips.tooltipscreen.MainToolTipsViewScreen

@Composable
fun MaterialDesign3MainScreen() {
    val navMaterialController = rememberNavController()
    NavHost(navController = navMaterialController, startDestination = "MainScreen") {
        // all material design 3 main screen
        composable("MainScreen") {
            MaterialDesign3MainScree(navMaterialController)
        }

        // texts screen
        composable(MaterialDesign3Item.Badge.route) {
            MainBadgeViewScreen()
        }

        // texts screen
        composable(MaterialDesign3Item.Text.route) {
            MainTextViewScreen(navMaterialController)
        }

        // buttons screen
        composable(MaterialDesign3Item.Button.route) {
            MainButtonViewScreen()
        }

        // text fields screen
        composable(MaterialDesign3Item.TextField.route) {
            MainTextFieldViewScreen(navMaterialController)
        }

        // dialog boxes screen
        composable(MaterialDesign3Item.DialogBox.route) {
            MainDialogBoxViewScreen(navMaterialController)
        }

        // BottomTopBar screen
        composable(MaterialDesign3Item.BottomAppBar.route) {
            MainBottomAppBarViewScreen(navMaterialController)
        }

        // tooltips screen
        composable(MaterialDesign3Item.ToolTips.route) {
            MainToolTipsViewScreen(navMaterialController)
        }

        // menus
        composable(MaterialDesign3Item.Menus.route) {
            MainMenusViewScreen(navMaterialController)
        }

        composable(MaterialDesign3Item.RadioButton.route){
            MainRadioButtonViewScreen()
        }

        composable(MaterialDesign3Item.Badge.route){
            MainBadgeViewScreen()
        }

        composable(MaterialDesign3Item.Card.route){
            MainCardViewScreen()
        }

        composable(MaterialDesign3Item.Switches.route){
            MainSwitchViewScreen()
        }

        composable(MaterialDesign3Item.CheckBoxes.route){
            MainCheckBoxViewScreen()
        }

        composable(MaterialDesign3Item.ProgressIndicators.route){
            MainIndicatorsViewScreen()
        }

        composable(MaterialDesign3Item.NavigationBar.route){
            MainNavigationViewScreen()
        }

        composable(MaterialDesign3Item.Divider.route){
            MainDividerViewScreen()
        }

        composable(MaterialDesign3Item.Slider.route){
            MainSliderViewScreen(navMaterialController)
        }
    }
}

@Composable
fun MaterialDesign3MainScree(navMaterialController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(10.dp)
        ) {
            MaterialComponents(title = "Badge",
            ) { navMaterialController.navigate(MaterialDesign3Item.Badge.route) }

            // text components
            MaterialComponents(title = "Text",
            ) { navMaterialController.navigate(MaterialDesign3Item.Text.route) }

            // button components
            MaterialComponents(title = "Button",
            ) { navMaterialController.navigate(MaterialDesign3Item.Button.route) }

            // input text field components
            MaterialComponents(title = "TextField",
            ) { navMaterialController.navigate(MaterialDesign3Item.TextField.route) }

            // dialog box components
            MaterialComponents(title = "Dialog Box",
            ) { navMaterialController.navigate(MaterialDesign3Item.DialogBox.route) }

            MaterialComponents(title = "BottomTop/AppBar",
            ) { navMaterialController.navigate(MaterialDesign3Item.BottomAppBar.route) }

            MaterialComponents(title = "Tooltips",
            ) { navMaterialController.navigate(MaterialDesign3Item.ToolTips.route) }

            MaterialComponents(
                title = "Menus",
            ) { navMaterialController.navigate(MaterialDesign3Item.Menus.route) }

            MaterialComponents(
                title = "Radio Button",
            ) { navMaterialController.navigate(MaterialDesign3Item.RadioButton.route) }

            MaterialComponents(
                title = "Card",
            ) { navMaterialController.navigate(MaterialDesign3Item.Card.route) }

            MaterialComponents(
                title = "Switches",
            ) { navMaterialController.navigate(MaterialDesign3Item.Switches.route) }

            MaterialComponents(
                title = "Progress Indicators",
            ) { navMaterialController.navigate(MaterialDesign3Item.ProgressIndicators.route) }

            MaterialComponents(
                title = "Navigation Bar",
            ) { navMaterialController.navigate(MaterialDesign3Item.NavigationBar.route) }

            MaterialComponents(title = "Menus",
            ) { navMaterialController.navigate(MaterialDesign3Item.Menus.route) }

            MaterialComponents(title = "Radio Button" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.RadioButton.route)}

            MaterialComponents(title = "Cards" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.Card.route)}

            MaterialComponents(title = "Switches" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.Switches.route)}

            MaterialComponents(title = "CheckBoxes" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.CheckBoxes.route)}

            MaterialComponents(title = "Progress Indicators" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.ProgressIndicators.route)}

            MaterialComponents(title = "Navigation Bar" ,
            ) {navMaterialController.navigate(MaterialDesign3Item.NavigationBar.route)}

             MaterialComponents(title = "Divider") {
                navMaterialController.navigate(MaterialDesign3Item.Divider.route)
             }

            MaterialComponents(title = "Slider") {
                navMaterialController.navigate(MaterialDesign3Item.Slider.route)
            }
            // add new component
        }
    }
}

@Composable
fun MaterialComponents(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
    ) {
        Column(
            modifier = Modifier
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