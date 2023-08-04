package com.compose.materialdesign.features.material_design3.features.iconbutton

sealed class IconButtonItem(var route: String) {
    object IconButtonSample : IconButtonItem("IconButtonSample")
    object IconToggleButtonSample : IconButtonItem("IconToggleButtonSample")
    object FilledIconButtonSample : IconButtonItem("FilledIconButtonSample")
    object FilledIconToggleButtonSample : IconButtonItem("FilledIconToggleButtonSample")
    object FilledTonalIconButtonSample : IconButtonItem("FilledTonalIconButtonSample")
    object FilledTonalIconToggleButtonSample : IconButtonItem("FilledTonalIconToggleButtonSample")
    object OutlinedIconButtonSample : IconButtonItem("OutlinedIconButtonSample")
    object OutlinedIconToggleButtonSample : IconButtonItem("OutlinedIconToggleButtonSample")



}
