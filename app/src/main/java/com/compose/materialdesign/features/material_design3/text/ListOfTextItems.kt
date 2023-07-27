package com.compose.materialdesign.features.material_design3.text

sealed class ListOfTextItems(var route: String){
    object Heading : ListOfTextItems("Heading")
    object Text : ListOfTextItems("Text")
    object InputText : ListOfTextItems("InputText")
    object ButtonText: ListOfTextItems("ButtonText")
}
