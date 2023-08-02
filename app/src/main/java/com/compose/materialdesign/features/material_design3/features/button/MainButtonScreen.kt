package com.compose.materialdesign.features.material_design3.features.button

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun MainButtonViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ButtonRoute"){
        composable("ButtonRoute"){
            ButtonRoute(navController)
        }
        composable(NavigationItem.Large.route){
            LargeButtonView(navController )

        }
        composable(NavigationItem.Medium.route){
          MediumButtonScreen(navController)
         }

        composable(NavigationItem.Small.route){
         SmallButtonScreenView(navController)
        }

    }

}

@Composable
fun ButtonRoute(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ButtonScreenPreview(
            title = "Large Button",
            onClick = {navController.navigate(NavigationItem.Large.route)}
        )
        ButtonScreenPreview(
            title = "Medium Button",
            onClick = {navController.navigate(NavigationItem.Medium.route)}
        )
        ButtonScreenPreview(title = "Small Button",
            onClick = {navController.navigate(NavigationItem.Small.route)}
        )
    }

}


@Composable
fun ButtonScreenPreview(title: String, onClick: ()-> Unit) {
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