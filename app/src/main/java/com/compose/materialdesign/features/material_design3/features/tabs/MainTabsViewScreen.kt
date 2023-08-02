package com.compose.materialdesign.features.material_design3.features.tabs

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun MainTabsViewScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "TabsViewScreen") {
        composable("TabsViewScreen") {
            TabsViewScreen(navController)
        }
        composable(TabsItems.TextTabs.route) {
            SwitchSamplePreview()
        }
        composable(TabsItems.IconTabs.route) {
        }
        composable(TabsItems.TextAndIconTabs.route) {
            SwitchSamplePreview()
        }
        composable(TabsItems.LeadingIconTabs.route) {


        }
        composable(TabsItems.ScrollingTextTabs.route) {
            SwitchSamplePreview()
        }
        composable(TabsItems.FancyTabs.route) {
            FancyTabsPreview()
        }

        composable(TabsItems.FancyIndicatorTabs.route) {
            SwitchSamplePreview()
        }

        composable(TabsItems.FancyIndicatorContainerTabs.route) {

        }

        composable(TabsItems.ScrollingFancyIndicatorContainerTabs.route) {

        }

    }
}
        @Composable
        fun TabsViewScreen(navController: NavHostController) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                TabsViewScreenPreview(
                    title = "TextTabs",
                    onClick = { navController.navigate(TabsItems.TextTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "IconTabs",
                    onClick = { navController.navigate(TabsItems.IconTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "TextAndIconTabs",
                    onClick = { navController.navigate(TabsItems.TextAndIconTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "LeadingIconTabs",
                    onClick = { navController.navigate(TabsItems.LeadingIconTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "ScrollingTextTabs",
                    onClick = { navController.navigate(TabsItems.ScrollingTextTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "IconTabs",
                    onClick = { navController.navigate(TabsItems.IconTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "FancyTabs",
                    onClick = { navController.navigate(TabsItems.FancyTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "FancyIndicatorTabs",
                    onClick = { navController.navigate(TabsItems.FancyIndicatorTabs.route) }
                )
                TabsViewScreenPreview(
                    title = "FancyIndicatorContainerTabs",
                    onClick = { navController.navigate(TabsItems.FancyIndicatorContainerTabs.route) }
                )

                TabsViewScreenPreview(
                    title = "ScrollingFancyIndicatorContainerTabs",
                    onClick = { navController.navigate(TabsItems.ScrollingFancyIndicatorContainerTabs.route) }
                )

            }

        }




@Composable
        fun TabsViewScreenPreview(title: String, onClick: () -> Unit) {
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .clickable { onClick() }
                    .border(
                        width = 0.5.dp,
                        color = Color.DarkGray,
                        shape = ShapeDefaults.Small
                    ),
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
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "",
                            modifier = Modifier.padding(15.dp)
                        )
                    }
                }
            }
        }