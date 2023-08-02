package com.compose.materialdesign.features.material_design3.features.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.material_design3.features.menus.menuscreen.MenusItemList
import com.compose.materialdesign.features.material_design3.features.text.RegularTextSemiBold
import com.compose.materialdesign.features.util.ButtonTopAppBar

@Composable
fun MenuWithScrollableViewScreen(navMenuController: NavHostController) {
    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
        ) {
            ButtonTopAppBar(
                title = "MenuWithScrollable",
                navController = navMenuController
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MenusWithScrollable()
            }
        }
    }
}

@Composable
fun MenusWithScrollable() {
    val menuItemsList = mutableListOf<MenusItemList>()
    menuItemsList.add(MenusItemList("Items 1", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 2", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 3", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 4", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 5", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 6", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 7", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 8", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 9", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 10", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 11", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 12", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 13", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 14", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 15", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 16", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 17", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 18", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 19", icon = Icons.Default.Edit))
    menuItemsList.add(MenusItemList("Items 20", icon = Icons.Default.Edit))

    var expanded by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentSize(Alignment.TopStart)
    ) {
        IconButton(onClick = { expanded = !expanded }) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "More"
            )
        }

        // dropdown menu and inside have more item
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            menuItemsList.forEach { 
                DropdownMenuItem(onClick = { expanded = false }) {
                    ScrollableMenusItems(text = it.title, imageVector = it.icon)
                }
            }
        }
    }
}

@Composable
fun ScrollableMenusItems(text: String, imageVector: ImageVector) {
    Row(Modifier.fillMaxWidth()) {
        Icon(imageVector = imageVector, contentDescription = null,
            modifier = Modifier.padding(end = 10.dp)
        )
        RegularTextSemiBold(text = text, color = Color.Black)
    }
}