package com.compose.materialdesign.features.material_design3.features.floatingactionbutton

sealed class FloatingABItem(var route: String) {
    object FloatingActionButtonSample : FloatingABItem("FloatingActionButtonSample")
    object LargeFloatingActionButtonSample : FloatingABItem("LargeFloatingActionButtonSample")
    object SmallFloatingActionButtonSample : FloatingABItem("SmallFloatingActionButtonSample")


}
