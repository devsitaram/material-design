package com.compose.materialdesign.features.material_design3.features.checkboxes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CheckboxesSamplePreview(onClickAction: ()->Unit = {}) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        val checkedState = remember { mutableStateOf(true) }

        Row {
            Checkbox(
                checked = checkedState.value,
                modifier = Modifier.padding(16.dp).clickable { onClickAction() },
                onCheckedChange = { checkedState.value = it },
            )
        }

    }

}


@Composable
fun CheckboxWithTextSamplePreview() {
    val checkedState = remember { mutableStateOf(true) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Checkbox(
                checked = checkedState.value,

                modifier = Modifier.padding(16.dp),

                onCheckedChange = { checkedState.value = it },
            )
            Text(text = "Option Selection", modifier = Modifier.padding(top = 25.dp))
        }
    }
}


@Composable
fun TriStateCheckboxSamplePreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // define dependent checkboxes states
        val (state, onStateChange) = remember { mutableStateOf(true) }
        val (state2, onStateChange2) = remember { mutableStateOf(true) }

        // TriStateCheckbox state reflects state of dependent checkboxes
        val parentState = remember(state, state2) {
            if (state && state2) androidx.compose.ui.state.ToggleableState.On
            else if (!state && !state2) androidx.compose.ui.state.ToggleableState.Off
            else androidx.compose.ui.state.ToggleableState.Indeterminate
        }
        // click on TriStateCheckbox can set state for dependent checkboxes
        val onParentClick = {
            val s = parentState != androidx.compose.ui.state.ToggleableState.On
            onStateChange(s)
            onStateChange2(s)
        }

        TriStateCheckbox(
            state = parentState,
            onClick = onParentClick,
        )
        Spacer(Modifier.size(15.dp))
        Column(Modifier.padding(10.dp, 0.dp, 0.dp, 0.dp)) {
            Checkbox(state, onStateChange)
            Spacer(Modifier.size(10.dp))
            Checkbox(state2, onStateChange2)
        }
    }
}



