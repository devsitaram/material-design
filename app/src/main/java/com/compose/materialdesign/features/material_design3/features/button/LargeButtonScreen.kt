package com.compose.materialdesign.features.material_design3.features.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.compose.materialdesign.R

@Composable
fun LargeButtonView(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 30.dp, top = 30.dp),
        horizontalAlignment = Alignment.Start,

        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, top = 10.dp),
            horizontalAlignment = Alignment.Start,

            ) {
            Text(
                text = "Enabled Large button", style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,
                )
            )

            Button(
                onClick = { }, modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp), enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            OutlinedButton(
                onClick = { },
//                border = BorderStroke(1.dp, Color.Blue),
//                shape = RoundedCornerShape(50),
//                colors = ButtonDefaults.buttonColors(
//                    colorResource(id = R.color.white), contentColor = Color.Blue
//                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }


            Button(
                onClick = { }, colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.teal_700), contentColor = Color.Blue
                ), modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp), enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }
        }

        Button(onClick = {  } , modifier = Modifier.wrapContentWidth() ) {

            Icon(imageVector = Icons.Default.Favorite, contentDescription = "" ,
                modifier = Modifier.size(ButtonDefaults.IconSize))
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSize))
            Text(text = "Click me")
        }


    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 30.dp, top = 280.dp),
        horizontalAlignment = Alignment.Start,

        ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, top = 10.dp),
            horizontalAlignment = Alignment.Start,

            ) {
            Text(
                text = "Disabled Large button", style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,
                )
            )

            Button(
                onClick = { }, modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp), enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            OutlinedButton(
                onClick = { },
//                border = BorderStroke(1.dp, Color.Blue),
//                shape = RoundedCornerShape(50),
//                colors = ButtonDefaults.buttonColors(
//                    colorResource(id = R.color.white), contentColor = Color.Blue
//                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }


            Button(
                onClick = { }, colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.teal_700), contentColor = Color.Blue
                ), modifier = Modifier
                    .padding(
                        top = 10.dp, start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp), enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

        }
    }
}