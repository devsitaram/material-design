package com.compose.materialdesign.features.material_design3.features.divider

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.util.RowCardViewItems

@SuppressLint("UnrememberedMutableState")
@Composable
fun MainDividerViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "DividerViewScreen") {
        composable("DividerViewScreen") {
            DividerViewScreen(navController)
        }

        composable(DividerItems.DividerSample.route) {
            DividerSamplePreview()
        }
    }
}

@Composable
fun DividerViewScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        RowCardViewItems(
            title = "Divider Sample",
            onClick = { navController.navigate(DividerItems.DividerSample.route) }
        )
    }
}
