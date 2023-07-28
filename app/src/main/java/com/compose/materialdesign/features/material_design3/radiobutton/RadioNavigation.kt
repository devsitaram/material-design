package com.compose.materialdesign.features.material_design3.radiobutton

sealed class RadioNavigationItem(var route: String) {
    object RadioSimple : RadioNavigationItem("RadioSimple")
    object RadioGroup : RadioNavigationItem("RadioSimple")
}