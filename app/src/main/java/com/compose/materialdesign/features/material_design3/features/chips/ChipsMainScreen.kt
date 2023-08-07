package com.compose.materialdesign.features.material_design3.features.chips

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MainChipsViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ChipsViewScreen") {
        composable("ChipsViewScreen") {
            ChipsViewScreen(navController)
        }
        composable(ChipsItem.AssistChipSample.route) {
            AssistChipSampleViewScreen()
        }
        composable(ChipsItem.ElevatedAssistChipSample.route) {
            ElevatedAssistChipSampleViewScreen()
        }

        composable(ChipsItem.FilterChipSample.route) {
            FilterChipSampleViewScreen()
        }

        composable(ChipsItem.ElevatedFilterChipSample.route) {
            ElevatedFilterChipSampleViewScreen()
        }

        composable(ChipsItem.FilterChipWithLeadingIconSample.route) {
            FilterChipWithLeadingIconSampleViewScreen()
        }
        composable(ChipsItem.InputChipSample.route) {
            InputChipSampleViewScreen()
        }
        composable(ChipsItem.InputChipWithAvatarSample.route) {
            InputChipWithAvatarSampleViewScreen()
        }

        composable(ChipsItem.SuggestionChipSample.route) {
            SuggestionChipSampleViewScreen()
        }

        composable(ChipsItem.ElevatedSuggestionChipSample.route) {
            ElevatedSuggestionChipSampleViewScreen()
        }

        composable(ChipsItem.ChipGroupSingleLineSample.route) {
            ChipGroupSingleLineSampleViewScreen()
        }

        composable(ChipsItem.ChipGroupReflowSample.route) {
            ChipGroupReflowSampleViewScreen()
        }

    }
}


@Composable
fun ChipsViewScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ChipsScreenPreview(
            title = "AssistChipSample",
            onClick = { navController.navigate(ChipsItem.AssistChipSample.route) }
        )

        ChipsScreenPreview(
            title = "ElevatedAssistChipSample",
            onClick = { navController.navigate(ChipsItem.ElevatedAssistChipSample.route) }
        )
        ChipsScreenPreview(
            title = "FilterChipSample",
            onClick = { navController.navigate(ChipsItem.FilterChipSample.route) }
        )

        ChipsScreenPreview(
            title = "ElevatedFilterChipSample",
            onClick = { navController.navigate(ChipsItem.ElevatedFilterChipSample.route) }
        )

        ChipsScreenPreview(
            title = "FilterChipWithLeadingIconSample",
            onClick = { navController.navigate(ChipsItem.FilterChipWithLeadingIconSample.route) }
        )
        ChipsScreenPreview(
            title = "InputChipSample",
            onClick = { navController.navigate(ChipsItem.InputChipSample.route) }
        )

        ChipsScreenPreview(
            title = "InputChipWithAvatarSample",
            onClick = { navController.navigate(ChipsItem.InputChipWithAvatarSample.route) }
        )
        ChipsScreenPreview(
            title = "SuggestionChipSample",
            onClick = { navController.navigate(ChipsItem.SuggestionChipSample.route) }
        )

        ChipsScreenPreview(
            title = "ElevatedSuggestionChipSample",
            onClick = { navController.navigate(ChipsItem.ElevatedSuggestionChipSample.route) }
        )

        ChipsScreenPreview(
            title = "ChipGroupSingleLineSample",
            onClick = { navController.navigate(ChipsItem.ChipGroupSingleLineSample.route) }
        )

        ChipsScreenPreview(
            title = "ChipGroupReflowSample",
            onClick = { navController.navigate(ChipsItem.ChipGroupReflowSample.route) }
        )
    }
}


@Composable
fun ChipsScreenPreview(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
        ) {

            Text(
                text = title,
                style = TextStyle(fontSize = 15.sp),
                modifier = Modifier.padding(15.dp)
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}