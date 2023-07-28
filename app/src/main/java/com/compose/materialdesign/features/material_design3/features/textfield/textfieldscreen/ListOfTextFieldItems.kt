package com.compose.materialdesign.features.material_design3.features.textfield.textfieldscreen

sealed class Material3TextFieldItem(var route: String){
    object SimpleTextField : Material3TextFieldItem("SimpleTextField")
    object TextField : Material3TextFieldItem("SimpleTextField")
    object SimpleOutlineTextField : Material3TextFieldItem("SimpleOutlineTextField")
    object OutlineTextField : Material3TextFieldItem("OutlineTextField")
    object TextFieldWithIcons : Material3TextFieldItem("TextFieldWithIcons")
    object TextFieldWithPlaceholder : Material3TextFieldItem("TextFieldWithPlaceholder")
    object TextFieldWithPrefixAndSuffix : Material3TextFieldItem("TextFieldWithPrefixAndSuffix")
    object TextFieldWithErrorState : Material3TextFieldItem("TextFieldWithErrorState")
    object TextFieldWithSupportingText : Material3TextFieldItem("TextFieldWithSupportingText")
    object PasswordTextField : Material3TextFieldItem("PasswordTextField")
    object TextArea : Material3TextFieldItem("TextArea")
}