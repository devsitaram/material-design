package com.compose.materialdesign.features.material_design3.features.extendedfab

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MainExtendedFABViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ExtendedFABRoute"){
        composable("ExtendedFABRoute"){
            ExtendedFABRoute(navController)
        }
        composable(FABItem.ExtendedFloatingActionButtonSample.route){
            FloatingActionButtonSampleViewScreen()

        }
        composable(FABItem.ExtendedFloatingActionButtonTexSample.route){
            FloatingActionButtonTextSampleViewScreen()
         }

        composable(FABItem.AnimatedExtendedFloatingActionButtonSample.route){
            AnimatedExtendedFloatingActionButtonSampleViewScreen()

        }
    }

}

@Composable
fun ExtendedFABRoute(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ExtendedFABPreview(
            title = "ExtendedFloatingActionButtonSample",
            onClick = {navController.navigate(FABItem.ExtendedFloatingActionButtonSample.route)}
        )
        ExtendedFABPreview(
            title = "ExtendedFloatingActionButtonTexSample",
            onClick = {navController.navigate(FABItem.ExtendedFloatingActionButtonTexSample.route)}
        )
        ExtendedFABPreview(title = "AnimatedExtendedFloatingActionButtonSample",
            onClick = {navController.navigate(FABItem.AnimatedExtendedFloatingActionButtonSample.route)}
        )

    }

}

@Composable
fun ExtendedFABPreview(title: String, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.White, shape = ShapeDefaults.Small),
    ) {
        Row(modifier = Modifier
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