package com.compose.materialdesign.features.material_design3.features.BottomSheet

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ModalBottomSheetDefaults
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material.rememberBottomSheetScaffoldState
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Card
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.text.MediumButtonText
import com.compose.materialdesign.features.material_design3.features.textfield.SimpleOutlineTextField
import com.compose.materialdesign.features.util.ButtonTopAppBar
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ModelBottomSheetViewScreen(navBtnSheetController: NavHostController) {

    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    // checkbox action
    var checkBoxSkip by remember { mutableStateOf(false) }
    var height by remember { mutableStateOf(false) }

    val onButtonClick: () -> Unit = {
        height = checkBoxSkip
        scope.launch {
            if (scaffoldState.bottomSheetState.isExpanded) {
                scaffoldState.bottomSheetState.collapse()
            } else {
                scaffoldState.bottomSheetState.expand()
            }
        }
    }

    Column(Modifier.fillMaxWidth()) {
        // top bar
        ButtonTopAppBar(
            title = "Model BottomSheet",
            navController = navBtnSheetController
        )
        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetPeekHeight = if (height) 300.dp else 0.dp,
            sheetShape = ShapeDefaults.ExtraLarge,
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.CenterHorizontally),
            sheetContent = {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                ) {
                    CountryList(
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
                Row(
                    Modifier.wrapContentWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(checked = checkBoxSkip, onCheckedChange = { checkBoxSkip = it })
                    Text(text = "Skip, partially expanded State")
                }

                // Action button
                Button(onClick = { onButtonClick() }) {
                    MediumButtonText(text = "Show Bottom Sheet", color = Color.White)
                }
            }
        }
    }
}

@Composable
fun CountryList(onClickAction: () -> Unit = {}) {
    val countries = listOf(
        Pair("Nepal", "\uD83C\uDDF3\uD83C\uDDF5"),
        Pair("United States", "\uD83C\uDDFA\uD83C\uDDF8"),
        Pair("Canada", "\uD83C\uDDE8\uD83C\uDDE6"),
        Pair("India", "\uD83C\uDDEE\uD83C\uDDF3"),
        Pair("Germany", "\uD83C\uDDE9\uD83C\uDDEA"),
        Pair("France", "\uD83C\uDDEB\uD83C\uDDF7"),
        Pair("Japan", "\uD83C\uDDEF\uD83C\uDDF5"),
        Pair("China", "\uD83C\uDDE8\uD83C\uDDF3"),
        Pair("Brazil", "\uD83C\uDDE7\uD83C\uDDF7"),
        Pair("Australia", "\uD83C\uDDE6\uD83C\uDDFA"),
        Pair("Russia", "\uD83C\uDDF7\uD83C\uDDFA"),
        Pair("United Kingdom", "\uD83C\uDDEC\uD83C\uDDE7"),
        Pair("Korea", "\uD83C\uDDF0\uD83C\uDDF7"),
        Pair("Singapore", "\uD83C\uDDF8\uD83C\uDDEC"),
        Pair("Bhutan", "\uD83C\uDDE7\uD83C\uDDF7"),
        Pair("Myanmar", "\uD83C\uDDE6\uD83C\uDDFA"),
        Pair("Pakistan", "\uD83C\uDDF8\uD83C\uDDEC"),
        Pair("Thailand", "\uD83C\uDDF7\uD83C\uDDFA"),
        Pair("Qatar", "\uD83C\uDDF0\uD83C\uDDF7"),
        Pair("Hong Kong", "\uD83C\uDDEC\uD83C\uDDE7"),
        Pair("Sri Lanka", "\uD83C\uDDF1\uD83C\uDDF0"),
        Pair("Norway", "\uD83C\uDDF3\uD83C\uDDF4")
    )
    var textValues by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // hide button
        Button(onClick = { onClickAction() }) {
            MediumButtonText(text = "Hide Bottom Sheet", color = Color.White)
        }
        // text fields
        SimpleOutlineTextField(
            value = textValues,
            onValueChange = { textValues = it },
            label = "Label"
        )
    }

    LazyColumn {
        items(countries) { (country, flag) ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp, horizontal = 20.dp)
            ) {
                Text(
                    text = flag,
                    modifier = Modifier.padding(end = 20.dp)
                )
                Text(text = country)
            }
        }
    }
}