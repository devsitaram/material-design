package com.compose.materialdesign.features.material_design3.features.navigationbar

sealed class NavigationItems(var route: String) {
    object NavigationBarSample : NavigationItems("NavigationBarSample")
    object NavigationBarSampleWithSelectedLabel : NavigationItems("NavigationBarSampleWithSelectedLabel")



}




