package com.compose.materialdesign.features.material_design3.features.listsItem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.util.ButtonTopAppBar

@Composable
fun OneLineListItemViewScreen(navListsController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // top bar
        ButtonTopAppBar(
            title = "One Line Lists",
            navController = navListsController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            OneLineListsItem()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OneLineListsItem() {
    Column(modifier = Modifier.padding(top = 100.dp)) {
        ListItem(
            headlineText = {
                Text(text = "One line list item with 24x24 icon")
            },
            leadingContent = {
                Icon(
                    Icons.Default.Favorite,
                    contentDescription = "Localized description",
                )
            }
        )
        Divider()
    }
}
