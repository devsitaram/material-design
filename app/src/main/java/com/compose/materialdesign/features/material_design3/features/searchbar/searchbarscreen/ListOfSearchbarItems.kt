package com.compose.materialdesign.features.material_design3.features.searchbar.searchbarscreen

sealed class ListOfSearchbarItems(val route: String){
    object SimpleSearchBar: ListOfSearchbarItems("SimpleSearchBar")
    object DockedSearchBar: ListOfSearchbarItems("DockedSearchBar")
}
