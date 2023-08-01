package com.compose.materialdesign.features.material_design3.features.buttonappbar.appbarscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.material_design3.features.buttonappbar.BottomAppBarFABViewScreen
import com.compose.materialdesign.features.material_design3.features.buttonappbar.SimpleAppBarViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun BottomAppBarViewScreen(navMaterialController: NavHostController) {
    val navBtnTopBarController = rememberNavController()
    NavHost(navController = navBtnTopBarController, startDestination = "MainAppBar") {
        composable("MainAppBar") {
            MainBottomTopBarScreen(navBtnTopBarController, navMaterialController)
        }

        composable(ListOfBottonAppBarItems.SimpleBottomAppBar.route) {
            SimpleAppBarViewScreen(navBtnTopBarController)
        }

        composable(ListOfBottonAppBarItems.BottomAppBarWithFAB.route) {
            BottomAppBarFABViewScreen(navBtnTopBarController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainBottomTopBarScreen(
    navBtnTopBarController: NavHostController,
    navMaterialController: NavHostController
) {
    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
        ) {
            ButtonTopAppBar(
                title = "BottomTop/AppBar",
                navController = navMaterialController
            )
            Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.padding(top = 100.dp))
                // SimpleBottonAppBar
                ListOfDataCard(
                    title = "SimpleBottonAppBar",
                    subTitle = "Example of bottom app bar",
                    onClickAction = {
                        navBtnTopBarController.navigate(ListOfBottonAppBarItems.SimpleBottomAppBar.route)
                    }
                )

                // BottonAppBarFAB
                ListOfDataCard(
                    title = "SimpleBottonAppBarFAB",
                    subTitle = "Bottom app bar with FAB",
                    onClickAction = {
                        navBtnTopBarController.navigate(ListOfBottonAppBarItems.BottomAppBarWithFAB.route)
                    }
                )
            }
        }
    }
}