package com.compose.materialdesign.features.material_design3.features.slider.sliderscreen

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
import com.compose.materialdesign.features.material_design3.features.slider.CustomThumbSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.CustomTrackAndThumbSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.RangeSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.RangeWithCustomSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.SimpleSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.StepRangeSliderViewScreen
import com.compose.materialdesign.features.material_design3.features.slider.StepSliderViewScreen
import com.compose.materialdesign.features.util.ButtonTopAppBar
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MainSliderViewScreen(navMaterialController: NavHostController) {
    val navSliderController = rememberNavController()
    NavHost(navController = navSliderController, startDestination = "MainSliderScreen") {
        composable("MainSliderScreen") {
            MainSliderScreen(navSliderController, navMaterialController)
        }

        composable(ListOfSliderItems.SimpleSlider.route) {
            SimpleSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.StepSlider.route) {
            StepSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.CustomThumbSlider.route) {
            CustomThumbSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.CustomTrackAndThumbSlider.route) {
            CustomTrackAndThumbSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.RangeSlider.route) {
            RangeSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.StepRangeSlider.route) {
            StepRangeSliderViewScreen(navSliderController)
        }

        composable(ListOfSliderItems.RangeWithCustomSlider.route) {
            RangeWithCustomSliderViewScreen(navSliderController)
        }
    }
}

@Composable
fun MainSliderScreen(
    navSliderController: NavHostController,
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
            title = "Input TextFields",
            navController = navMaterialController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // SimpleTextField
            ListOfDataCard(
                title = "SimpleSlider",
                subTitle = "example of SimpleSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.SimpleSlider.route)
                }
            )
            ListOfDataCard(
                title = "StepSlider",
                subTitle = "example of StepSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.StepSlider.route)
                }
            )
            ListOfDataCard(
                title = "CustomThumbSlider",
                subTitle = "example of CustomThumbSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.CustomThumbSlider.route)
                }
            )
            ListOfDataCard(
                title = "CustomTrackAndThumbSlider",
                subTitle = "example of CustomTrackAndThumbSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.CustomTrackAndThumbSlider.route)
                }
            )
            ListOfDataCard(
                title = "RangeSlider",
                subTitle = "example of RangeSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.RangeSlider.route)
                }
            )
            ListOfDataCard(
                title = "StepRangeSlider",
                subTitle = "example of StepRangeSlider",
                onClickAction = {
                    navSliderController.navigate(ListOfSliderItems.StepRangeSlider.route)
                }
            )
            ListOfDataCard(
                title = "RangeWithCustomSlider",
                subTitle = "example of RangeWithCustomSlider",
                onClickAction = {navSliderController.navigate(ListOfSliderItems.RangeWithCustomSlider.route)}
            )
        }
    }
}