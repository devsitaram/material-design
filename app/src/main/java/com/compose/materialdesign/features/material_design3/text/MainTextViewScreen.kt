package com.compose.materialdesign.features.material_design3.text

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
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.material_item.MaterialDesign3Item

@Composable
fun MainTextViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Font"){
        composable("Font"){
            TextComponent()
        }
        composable(ListOfTextItems.Heading.route){

        }
        composable(ListOfTextItems.Text.route){

        }
        composable(ListOfTextItems.InputText.route){

        }
        composable(ListOfTextItems.ButtonText.route){

        }
    }
}

@Preview
@Composable
fun TextComponent() {
    val navController = rememberNavController()
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
        ) {
            // text components
            MaterialComponents(
                title = "Heading",
            ) { navController.navigate(MaterialDesign3Item.Text.route) }
            // button components

            MaterialComponents(
                title = "Text",
            ) { navController.navigate(MaterialDesign3Item.Button.route) }

            // input text field components
            MaterialComponents(
                title = "InputText",
            ) { navController.navigate(MaterialDesign3Item.TextField.route) }
            // dialog box components

            MaterialComponents(
                title = "Button Text",
            ) { navController.navigate(MaterialDesign3Item.DialogBox.route) }

            // add new component
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaterialComponents(title: String, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
        onClick = onClick
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_text_format),
                contentDescription = null,
                modifier = Modifier.size(70.dp)
            )
            Row(modifier = Modifier.fillMaxWidth()) {
                androidx.compose.material3.Text(
                    text = title,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}
