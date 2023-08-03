package com.compose.materialdesign.features.util

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TopAppBar
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonTopAppBar(title: String, navController: NavHostController) {
    TopAppBar(
        title = { Text(text = title, fontSize = 20.sp, fontWeight = FontWeight.Normal) },
        navigationIcon = {
            IconButton(
                onClick = {
                    navController.navigateUp()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = null,
                    modifier = Modifier.size(30.dp)
                )
            }
        },
        modifier = Modifier.wrapContentHeight()
    )
}
@Composable
fun ListOfDataCard(title: String, subTitle: String, onClickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClickAction() }
            .border(width = 0.5.dp, color = Color.LightGray, shape = ShapeDefaults.Small),
    ) {
        Row(
            modifier = Modifier
                .background(Color.White)
                .padding(15.dp)
                .fillMaxWidth()
                .width(IntrinsicSize.Max), // Set the width to the maximum intrinsic width
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Column {
                Text(
                    text = title,
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                )
                Text(
                    text = subTitle,
                    style = TextStyle(fontSize = 12.sp),
                    modifier = Modifier.padding(top = 5.dp)
                )
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }
    }
}

@Composable
fun RowCardViewItems(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.DarkGray, shape = ShapeDefaults.Small),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp),
        ) {
            Text(
                text = title,
                style = TextStyle(fontSize = 15.sp),
                modifier = Modifier.padding(15.dp)
            )
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}