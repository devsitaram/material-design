package com.compose.materialdesign.features.material_design3.features.buttonappbar.appbarscreen

sealed class ListOfBottonAppBarItems(var route: String){
    object SimpleBottomAppBar: ListOfBottonAppBarItems("SimpleBottomAppBar")
    object BottomAppBarWithFAB: ListOfBottonAppBarItems("BottomAppBarWithFAB")
}
