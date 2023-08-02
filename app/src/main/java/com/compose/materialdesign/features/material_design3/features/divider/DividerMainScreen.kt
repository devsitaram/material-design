package com.compose.materialdesign.features.material_design3.features.divider

import android.annotation.SuppressLint
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.features.util.RowCardViewItems


@SuppressLint("UnrememberedMutableState")
@Composable
fun MainDividerViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "CheckBoxesViewScreen") {
        composable("CheckBoxesViewScreen") {
            DividerViewScreen(navController)
        }
        composable(DividerItems.DividerSample.route) {
//            DividerSamplePreview()
            val searchTextState by remember { mutableStateOf(TextFieldValue()) }
          SearchView(
            modifier = Modifier,
            state = mutableStateOf(searchTextState))
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