package com.compose.materialdesign.features.material_design3.features.menus.menuscreen

sealed class ListOfMenuItems(var route: String) {
    object ManuSample: ListOfMenuItems("ManuSample")
    object MenuWithScrollable: ListOfMenuItems("MenuWithScrollable")
    object ExportDropdownMenu: ListOfMenuItems("ExportDropdownMenu")
    object EditableExportDropdownMenu : ListOfMenuItems("EditableExportDropdownMenu")
}