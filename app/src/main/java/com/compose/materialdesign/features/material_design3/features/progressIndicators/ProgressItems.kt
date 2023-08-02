package com.compose.materialdesign.features.material_design3.features.progressIndicators

sealed class ProgressItems(var route: String) {
    object LinerProgressIndicators : ProgressItems("LinerProgressIndicators")
    object IndeterminateLinerProgressIndicators : ProgressItems("IndeterminateLinerProgressIndicators")
    object CircularProgressIndicators : ProgressItems("CircularProgressIndicators")
    object IndeterminateCircularProgressIndicators : ProgressItems("IndeterminateCircularProgressIndicators")




}




