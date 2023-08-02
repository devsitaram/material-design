package com.compose.materialdesign.features.material_design3.features.text.textscreen

// types of text
sealed class Material3TextItem(var route: String){
    object Heading : Material3TextItem("Heading")
    object NormalText : Material3TextItem("NormalText")
    object InputText : Material3TextItem("InputText")
    object ButtonText: Material3TextItem("ButtonText")
}

//// types of heading text
//sealed class HeadingText(var route: String) {
//    object LargeTitle1 : HeadingText( "Large Title 1")
//    object Title2 : HeadingText("Title 2")
//    object Title3 : HeadingText("Title 3")
//    object Title4 : HeadingText( "Title 4")
//    object Heading : HeadingText( "Heading")
//}
//
//// types of normal text
//sealed class NormalText(var route: String) {
//    object ExtraLarge : NormalText( "Extra Large Text")
//    object LargeTextBold : NormalText("Large Text Bold")
//    object LargeTextSemiBold : NormalText("Large Text SemiBold")
//    object LargeText : NormalText( "Large Text")
//    object RegularTextBold : NormalText( "Regular Text Bold")
//    object RegularTextSemiBold : NormalText("Regular Text SemiBold")
//    object RegularText : NormalText("Regular Text")
//    object SmallTextBold : NormalText( "Small Text Bold")
//    object SmallTextSemiBold : NormalText( "Small Text SemiBold")
//}
//
//// types of input text
//sealed class InputTextFieldTex(var route: String) {
//    object Label : InputTextFieldTex("Label")
//    object InputText : InputTextFieldTex("InputText")
//}
//
//// types of button text
//sealed class ButtonText(var route: String) {
//    object Large : ButtonText( "Large")
//    object Medium : ButtonText("Medium")
//    object Small : ButtonText("Small")
//}