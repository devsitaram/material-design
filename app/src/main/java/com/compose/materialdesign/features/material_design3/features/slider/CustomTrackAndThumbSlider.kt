package com.compose.materialdesign.features.material_design3.features.slider

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
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
fun CustomTrackAndThumbSliderViewScreen(navSliderController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // top bar
        ButtonTopAppBar(
            title = "CustomTrackAndThumb Slider",
            navController = navSliderController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SliderWithCustomTrackAndThumb()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("RememberReturnType")
@Composable
fun SliderWithCustomTrackAndThumb() {
    var sliderPosition by remember { mutableStateOf(0f) } // Corrected the state type to Float
    val interactionSource = remember { MutableInteractionSource() }
    val colors = SliderDefaults.colors(thumbColor = Color.Red, activeTrackColor = Color.Red)

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Slider(
            value = sliderPosition, // Changed 'state' to 'value'
            onValueChange = { sliderPosition = it }, // Added 'onValueChange' to update the value
            interactionSource = interactionSource,
            valueRange = 0f..10f,
            colors = colors,
            thumb = {
                SliderDefaults.Thumb(
                    interactionSource = interactionSource,
                    colors = colors
                )
            },
//            track = {
//                // Draw the custom track using Canvas
//                Canvas(modifier = Modifier.padding(vertical = 8.dp)) {
//                    val trackHeight = 4f
//                    val trackTop = size.height / 2 - trackHeight / 2
//                    drawLine(
//                        color = Color.Gray,
//                        start = Offset(0f, trackTop),
//                        end = Offset(size.width, trackTop),
//                        strokeWidth = trackHeight,
//                        cap = androidx.compose.ui.graphics.drawscope.Stroke.DefaultCap
//                    )
//
//                    val thumbPosition = size.width * (sliderPosition / 10f) // Convert slider position to canvas position
//                    drawLine(
//                        color = Color.Red,
//                        start = Offset(0f, trackTop),
//                        end = Offset(thumbPosition, trackTop),
//                        strokeWidth = trackHeight,
//                        cap = androidx.compose.ui.graphics.drawscope.Stroke.DefaultCap
//                    )
//                }
//            }
        )
        Text(text = sliderPosition.toString())
    }
}