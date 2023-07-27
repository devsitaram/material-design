package com.compose.materialdesign.features.material_design3.features.text.textscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Surface
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.text.ButtonTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.HeadingTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.InputTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.NormalTextViewScreen

@Composable
fun MainTextViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "MainTextScreen") {
        // main screen for types of text
        composable("MainTextScreen") {
            TextComponent(navController)
        }

        // heading text screen
        composable(MaterialDesign3TextItem.Heading.route) {
            HeadingTextViewScreen(navController)
        }

        // normal text screen
        composable(MaterialDesign3TextItem.NormalText.route) {
            NormalTextViewScreen()
        }

        // inout text screen
        composable(MaterialDesign3TextItem.InputText.route) {
            InputTextViewScreen()
        }

        // button text screen
        composable(MaterialDesign3TextItem.ButtonText.route) {
            ButtonTextViewScreen()
        }
    }
}

@Composable
fun TextComponent(navController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            // heading text components
            Material3TextComponents(
                title = "Heading",
                onClick = {navController.navigate(MaterialDesign3TextItem.Heading.route)}
            )
            // normal text components
            Material3TextComponents(
                title = "Normal Text",
                onClick =  { navController.navigate(MaterialDesign3TextItem.NormalText.route) }
            )

            // input text components
            Material3TextComponents(
                title = "InputText",
                onClick = { navController.navigate(MaterialDesign3TextItem.InputText.route) }
            )
            // Button Text components
            Material3TextComponents(
                title = "Button Text",
                onClick = { navController.navigate(MaterialDesign3TextItem.ButtonText.route) }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Material3TextComponents(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_text_format),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )
            Text(
                text = title,
                style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal),
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}
