package com.compose.materialdesign.features.material_design3.features.snackbar

sealed class SnackBarItem(var route: String) {
    object ScaffoldWithSimpleSnackBar : SnackBarItem("ScaffoldWithSimpleSnackBar")
    object ScaffoldWithIndefiniteSimpleSnackBar : SnackBarItem("ScaffoldWithIndefiniteSimpleSnackBar")
    object ScaffoldWithCustomSimpleSnackBar : SnackBarItem("ScaffoldWithCustomSimpleSnackBar")
    object ScaffoldWithCoroutineSimpleSnackBar : SnackBarItem("ScaffoldWithCoroutineSimpleSnackBar")
    object ScaffoldWithMultilineSimpleSnackBar : SnackBarItem("ScaffoldWithMultilineSimpleSnackBar")


}