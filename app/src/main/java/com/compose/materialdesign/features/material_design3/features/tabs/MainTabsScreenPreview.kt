package com.compose.materialdesign.features.material_design3.features.tabs

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.TabPosition
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp


@Composable
fun TextTabsScreen() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Home", "About", "Settings")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
//        RegularTextBold(text = "Selected item: ${tabs.getOrNull(tabIndex) ?: ""}", color = Color.Black)

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = " Text Tabs ${tabIndex + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )

    }
}


@Composable
fun IconsTabsScreen() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Home", "About", "Settings")
    val icons = listOf(Icons.Default.Home, Icons.Default.Info, Icons.Default.Settings)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(selectedTabIndex = tabIndex) {
            icons.forEachIndexed { index, title ->
                Tab(
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = "",
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth()
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
//        RegularTextBold(text = "Selected item: ${tabs.getOrNull(tabIndex) ?: "Unknown"}", color = Color.Black)

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = " Icons  Tabs ${tabIndex + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun TextAndIconsTabsScreen() {
    var tabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Home", "About", "Settings")
    val icons = listOf(Icons.Default.Home, Icons.Default.Info, Icons.Default.Settings)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(selectedTabIndex = tabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = icons[index],
                            contentDescription = title,
                            modifier = Modifier.padding(end = 8.dp)
                        )


                        Text(title)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
//        RegularTextBold(text = "Selected item: ${tabs.getOrNull(tabIndex) ?: "Unknown"}", color = Color.Black)
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = " TextAndIcons Tabs ${tabIndex + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun LeadingIconsTabsScreen() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2", "Tab 3 with lots of text")
    val icons = listOf(Icons.Default.Favorite, Icons.Default.Star, Icons.Default.Info)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScrollableTabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                androidx.compose.material.Tab(
                    selected = state == index,
                    onClick = { state = index },
                    text = { Text(text = title, maxLines = 2, overflow = TextOverflow.Ellipsis) },
                    icon = {
                        Icon(
                            imageVector = icons.getOrElse(index) { Icons.Default.Star },
                            contentDescription = null
                        )
                    }
                )
            }
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Text tab ${state + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ScrollingTextTabsScreen() {
    var tabIndex by remember { mutableStateOf(0) }
    val tabs =
        listOf("Tab1", "Tab2", "Tab3", "Tab4", "Tab5", "Tab6", "Tab7", "Tab8", "Tab9", "Tab10")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScrollableTabRow(
            selectedTabIndex = tabIndex,
            modifier = Modifier.padding(end = 16.dp)


        ) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    text = { Text(title) },
                    selected = tabIndex == index,
                    onClick = { tabIndex = index }
                )
            }
        }
        Spacer(modifier = Modifier.padding(top = 20.dp))
//        RegularTextBold(text = "Selected item: ${tabs.getOrNull(tabIndex) ?: ""}", color = Color.Black)

        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Scrolling text tabs ${tabIndex + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )

    }
}

