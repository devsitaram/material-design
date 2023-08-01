package com.compose.materialdesign.features.material_design3.features.tooltips

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Popup
import androidx.navigation.NavHostController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.dialogbox.CustomDialogBox
import com.compose.materialdesign.features.material_design3.features.text.SmallButtonText
import com.compose.materialdesign.features.util.ButtonTopAppBar
import kotlinx.coroutines.delay

@Composable
fun ManualInnovationViewScreen(navTooltipController: NavHostController) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(10.dp),
        ) {
            ButtonTopAppBar(
                title = "Tooltips",
                navController = navTooltipController
            )
            Column(
                modifier = Modifier
                    .fillMaxSize().background(color = Color.Red)
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Spacer(modifier = Modifier.padding(top = 300.dp))
                RichWithManualInnovationTooltip()
            }
        }
    }
}

@Composable
fun RichWithManualInnovationTooltip() {
    var isTooltipVisible by remember { mutableStateOf(false) }
    Box {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Card(
                shape = ShapeDefaults.Medium,
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Icon",
                    tint = Color.White,
                    modifier = Modifier.background(Color.Black)
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            TextButton(
                onClick = { isTooltipVisible = true },
                border = BorderStroke(1.dp, color = colorResource(id = R.color.purple_500)), // primary color)
            ) {
                SmallButtonText(text = "Display tooltip", color = colorResource(id = R.color.purple_500))
            }
        }

        if (isTooltipVisible) {
            RichWithManualTooltipMessage(
                title = "Permissions",
                text = "Configure permissions for selected service accounts. You can add and remove service account member and assign role to them. Visit go/permission for details.",
                backgroundColor = Color.White, // Customize the background color
                contentColor = Color.White, // Customize the text color
                onDismiss = { isTooltipVisible = false }
            )
        }
    }
}

@Composable
fun RichWithManualTooltipMessage(
    title: String,
    text: String,
    backgroundColor: Color,
    contentColor: Color,
    onDismiss: () -> Unit,
) {
    Popup(
        alignment = Alignment.TopCenter,
        offset = IntOffset(0, (-660)), // Adjust the offset to position the tooltip
        onDismissRequest = { onDismiss() }
    ) {
        Box(
            modifier = Modifier
                .padding(bottom = 20.dp)
                .wrapContentSize()
                .background(
                    color = backgroundColor,
                    shape = RoundedCornerShape(corner = CornerSize(5.dp))
                ),
        ) {
            CompositionLocalProvider(
                LocalContentColor provides contentColor
            ) {
                RichWithManualTooltipCustomDialogBox(
                    title = title,
                    text = text,
                    onDismiss = { onDismiss() }
                )
            }
        }
    }
}

@Composable
fun RichWithManualTooltipCustomDialogBox(title: String,text: String, onDismiss: () -> Unit) {
    Card(Modifier.fillMaxWidth().padding(15.dp)) {
        Column(modifier = Modifier.fillMaxWidth().padding(15.dp)) {
            Text(text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                ),
                modifier = Modifier.padding(bottom = 5.dp)
            )
            Text(text = text, fontSize = 14.sp)
            TextButton(
                onClick = { onDismiss() }
            ) {
                Text(text = "Request Access", fontSize = 14.sp)
            }
        }
    }
}