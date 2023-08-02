package com.compose.materialdesign.features.material_design3.features.tabs


import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material.Switch
import androidx.compose.material.Tab

import androidx.compose.material3.SwitchDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp


@Composable
fun SwitchSamplePreview() {
    var checked by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Switch(

            modifier = Modifier

//                .border(
//                    border = BorderStroke(2.dp, Color.Gray),
//                    shape = RoundedCornerShape(20.dp))

                .semantics { contentDescription = "Switch" },
            checked = checked,
            onCheckedChange = { checked = it },

        )


    }

}


@Composable
fun FancyTab(title: String, onClick: () -> Unit, selected: Boolean) {
    Tab(selected, onClick) {
        Column(
            Modifier.padding(10.dp).height(50.dp).fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                Modifier.size(10.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(
                        color = if (selected) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.background
                    )
            )
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}


@Composable
fun FancyTabsPreview() {
    Column(Modifier.fillMaxWidth().padding(16.dp)) {
        // Call the FancyTab composable with desired parameters
        FancyTab(title = "Tab 1", onClick = {  }, selected = true)
        FancyTab(title = "Tab 2", onClick = { /* Add your onClick logic here */ }, selected = false)
        FancyTab(title = "Tab 3", onClick = { /* Add your onClick logic here */ }, selected = false)

        // Add more FancyTab calls as needed
    }

}


@Composable
fun Tab(text: String? = null, icon: Image? = null, selected: Boolean, onSelected: () -> Unit) {
    val tint = (MaterialTheme.colorScheme).onPrimary
    when {
        text != null && icon != null -> CombinedTab(text, icon, selected, onSelected, tint)
        text != null -> TextTab(text, selected, onSelected, tint)
        icon != null -> IconTab(icon, selected, onSelected, tint)
        // Nothing provided here (?!), so let's just draw an empty tab that handles clicks
        else -> BaseTab(selected, onSelected, {})
    }
}

