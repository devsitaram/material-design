package com.compose.materialdesign.features.material_design3.features.tooltips

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.text.SmallButtonText
import com.compose.materialdesign.features.util.ButtonTopAppBar
import kotlinx.coroutines.delay

@Composable
fun ManualInnovationTooltipViewScreen(navTooltipController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
        ) {
            ButtonTopAppBar (
                title = "ManualInnovation",
                navController = navTooltipController
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Spacer(modifier = Modifier.padding(top = 200.dp))
                ManualInnovationTooltip()
            }
        }
    }
}

@Composable
fun ManualInnovationTooltip() {
    var isTooltipVisible by remember { mutableStateOf(false) }
    Box {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Card(
                shape = ShapeDefaults.Medium,
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Icon",
                    tint = Color.White,
                    modifier = Modifier.background(Color.Black)
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            TextButton(
                onClick = { isTooltipVisible = true },
                border = BorderStroke(1.dp, color = colorResource(id = R.color.purple_500)), // primary color)
            ) {
                SmallButtonText(text = "Display tooltip", color = colorResource(id = R.color.purple_500))
            }
        }

        if (isTooltipVisible) {
            TooltipMessage(
                text = "Add to list",
                backgroundColor = Color.Black, // Customize the background color
                contentColor = Color.White, // Customize the text color
            )

            // Automatically dismiss the tooltip after the specified duration
            LaunchedEffect(isTooltipVisible) {
                if (isTooltipVisible) {
                    delay(1000L) // 1 second
                    isTooltipVisible = false
                }
            }
        }
    }
}


