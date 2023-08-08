@file:OptIn(
    ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class,
    ExperimentalLayoutApi::class
)

package com.compose.materialdesign.features.material_design3.features.chips

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Chip
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun AssistChipSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AssistChip(
            onClick = { },
            label = { Text("Assist Chip") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Localized description",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
    }
}


@Composable
fun ElevatedAssistChipSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedAssistChip(
            onClick = { },
            label = { Text("Assist Chip") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Localized description",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )
    }
}


@Composable
fun FilterChipSampleViewScreen() {
    var selected by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
    }
}

@Composable
fun ElevatedFilterChipSampleViewScreen() {
    var selected by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedFilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                null
            }
        )
    }
}


@Composable
fun FilterChipWithLeadingIconSampleViewScreen() {
    var selected by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilterChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Filter chip") },
            leadingIcon = if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            } else {
                {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Localized description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize)
                    )
                }
            }
        )
    }
}


@Composable
fun InputChipSampleViewScreen() {
    var selected by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Input Chip") },
        )
    }
}

@Composable
fun InputChipWithAvatarSampleViewScreen() {
    var selected by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        InputChip(
            selected = selected,
            onClick = { selected = !selected },
            label = { Text("Input Chip") },
            avatar = {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Localized description",
                    Modifier.size(InputChipDefaults.AvatarSize)
                )
            }
        )
    }
}

@Composable
fun SuggestionChipSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SuggestionChip(
            onClick = { },
            label = { Text("Suggestion Chip") }
        )
    }
}

@Composable
fun ElevatedSuggestionChipSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedSuggestionChip(
            onClick = { },
            label = { Text("Suggestion Chip") }
        )
    }
}


@Composable
fun ChipGroupSingleLineSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            repeat(11) { index ->
                Chip(
                    modifier = Modifier.padding(horizontal = 4.dp),
                    onClick = { }) {
                    Text("Chip $index")
                }
            }
        }
    }
}


@Composable
fun ChipGroupReflowSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        FlowRow(
            Modifier
                .fillMaxWidth(1f)
                .wrapContentHeight(align = Alignment.Top),
            horizontalArrangement = Arrangement.Start,
        ) {
            repeat(11) { index ->
                Chip(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .align(alignment = Alignment.CenterVertically),
                    onClick = { }) {
                    Text("Chip $index")
                }
            }
        }
    }
}

