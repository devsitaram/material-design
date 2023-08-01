package com.compose.materialdesign.features.material_design3.features.tooltips.tooltipscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.material_design3.features.tooltips.ManualInnovationTooltipViewScreen
import com.compose.materialdesign.features.material_design3.features.tooltips.ManualInnovationViewScreen
import com.compose.materialdesign.features.material_design3.features.tooltips.RichTooltipViewScreen
import com.compose.materialdesign.features.material_design3.features.tooltips.SimpleTooltipViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun ToolTipsViewScreen(navMaterialController: NavHostController) {
    val navTooltipController = rememberNavController()
    NavHost(navController = navTooltipController, startDestination = "MainTooltips"){
        composable("MainTooltips"){
            MainTooltipsScreen(navMaterialController, navTooltipController)
        }
        composable(ListOfToolTipItems.SimpleTooltip.route){
            SimpleTooltipViewScreen(navTooltipController)
        }
        composable(ListOfToolTipItems.ManualInvocationTooltip.route){
            ManualInnovationTooltipViewScreen(navTooltipController)
        }
        composable(ListOfToolTipItems.RichTooltip.route){
            RichTooltipViewScreen(navTooltipController)
        }
        composable(ListOfToolTipItems.RichTooltipWithManualInvocation.route){
            ManualInnovationViewScreen(navTooltipController)
        }
    }
}

@Composable
fun MainTooltipsScreen(
    navMaterialController: NavHostController,
    navTooltipController: NavHostController
) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
        ) {
            ButtonTopAppBar(
                title = "Tooltips",
                navController = navMaterialController
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // SimpleTooltip
                ListOfDataCard(
                    title = "SimpleTooltip",
                    subTitle = "sample of SimpleTooltip",
                    onClickAction = {
                        navTooltipController.navigate(ListOfToolTipItems.SimpleTooltip.route)
                    }
                )

                ListOfDataCard(
                    title = "ManualInvocationTooltip",
                    subTitle = "sample of ManualInvocation Tooltip",
                    onClickAction = {
                        navTooltipController.navigate(ListOfToolTipItems.ManualInvocationTooltip.route)
                    }
                )
                ListOfDataCard(
                    title = "Rich Tooltip",
                    subTitle = "sample of RichTooltip",
                    onClickAction = {
                        navTooltipController.navigate(ListOfToolTipItems.RichTooltip.route)
                    }
                )
                ListOfDataCard(
                    title = "RichWithManualInvocation",
                    subTitle = "sample of RichWithManualInvocation",
                    onClickAction = {
                        navTooltipController.navigate(ListOfToolTipItems.RichTooltipWithManualInvocation.route)
                    }
                )
            }
        }
    }
}