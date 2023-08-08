package com.compose.materialdesign.features.material_design3.features.searchbar

import android.annotation.SuppressLint
import android.service.autofill.OnClickAction
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.compose.materialdesign.features.util.ButtonTopAppBar

@Composable
fun SimpleSearchBarViewScreen(navSearchBarController: NavHostController) {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // top bar
        ButtonTopAppBar(
            title = "Simple search bar",
            navController = navSearchBarController
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // add the component

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Preview
@Composable
fun MySearchBarScreen() {
    var text by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    val items = remember {
        mutableStateListOf(
            "Google", "YouTube", "Facebook", "Tiktok"
        )
    }
    Scaffold {
        SearchBar(
            query = text,
            onQueryChange = { newText ->
                text = newText
                active = newText.isNotEmpty() // Set active immediately when text is entered
            },
            onSearch = {
                if (!items.contains(text)) { // Check if text is not already in the list
                    items.add(0, text)
                }
                active = true // Set active on search
                text = ""
            },
            active = active,
            onActiveChange = { newActive -> active = newActive },
            placeholder = { Text(text = "Search...") },
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
            trailingIcon = {
                if (active && text.isNotEmpty()) {
                    Icon(
                        modifier = Modifier.clickable {
                            if (text.isNotEmpty()) {
                                text = ""
                            } else {
                                active = false
                            }
                        },
                        imageVector = Icons.Default.Close,
                        contentDescription = null
                    )
                }
            }
        ) {
            if (active) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                ) {
                    items.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                        ) {
                            Row(
                                modifier = Modifier
                                    .wrapContentWidth()
                                    .clickable {
                                        text = item
                                    },
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier.padding(10.dp),
                                    imageVector = Icons.Default.History,
                                    contentDescription = "History Icon"
                                )
                                Text(text = item)
                            }
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .padding(end = 10.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                IconButton(onClick = {
                                    items.remove(item) // Remove the item from the list
                                }) {
                                    Icon(
                                        imageVector = Icons.Default.Close,
                                        contentDescription = null,
                                        modifier = Modifier
                                            .size(20.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: () -> Unit,
    active: Boolean,
    onActiveChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    placeholder: @Composable() (() -> Unit)? = null,
    leadingIcon: @Composable() (() -> Unit)? = null,
    trailingIcon: @Composable() (() -> Unit)? = null,
    content: @Composable() (ColumnScope.() -> Unit),
) {
    val keyboardController = LocalSoftwareKeyboardController.current
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        TextField(
            value = query,
            onValueChange = onQueryChange,
            placeholder = placeholder,
            textStyle = MaterialTheme.typography.body1,
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSearch()
                    keyboardController?.hide() // Hide the keyboard on search
                }
            ),
            readOnly = !enabled,
            singleLine = true,
            maxLines = 1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .clickable { onActiveChange(true) }, // Set search bar as active on click
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon
        )
        content()
    }
}


//@Composable
//fun MySearchBarScreen() {
//    var text by remember { mutableStateOf("") }
//    var active by remember { mutableStateOf(false) }
//    val items = remember {
//        mutableStateListOf(
//            "Google", "YouTube", "Facebook", "Tiktok"
//        )
//    }
//    Scaffold {
//        SearchBar(
//            query = text,
//            onQueryChange = { text = it },
//            onSearch = {
//                items.add(text)
//                active = false
//                text = ""
//            },
//            active = active,
//            onActiveChange = { active = it },
//            placeholder = { Text(text = "Search...") },
//            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
//            trailingIcon = {
//                if (active) {
//                    Icon(
//                        modifier = Modifier.clickable {
//                            if (text.isNotEmpty()) {
//                                text = ""
//                            } else {
//                                active = false
//                            }
//                        },
//                        imageVector = Icons.Default.Close, contentDescription = null
//                    )
//                }
//            }
//        ) {
//            // Your content here
//            items.forEach {
//                Row(modifier = Modifier.padding(15.dp)) {
//                    Icon(
//                        modifier = Modifier.padding(10.dp),
//                        imageVector = Icons.Default.History,
//                        contentDescription = "History Icon"
//                    )
//                    Text(text = it)
//                }
//            }
//        }
//    }
//}
//
//@ExperimentalMaterial3Api
//@Composable
//fun SearchBar(
//    query: String,
//    onQueryChange: (String) -> Unit,
//    onSearch: () -> Unit,
//    active: Boolean,
//    onActiveChange: (Boolean) -> Unit,
//    modifier: Modifier = Modifier,
//    enabled: Boolean = true,
//    placeholder: @Composable (() -> Unit)? = null,
//    leadingIcon: @Composable (() -> Unit)? = null,
//    trailingIcon: @Composable (() -> Unit)? = null,
//    content: @Composable ColumnScope.() -> Unit,
//) {
//    val keyboardController = LocalSoftwareKeyboardController.current
//
//    Column(
//        modifier = modifier.fillMaxWidth(),
//        horizontalAlignment = Alignment.Start
////        contentAlignment = Alignment.CenterStart
//    ) {
//        TextField(
//            value = query,
//            onValueChange = onQueryChange,
//            placeholder = placeholder,
//            textStyle = MaterialTheme.typography.body1,
//            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
//            keyboardActions = KeyboardActions(
//                onSearch = {
//                    onSearch()
//                    keyboardController?.hide() // Hide the keyboard on search
//                }
//            ),
//            readOnly = !enabled,
//            singleLine = true,
//            maxLines = 1,
//            modifier = Modifier.fillMaxWidth().padding(10.dp), // Adjust padding for leading icon
//            leadingIcon = leadingIcon,
//            trailingIcon = trailingIcon
//        )
//    }
//}