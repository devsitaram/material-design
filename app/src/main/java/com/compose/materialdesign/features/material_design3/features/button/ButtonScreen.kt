package com.compose.materialdesign.features.material_design3.features.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.compose.materialdesign.R

@Composable
fun ButtonViewScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 10.dp, top = 10.dp),
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
                onClick = { },
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))
            }

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = Color.Blue
                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

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
                    .height(48.dp)
                    .width(106.dp),
                enabled = true
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Text(
                text = "Enabled Medium button", style = TextStyle(
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
                    .height(40.dp)
                    .width(98.dp),
                enabled = true
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = Color.Blue
                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(40.dp)
                    .width(98.dp),
                enabled = true
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

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
                    .height(40.dp)
                    .width(98.dp),
                enabled = true
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }


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

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
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

        //Disabled

        Column(
            modifier = Modifier
                .fillMaxSize()

                .padding(start = 10.dp, top = 50.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Disabled Large button", style = TextStyle(
                    fontWeight = FontWeight.Bold, fontSize = 20.sp,
                )
            )

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = Color.Blue
                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(48.dp)
                    .width(106.dp),
                enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

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
                    .height(48.dp)
                    .width(106.dp),
                enabled = false
            ) {
                Text(text = "Large", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Text(
                text = "Enabled Medium button", style = TextStyle(
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
                    .height(40.dp)
                    .width(98.dp),
                enabled = false
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
                    contentColor = Color.Blue
                ),
                modifier = Modifier
                    .padding(
                        top = 10.dp,
                        start = 10.dp
                    )
                    .height(40.dp)
                    .width(98.dp),
                enabled = false
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

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
                    .height(40.dp)
                    .width(98.dp),
                enabled = false
            ) {
                Text(text = "Medium", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }


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
                enabled = false
            ) {
                Text(text = "small", style = TextStyle(fontWeight = FontWeight.SemiBold))

            }

            Button(
                onClick = { },
                border = BorderStroke(1.dp, Color.Blue),
                shape = RoundedCornerShape(50),
                colors = ButtonDefaults.buttonColors(
                    colorResource(id = R.color.white),
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
}