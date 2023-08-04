package com.compose.materialdesign.features.material_design3.features.button

sealed class NavigationItem(var route: String) {
    object Large : NavigationItem("LButton")
    object Medium : NavigationItem("MButton")
    object Small : NavigationItem("SButton")
}