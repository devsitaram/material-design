package com.compose.materialdesign.features.material_design3.features.BottomSheet.bottomsheetscreen

sealed class ListOfBottomSheetItems(var route: String){
    object ModelBottomSheets: ListOfBottomSheetItems("ModelBottomSheet")
    object ScaffoldBottomSheets: ListOfBottomSheetItems("ScaffoldBottomSheet")
    object NestedScaffoldBottomSheet: ListOfBottomSheetItems("NestedScaffoldBottomSheet")
}
