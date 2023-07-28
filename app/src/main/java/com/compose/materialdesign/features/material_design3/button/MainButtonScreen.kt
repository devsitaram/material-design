package com.compose.materialdesign.features.material_design3.button

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
fun MainButtonScreen() {
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
        CardView(
            title = "Large Button",
            onClickAction = {navController.navigate(NavigationItem.Large.route)}
        )
        CardView(
            title = "Medium Button",
            onClickAction = {navController.navigate(NavigationItem.Medium.route)}
        )
        CardView(title = "Small Button",
            onClickAction = {navController.navigate(NavigationItem.Small.route)}
        )
    }

}


@Composable
fun CardView(title: String, onClickAction: ()-> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .width(100.dp)
            .padding(5.dp),
    ) {
        Column(Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = title,
                    style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Normal ),
                    modifier = Modifier.width(140.dp)
                )
                Spacer(modifier = Modifier.width(150.dp))
                Image(
                    imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier
                        .clickable { onClickAction() }
                        .width(50.dp)
                        .height(50.dp)
                )
            }
        }
    }
}