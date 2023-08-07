package com.compose.materialdesign.features.material_design3.features.BottomSheet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.material_design3.features.text.MediumButtonText
import com.compose.materialdesign.features.material_design3.features.textfield.SimpleOutlineTextField
import com.compose.materialdesign.features.util.ButtonTopAppBar
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NestedScaffoldBottomSheetViewScreen(navBtnSheetController: NavHostController) {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()
    Column(Modifier.fillMaxWidth()) {

        // top bar
        ButtonTopAppBar(
            title = "NestedScaffold BottomSheet",
            navController = navBtnSheetController
        )
        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetPeekHeight = 130.dp,
            sheetShape = ShapeDefaults.ExtraLarge,
            sheetContent = {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                ) {
                    // show the bottom sheet's contents
                    EditListItems(
                        onClickAction = {
                            scope.launch {
                                if (scaffoldState.bottomSheetState.isExpanded) {
                                    scaffoldState.bottomSheetState.collapse()
                                } else {
                                    scaffoldState.bottomSheetState.expand()
                                }
                            }
                        }
                    )
                }
            }
        ) { innerPadding ->
            // this is the screen
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize()
                    .padding(innerPadding)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    // make the content
                }
            }
        }
    }
}

@Composable
fun EditListItems(onClickAction: () -> Unit = {}) {

    // Create a new list with 20 duplicates of the original items
    val items = List(20) {
        Pair("Item", Icons.Default.Edit)
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn {
            items(items) { (item, icon) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth().clickable { onClickAction() }
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                ) {
                    Icon(
                        modifier = Modifier.padding(end = 10.dp),
                        imageVector = icon, contentDescription = null
                    )
                    Text(text = item)
                }
            }
        }
    }
}