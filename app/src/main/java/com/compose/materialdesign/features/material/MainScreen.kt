package com.compose.materialdesign.features.material

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.compose.materialdesign.features.material_design.MaterialDesign2MainScreen
import com.compose.materialdesign.features.material_design3.mainscreen.MaterialDesign3MainScreen
import com.compose.materialdesign.features.util.ListOfDataCard

@Composable
fun MaterialDesignAppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "Main") {
        // main screen
        composable("Main") {
            MainScreen(navController)
        }

        // material design 3
        composable("MaterialDesign3") {
            MaterialDesign3MainScreen()
        }

        // material design 2
        composable("MaterialDesign") {
            MaterialDesign2MainScreen()
        }
    }
}

@Composable
fun MainScreen(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Compose Material Design",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
            }
            Text(
                text = "Specifications",
                style = TextStyle(fontSize = 15.sp),
                modifier = Modifier.padding(start = 10.dp, top = 50.dp)
            )
            Spacer(modifier = Modifier.padding(top = 15.dp))
            // material design
            ListOfDataCard(
                title = "Material Design 2",
                subTitle = "androidx.compose.material2",
                onClickAction = { navController.navigate("MaterialDesign") }
            )
            // material design 3
            ListOfDataCard(
                title = "Material Design 3",
                subTitle = "androidx.compose.material3",
                onClickAction = { navController.navigate("MaterialDesign3") }
            )
        }
    }
}