package com.compose.materialdesign.features.material_design3.features.text.textscreen

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.text.ButtonTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.HeadingTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.InputTextViewScreen
import com.compose.materialdesign.features.material_design3.features.text.NormalTextViewScreen

@Composable
fun TextViewScreen(navMaterialController: NavHostController) {
    val navTextController = rememberNavController()
    NavHost(navController = navTextController, startDestination = "MainTextScreen") {
        // main screen for types of text
        composable("MainTextScreen") {
            MainTextScreen(navTextController, navMaterialController)
        }

        // heading text screen
        composable(Material3TextItem.Heading.route) {
            HeadingTextViewScreen(navTextController)
        }

        // normal text screen
        composable(Material3TextItem.NormalText.route) {
            NormalTextViewScreen(navTextController)
        }

        // inout text screen
        composable(Material3TextItem.InputText.route) {
            InputTextViewScreen(navTextController)
        }

        // button text screen
        composable(Material3TextItem.ButtonText.route) {
            ButtonTextViewScreen(navTextController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTextScreen(navTextController: NavHostController, navMaterialController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(
                rememberScrollState()
            ),
    ) {
        // top bar
        TopAppBar(
            title = { Text(text = "Texts") },
            navigationIcon = {
                IconButton(onClick = { navMaterialController.navigateUp() }) {
                    Icon(
                        imageVector = Icons.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        )
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            // heading text components
            Material3TextComponents(
                title = "Heading",
                onClick = { navTextController.navigate(Material3TextItem.Heading.route) }
            )
            // normal text components
            Material3TextComponents(
                title = "Normal Text",
                onClick = { navTextController.navigate(Material3TextItem.NormalText.route) }
            )

            // input text components
            Material3TextComponents(
                title = "InputText",
                onClick = { navTextController.navigate(Material3TextItem.InputText.route) }
            )
            // Button Text components
            Material3TextComponents(
                title = "Button Text",
                onClick = { navTextController.navigate(Material3TextItem.ButtonText.route) }
            )
        }
    }
}

@Composable
fun Material3TextComponents(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp).clickable { onClick() }
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
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
                modifier = Modifier
                    .size(70.dp)
                    .padding(10.dp)
            )
            Text(
                text = title,
                style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Normal),
                modifier = Modifier.padding(15.dp)
            )
        }
    }
}


// text description
@Composable
fun TextDescription(
    text: String,
    fontSize: String,
    fontWeight: String,
    color: String,
    lineHeight: String
) {
    Text(
        text = "In this text, have used the following styles: Text: '$text', FontSize: '$fontSize', FontWeight: '$fontWeight', Color: '$color', and LineHeight: '$lineHeight'.",
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp, bottom = 5.dp),
        style = TextStyle(
            textAlign = TextAlign.Justify
        )
    )
    Spacer(modifier = Modifier.height(25.dp))
}