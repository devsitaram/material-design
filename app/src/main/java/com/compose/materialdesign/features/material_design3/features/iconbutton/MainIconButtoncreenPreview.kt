package com.compose.materialdesign.features.material_design3.features.iconbutton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.material3.*
import androidx.compose.ui.Alignment


@Composable
fun IconButtonSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(onClick = { }) {
            Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
        }
    }
}

@Composable
fun IconToggleButtonSampleViewScreen() {
    var checked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
            if (checked) {
                Icon(Icons.Filled.Lock, contentDescription = "Localized description")
            } else {
                Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
            }
        }
    }
}

@Composable
fun FilledIconButtonSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilledIconButton(onClick = { }) {
            Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
        }
    }
}

@Composable
fun FilledIconToggleButtonSampleViewScreen() {
    var checked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilledIconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
            if (checked) {
                Icon(Icons.Filled.Lock, contentDescription = "Localized description")
            } else {
                Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
            }
        }
    }
}


@Composable
fun FilledTonalIconButtonSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FilledTonalIconButton(onClick = { }) {
            Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
        }
    }
}

@Composable
fun OutlinedIconButtonSampleViewScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedIconButton(onClick = { }) {
            Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
        }
    }
}


@Composable
fun OutlinedIconToggleButtonSampleViewScreen() {
    var checked by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedIconToggleButton(checked = checked, onCheckedChange = { checked = it }) {
            if (checked) {
                Icon(Icons.Filled.Lock, contentDescription = "Localized description")
            } else {
                Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
            }
        }
    }
}

