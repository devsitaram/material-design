package com.compose.materialdesign.features.material_design3.features.iconbutton

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
fun MainIconButtonViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "IconButtonRoute"){
        composable("IconButtonRoute"){
            IconButtonRoute(navController)
        }
        composable(IconButtonItem.IconButtonSample.route){
            IconButtonSampleViewScreen()

        }
        composable(IconButtonItem.IconToggleButtonSample.route){
            IconToggleButtonSampleViewScreen()
         }

        composable(IconButtonItem.FilledIconButtonSample.route){
            FilledIconButtonSampleViewScreen()
        }

        composable(IconButtonItem.FilledIconToggleButtonSample.route){

            FilledIconToggleButtonSampleViewScreen()
        }

        composable(IconButtonItem.FilledTonalIconButtonSample.route){
            FilledTonalIconButtonSampleViewScreen()
        }

        composable(IconButtonItem.OutlinedIconButtonSample.route){
            OutlinedIconButtonSampleViewScreen()
        }

        composable(IconButtonItem.OutlinedIconToggleButtonSample.route){
          OutlinedIconToggleButtonSampleViewScreen()
        }
    }

}

@Composable
fun IconButtonRoute(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        IconButtonPreview(
            title = "IconButtonSample",
            onClick = {navController.navigate(IconButtonItem.IconButtonSample.route)}
        )
        IconButtonPreview(
            title = "IconToggleButtonSample",
            onClick = {navController.navigate(IconButtonItem.IconToggleButtonSample.route)}
        )
        IconButtonPreview(title = "FilledIconButtonSample",
            onClick = {navController.navigate(IconButtonItem.FilledIconButtonSample.route)}
        )

        IconButtonPreview(
            title = "FilledIconToggleButtonSample",
            onClick = {navController.navigate(IconButtonItem.FilledIconToggleButtonSample.route)}
        )
        IconButtonPreview(
            title = "FilledTonalIconButtonSample",
            onClick = {navController.navigate(IconButtonItem.FilledTonalIconButtonSample.route)}
        )
        IconButtonPreview(
            title = "OutlinedIconButtonSample",
            onClick = {navController.navigate(IconButtonItem.OutlinedIconButtonSample.route)}
        )
        IconButtonPreview(title = "OutlinedIconToggleButtonSample",
            onClick = {navController.navigate(IconButtonItem.OutlinedIconToggleButtonSample.route)}
        )


    }

}

@Composable
fun IconButtonPreview(title: String, onClick: ()-> Unit) {
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