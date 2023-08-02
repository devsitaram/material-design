package com.compose.materialdesign.features.material_design3.features.menus.menuscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.material_design3.features.menus.ListOfMenuItems
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MenusViewScreen(navMaterialController: NavHostController) {
    val navMenuController = rememberNavController()
    NavHost(navController = navMenuController, startDestination = "") {
        composable("") {
            MainMenusScreens(navMaterialController, navMenuController)
        }
        composable(ListOfMenuItems.ManuSample.route) {

        }
        composable(ListOfMenuItems.MenuWithScrollable.route) {

        }
        composable(ListOfMenuItems.ExportDropdownMenu.route) {

        }
        composable(ListOfMenuItems.EditableExportDropdownMenu.route) {

        }
    }

}

@Composable
fun MainMenusScreens(
    navMaterialController: NavHostController,
    navMenuController: NavHostController
) {
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
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ListOfDataCard(
                title = "MenuSample",
                subTitle = "example of Menus",
                onClickAction = {
                    navMenuController.navigate(ListOfMenuItems.ManuSample.route)
                }
            )
        }
    }
}