package com.compose.materialdesign.features.material_design3.features.listsItem.listItemscreen

sealed class ListsItemsOfListItems(var route: String){
    object OneLineListItem: ListsItemsOfListItems("OneLineListItem")
    object TwoLineListItem: ListsItemsOfListItems("TwoLineListItem")
    object ThreeLineListItem: ListsItemsOfListItems("ThreeLineListItem")
}