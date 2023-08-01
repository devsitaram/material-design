package com.compose.materialdesign.features.material_design3.features.radiobutton

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
fun GroupButtonView() {
    var radioStat by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val radioOption = listOf("Apple", "Banana" ,"Orange")
        radioOption.forEachIndexed { i, option: String ->
            Row() {
                RadioButton(
                    selected = radioStat == i,
                    onClick = { radioStat = i },
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(option , modifier = Modifier.padding( top = 2.dp))
            }
        }
    }
}



