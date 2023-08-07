package com.compose.materialdesign.features.material_design3.features.searchbar.searchbarscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import com.compose.materialdesign.features.material_design3.features.searchbar.DockedSearchBarViewScreen
import com.compose.materialdesign.features.material_design3.features.searchbar.SearchBarSample
import com.compose.materialdesign.features.material_design3.features.searchbar.SimpleSearchBarViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MainSearchBarViewScreen(navMaterialController: NavHostController) {
    val navSearchBarController = rememberNavController()
    NavHost(navController = navSearchBarController, startDestination  = "MainSearchBarScreen"){
        composable("MainSearchBarScreen"){
            MainSearchBarScreen(navSearchBarController, navMaterialController)
        }
        composable(ListOfSearchbarItems.SimpleSearchBar.route){
            SearchBarSample()
//            SimpleSearchBarViewScreen(navSearchBarController)
        }
        composable(ListOfSearchbarItems.DockedSearchBar.route){
            DockedSearchBarViewScreen(navSearchBarController)
        }
    }
}

@Composable
fun MainSearchBarScreen(
    navSearchBarController: NavHostController,
    navMaterialController: NavHostController
) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ButtonTopAppBar(
            title = "Lists Items",
            navController = navMaterialController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Lists
            ListOfDataCard(
                title = "Simple Search Bar",
                subTitle = "example of SimpleSearchBar",
                onClickAction = {
                    navSearchBarController.navigate(ListOfSearchbarItems.SimpleSearchBar.route)
                }
            )
            ListOfDataCard(
                title = "Docked Search Bar",
                subTitle = "example of DockedSearchBar",
                onClickAction = {
                    navSearchBarController.navigate(ListOfSearchbarItems.DockedSearchBar.route)
                }
            )
        }
    }
}
