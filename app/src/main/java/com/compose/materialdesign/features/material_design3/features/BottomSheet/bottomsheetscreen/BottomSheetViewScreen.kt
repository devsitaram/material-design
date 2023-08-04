package com.compose.materialdesign.features.material_design3.features.BottomSheet.bottomsheetscreen

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
import com.compose.materialdesign.features.material_design3.features.BottomSheet.ModelBottomSheetViewScreen
import com.compose.materialdesign.features.material_design3.features.BottomSheet.NestedScaffoldBottomSheetViewScreen
import com.compose.materialdesign.features.material_design3.features.BottomSheet.ScaffoldBottomSheetViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MainBottomSheetViewScreen(navMaterialController: NavHostController) {
    val navBtnSheetController = rememberNavController()
    NavHost(navController = navBtnSheetController, startDestination = "BottomSheetViewScreen") {
        composable("BottomSheetViewScreen") {
            BottomSheetViewScreen(navBtnSheetController, navMaterialController)
        }

        composable(ListOfBottomSheetItems.ModelBottomSheets.route) {
            ModelBottomSheetViewScreen(navBtnSheetController)
        }

        composable(ListOfBottomSheetItems.ScaffoldBottomSheets.route) {
            ScaffoldBottomSheetViewScreen(navBtnSheetController)
        }

        composable(ListOfBottomSheetItems.NestedScaffoldBottomSheet.route) {
            NestedScaffoldBottomSheetViewScreen(navBtnSheetController)
        }
    }
}

@Composable
fun BottomSheetViewScreen(
    navBtnSheetController: NavHostController,
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
            title = "Bottom Sheets",
            navController = navMaterialController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ListOfDataCard(
                title = "Model BottomSheet",
                subTitle = "example of Model BottomSheet",
                onClickAction = {
                    navBtnSheetController.navigate(ListOfBottomSheetItems.ModelBottomSheets.route)
                }
            )
            ListOfDataCard(
                title = "Scaffold BottomSheet",
                subTitle = "example of Scaffold BottomSheet",
                onClickAction = {
                    navBtnSheetController.navigate(ListOfBottomSheetItems.ScaffoldBottomSheets.route)
                }
            )
            ListOfDataCard(
                title = "NestedScaffoldBottomSheet",
                subTitle = "example of NestedScaffoldBottomSheet",
                onClickAction = {
                    navBtnSheetController.navigate(ListOfBottomSheetItems.NestedScaffoldBottomSheet.route)
                }
            )
        }
    }
}
