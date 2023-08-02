package com.compose.materialdesign.features.material_design3.features.tooltips

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
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
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
import kotlinx.coroutines.delay

@Composable
fun RichTooltipViewScreen(navTooltipController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(10.dp)
        ) {
            ButtonTopAppBar(
                title = "Rich Tooltip",
                navController = navTooltipController
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Spacer(modifier = Modifier.padding(top = 150.dp))
                RichTooltips()
            }
        }
    }
}

@Composable
fun RichTooltips() {
    var isTooltipVisible by remember { mutableStateOf(false) }
    Box {
        IconButton(
            onClick = { isTooltipVisible = true },
            modifier = Modifier.wrapContentSize()
        ) {
            Icon(
                imageVector = Icons.Default.Info,
                contentDescription = "Airplane Icon"
            )
        }

        if (isTooltipVisible) {
            TooltipMessage(
                text = "Rich tooltip",
                backgroundColor = Color.Black, // Customize the background color
                contentColor = Color.White, // Customize the text color
            )
            LaunchedEffect(isTooltipVisible) {
                if (isTooltipVisible) {
                    delay(1000L) // 1 second
                    isTooltipVisible = false
                }
            }
        }
    }
}