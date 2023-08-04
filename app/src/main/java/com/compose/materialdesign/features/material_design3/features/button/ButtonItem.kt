package com.compose.materialdesign.features.material_design3.features.button

sealed class ButtonItem(var route: String) {
    object ButtonSample : ButtonItem("ButtonSample")
    object ElevatedButtonSample : ButtonItem("ElevatedButtonSample")
    object FilledTonalButtonSample : ButtonItem("FilledTonalButtonSample")
    object OutlineButtonSample : ButtonItem("OutlineButtonSample")
    object TextButtonSample : ButtonItem("TextButtonSample")
    object ButtonWithIconButtonSample : ButtonItem("ButtonWithIconButtonSample")

}
