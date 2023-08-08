package com.compose.materialdesign.features.material_design3.features.searchbar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ListItem
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
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
            SearchBarSample()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarSample() {
    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable{ mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()
            .semantics {  }) { // isTraversalGroup = true
        SearchBar(
            modifier = Modifier.align(Alignment.TopCenter).semantics { }, // traversalIndex = -1f
            query = text,
            onQueryChange = { text = it },
            onSearch = { active = false },
            active = active,
            onActiveChange = { active = it },
            placeholder = { Text(text = "Hinted search text") },
            leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
            trailingIcon = { Icon(Icons.Default.MoreVert, contentDescription = null) },
        ) {
            repeat(4) { idx ->
                val resultText = "Suggestion $idx"
                ListItem(
                    headlineText = { Text(text = resultText)},
                    supportingText = { Text(text = "Additional info")},
                    leadingContent = { Icon(imageVector = Icons.Filled.Star, contentDescription = null)},
                    modifier = Modifier
                        .clickable {
                            text = resultText
                            active = false
                        }
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 4.dp)
                )
            }
        }

        LazyColumn(
            contentPadding = PaddingValues(start = 15.dp, top = 72.dp, end = 15.dp, bottom = 15.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            val list = List(30) { "Text $it" }
            items(count = list.size) {
                Text(list[it],
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@ExperimentalMaterial3Api
@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    onSearch: () -> Unit,
    active: Boolean,
    onActiveChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit,
) {
    val keyboardController = LocalSoftwareKeyboardController.current

    BasicTextField(
        value = query,
        onValueChange = { onQueryChange(it) }, // Fix the assignment here
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
        decorationBox = {
            Box(modifier = Modifier.fillMaxWidth()) {

            }
        }
    )
}