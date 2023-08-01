package com.compose.materialdesign.features.material_design3.features.radiobutton

sealed class RadioNavigationItem(var route: String) {
    object RadioSimple : RadioNavigationItem("RadioSimple")
    object RadioGroup : RadioNavigationItem("RadioGroup")
}