package com.compose.materialdesign.features.material_design3.material_item

sealed class MaterialDesign3Item(var route: String) {
    object Text : MaterialDesign3Item("Text")
    object Button : MaterialDesign3Item("Button")
    object TextField : MaterialDesign3Item("TextField")
    object DialogBox: MaterialDesign3Item("DialogBox")
}