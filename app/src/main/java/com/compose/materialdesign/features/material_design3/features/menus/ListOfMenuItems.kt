package com.compose.materialdesign.features.material_design3.features.menus

sealed class ListOfMenuItems(var route: String) {
    object ManuSample: ListOfMenuItems("ManuSample")
    object MenuWithScrollable: ListOfMenuItems("MenuWithScrollable")
    object ExportDropdownMenu: ListOfMenuItems("MenuWithScrollable")
    object EditableExportDropdownMenu : ListOfMenuItems("MenuWithScrollable")
}