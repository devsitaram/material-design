package com.compose.materialdesign.features.material_design3.features.menus

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.material_design3.features.text.RegularText
import com.compose.materialdesign.features.material_design3.features.text.RegularTextSemiBold
import com.compose.materialdesign.features.util.ButtonTopAppBar

@Composable
fun SimpleMenusViewScreen(navMenuController: NavHostController) {
    Surface(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Top,
        ) {
            ButtonTopAppBar(
                title = "SimpleMenus",
                navController = navMenuController
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SimpleMenus()
            }
        }
    }
}

@Composable
fun SimpleMenus() {
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
            DropdownMenuItem(onClick = { expanded = false } ) {
                MenusItems(text = "Edit", imageVector = Icons.Default.Edit)
            }
            DropdownMenuItem(onClick = { expanded = false } ) {
                MenusItems(text = "Settings", imageVector = Icons.Default.Settings
                )
            }
            Divider(modifier = Modifier.fillMaxWidth().height(1.dp))
            DropdownMenuItem(onClick = { expanded = false } ) {
                MenusItems(text = "Send Feedback", imageVector = Icons.Default.Email
                )
            }
        }
    }
}

@Composable
fun MenusItems(text: String, imageVector: ImageVector) {
    Row(Modifier.fillMaxWidth()) {
        Icon(imageVector = imageVector, contentDescription = null,
            modifier = Modifier.padding(end = 10.dp)
        )
        RegularTextSemiBold(text = text, color = Color.Black)
    }

}