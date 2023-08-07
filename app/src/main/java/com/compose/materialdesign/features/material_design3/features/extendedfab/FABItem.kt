package com.compose.materialdesign.features.material_design3.features.extendedfab

sealed class FABItem(var route: String) {
    object ExtendedFloatingActionButtonSample : FABItem("ExtendedFloatingActionButtonSample")
    object ExtendedFloatingActionButtonTexSample : FABItem("ExtendedFloatingActionButtonTexSample")
    object AnimatedExtendedFloatingActionButtonSample : FABItem("AnimatedExtendedFloatingActionButtonSample")


}