@Composable
fun FancyTab(title: String, onClick: () -> Unit, selected: Boolean) {
    Tab(selected, onClick) {
        Column(
            Modifier
                .padding(10.dp)
                .height(50.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                Modifier
                    .size(10.dp)
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
fun FancyTabsScreen() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2", "Tab 3")
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                FancyTab(
                    title = title,
                    onClick = { state = index },
                    selected = (index == state)
                )
            }
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Fancy tab ${state + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun FancyIndicator(color: Color, modifier: Modifier = Modifier) {

    Box(
        modifier
            .padding(5.dp)
            .fillMaxSize()
            .border(BorderStroke(2.dp, color), RoundedCornerShape(5.dp))
    )
}

@Composable
fun FancyIndicatorTabsScreen() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2", "Tab 3")
    val indicator = @Composable { tabPositions: List<TabPosition> ->
        FancyIndicator(
            MaterialTheme.colorScheme.primary,
            Modifier.tabIndicatorOffset(tabPositions[state])
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(
            selectedTabIndex = state,
            indicator = indicator
        ) {
            titles.forEachIndexed { index, title ->
                Tab(
                    selected = state == index,
                    onClick = { state = index },
                    text = { Text(title) }
                )
            }
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Fancy indicator tab ${state + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun FancyAnimatedIndicator(tabPositions: List<TabPosition>, selectedTabIndex: Int) {
    val colors = listOf(
        MaterialTheme.colorScheme.primary,
        MaterialTheme.colorScheme.secondary,
        MaterialTheme.colorScheme.tertiary,
    )
    val transition = updateTransition(selectedTabIndex, label = "")
    val indicatorStart by transition.animateDp(
        transitionSpec = {

            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 50f)
            } else {
                spring(dampingRatio = 1f, stiffness = 1000f)
            }
        }, label = ""
    ) {
        tabPositions[it].left
    }

    val indicatorEnd by transition.animateDp(
        transitionSpec = {

            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 1000f)
            } else {
                spring(dampingRatio = 1f, stiffness = 50f)
            }
        }, label = ""
    ) {
        tabPositions[it].right
    }

    val indicatorColor by transition.animateColor(label = "") {
        colors[it % colors.size]
    }

    FancyIndicator(
        indicatorColor,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(align = Alignment.BottomStart)
            .offset(x = indicatorStart)
            .width(indicatorEnd - indicatorStart)
    )
}

@Composable
fun FancyIndicatorContainerTabsScreen() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Tab 1", "Tab 2", "Tab 3")

    val indicator = @Composable { tabPositions: List<TabPosition> ->
        FancyAnimatedIndicator(tabPositions = tabPositions, selectedTabIndex = state)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TabRow(
            selectedTabIndex = state,
            indicator = indicator
        ) {
            titles.forEachIndexed { index, title ->
                Tab(
                    selected = state == index,
                    onClick = { state = index },
                    text = { Text(title) }
                )
            }
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Fancy transition tab ${state + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}


@Composable
fun ScrollingFancyAnimatedIndicator(tabPositions: List<TabPosition>, selectedTabIndex: Int) {
    val colors = listOf(
        MaterialTheme.colorScheme.primary,
        MaterialTheme.colorScheme.secondary,
        MaterialTheme.colorScheme.tertiary,
    )
    val transition = updateTransition(selectedTabIndex, label = "")
    val indicatorStart by transition.animateDp(
        transitionSpec = {

            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 50f)
            } else {
                spring(dampingRatio = 1f, stiffness = 1000f)
            }
        }, label = ""
    ) {
        tabPositions[it].left
    }

    val indicatorEnd by transition.animateDp(
        transitionSpec = {

            if (initialState < targetState) {
                spring(dampingRatio = 1f, stiffness = 1000f)
            } else {
                spring(dampingRatio = 1f, stiffness = 50f)
            }
        }, label = ""
    ) {
        tabPositions[it].right
    }

    val indicatorColor by transition.animateColor(label = "") {
        colors[it % colors.size]
    }

    FancyIndicator(
        indicatorColor,
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(align = Alignment.BottomStart)
            .offset(x = indicatorStart)
            .width(indicatorEnd - indicatorStart)
    )
}

@Composable
fun ScrollingFancyIndicatorContainerTabsScreen() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf(
        "Tab 1",
        "Tab 2",
        "Tab 3",
        "Tab 4",
        "Tab 5",
        "Tab 6",
        "Tab 7",
        "Tab 8",
        "Tab 9",
        "Tab 10"
    )

    val indicator = @Composable { tabPositions: List<TabPosition> ->
        FancyAnimatedIndicator(tabPositions = tabPositions, selectedTabIndex = state)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ScrollableTabRow(
            selectedTabIndex = state,
            indicator = indicator
        ) {
            titles.forEachIndexed { index, title ->
                Tab(
                    selected = state == index,
                    onClick = { state = index },
                    text = { Text(title) }
                )
            }
        }
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "Fancy transition tab ${state + 1} selected",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

