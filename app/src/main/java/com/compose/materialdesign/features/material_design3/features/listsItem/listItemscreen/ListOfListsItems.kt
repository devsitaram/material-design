package com.compose.materialdesign.features.material_design3.features.listsItem.listItemscreen

sealed class ListOfListsItems(var route: String){
    object OneLineListItemOfLists: ListOfListsItems("OneLineListItem")
    object TwoLineListItemOfLists: ListOfListsItems("TwoLineListItem")
    object ThreeLineListItemOfLists: ListOfListsItems("ThreeLineListItem")
}