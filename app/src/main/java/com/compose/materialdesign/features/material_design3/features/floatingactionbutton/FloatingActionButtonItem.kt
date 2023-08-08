package com.compose.materialdesign.features.material_design3.features.floatingactionbutton

sealed class FloatingActionButtonItem(var route: String) {
    object FloatingActionButtonSample : FloatingActionButtonItem("FloatingActionButtonSample")
    object LargeFloatingActionButtonSample : FloatingActionButtonItem("LargeFloatingActionButtonSample")
    object SmallFloatingActionButtonSample : FloatingActionButtonItem("SmallFloatingActionButtonSample")


}
