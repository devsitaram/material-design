package com.compose.materialdesign.features.material_design3.features.radiobutton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun RadioButtonView() {
    var radioStat by remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .background(Color.White)
                .padding(top = 50.dp)
        ) {

            val radioOption = listOf("Apple", "Banana")
            radioOption.forEachIndexed { i, option: String ->

                RadioButton(
                    selected = radioStat == i,
                    onClick = { radioStat = i },
                )

                Spacer(modifier = Modifier.size(16.dp))
                Text(option, modifier = Modifier.padding(top = 10.dp, start = 2.dp))
            }
        }
    }
}



