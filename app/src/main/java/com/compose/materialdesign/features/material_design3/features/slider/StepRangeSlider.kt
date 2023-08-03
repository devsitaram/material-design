package com.compose.materialdesign.features.material_design3.features.slider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RangeSlider
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.util.ButtonTopAppBar

@Composable
fun StepRangeSliderViewScreen(navSliderController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // top bar
        ButtonTopAppBar(
            title = "StepRange Slider",
            navController = navSliderController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            StepRangeSliderSample()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun StepRangeSliderSample() {
    var sliderPosition by remember { mutableStateOf(0f..100f) }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        RangeSlider(
            steps = 5,
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..100f,
            onValueChangeFinished = { },
//        colors = SliderDefaults.colors(
//            thumbColor = MaterialTheme.colors.secondary,
//            activeTrackColor = MaterialTheme.colors.secondary
//        )
        )
        Text(text = sliderPosition.toString())
    }
}