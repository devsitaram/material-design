package com.compose.materialdesign.features.material_design3

sealed class MaterialDesign3Item(var route: String) {
    object Badge: MaterialDesign3Item("Badge")
    object Text : MaterialDesign3Item("Text")
    object Button : MaterialDesign3Item("Button")
    object TextField : MaterialDesign3Item("TextField")
    object DialogBox: MaterialDesign3Item("DialogBox")
    object RadioButton: MaterialDesign3Item("RadioButton")
    object Card: MaterialDesign3Item("Card")
    object Switches: MaterialDesign3Item("Switches")
    object CheckBoxes: MaterialDesign3Item("CheckBoxes")
     object ProgressIndicators: MaterialDesign3Item("ProgressIndicators")
    object  NavigationBar: MaterialDesign3Item("NavigationBar")
    object BottomAppBar: MaterialDesign3Item("BottomAppBar")
    object ToolTips: MaterialDesign3Item("ToolTips")
    object Menus: MaterialDesign3Item("menus")

}
