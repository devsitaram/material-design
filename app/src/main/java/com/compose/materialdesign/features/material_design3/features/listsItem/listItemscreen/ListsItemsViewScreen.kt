package com.compose.materialdesign.features.material_design3.features.listsItem.listItemscreen

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
import com.compose.materialdesign.features.material_design3.features.listsItem.OneLineListItemViewScreen
import com.compose.materialdesign.features.material_design3.features.listsItem.ThreeLineListItemViewScreen
import com.compose.materialdesign.features.material_design3.features.listsItem.TwoLineListItemViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MainListItemsViewScreen(navMaterialController: NavHostController) {
    val navListsController = rememberNavController()
    NavHost(navController = navListsController, startDestination = "MainListScreen"){
        composable("MainListScreen"){
            MainListItemScreen(navListsController, navMaterialController)
        }
        composable(ListsItemsOfListItems.OneLineListItem.route){
            OneLineListItemViewScreen(navListsController)
        }
        composable(ListsItemsOfListItems.TwoLineListItem.route){
            TwoLineListItemViewScreen(navListsController)
        }
        composable(ListsItemsOfListItems.ThreeLineListItem.route){
            ThreeLineListItemViewScreen(navListsController)
        }
    }
}

@Composable
fun MainListItemScreen(
    navListsController: NavHostController,
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
                title = "OneLine ListItem",
                subTitle = "example of Single line list",
                onClickAction = {
                    navListsController.navigate(ListsItemsOfListItems.OneLineListItem.route)
                }
            )
            ListOfDataCard(
                title = "TwoLine ListItem",
                subTitle = "example of Double line list",
                onClickAction = {
                    navListsController.navigate(ListsItemsOfListItems.TwoLineListItem.route)
                }
            )
            ListOfDataCard(
                title = "ThreeLine ListItem",
                subTitle = "example of Tribal line list",
                onClickAction = {
                    navListsController.navigate(ListsItemsOfListItems.ThreeLineListItem.route)
                }
            )
        }
    }
}
