package com.compose.materialdesign.features.material_design3.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.compose.materialdesign.R


@Composable
fun SmallButtonScreenView(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, top = 10.dp),
        horizontalAlignment = Alignment.Start,

        ) {


        Text(
            text = "Enabled Small button", style = TextStyle(
                fontWeight = FontWeight.Bold, fontSize = 20.sp,
            ), modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )

        Button(
            onClick = { },
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = true
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }

        OutlinedButton(
            onClick = { },


            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = true
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.teal_700),
                contentColor = Color.Blue
            ),
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = true
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, top = 200.dp),
        horizontalAlignment = Alignment.Start,

        ) {


        Text(
            text = "Disabled Small button", style = TextStyle(
                fontWeight = FontWeight.Bold, fontSize = 20.sp,
            ), modifier = Modifier.padding(start = 10.dp, top = 10.dp)
        )

        Button(
            onClick = { },
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = false
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }

        Button(
            onClick = { },
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = false
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.teal_700),
                contentColor = Color.Blue
            ),
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    start = 10.dp
                )
                .height(32.dp)
                .width(82.dp),
            enabled = false
        ) {
            Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

        }
    }
}