package com.compose.materialdesign.features.material_design3.data

sealed class MaterialDesign3Item(var route: String) {
    object Text : MaterialDesign3Item("Text")
    object Button : MaterialDesign3Item("Button")
    object TextField : MaterialDesign3Item("TextField")
    object DialogBox: MaterialDesign3Item("DialogBox")
}

sealed class Buttons(var route: String) {
    object Home : Buttons( "Home")
    object Profile : Buttons("Profile")
    object Message : Buttons("Message")
    object Game : Buttons( "Game")
    object Setting : Buttons( "Setting")
}