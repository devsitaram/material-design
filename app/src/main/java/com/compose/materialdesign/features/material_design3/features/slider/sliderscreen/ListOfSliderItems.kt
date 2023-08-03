package com.compose.materialdesign.features.material_design3.features.slider.sliderscreen

sealed class ListOfSliderItems(val route: String){
    object SimpleSlider: ListOfSliderItems("SimpleSlider")
    object StepSlider: ListOfSliderItems("StepSlider")
    object CustomThumbSlider: ListOfSliderItems("CustomThumbSlider")
    object CustomTrackAndThumbSlider: ListOfSliderItems("CustomTrackAndThumbSlider")
    object RangeSlider: ListOfSliderItems("RangeSlider")
    object StepRangeSlider: ListOfSliderItems("StepRangeSlider")
    object RangeWithCustomSlider: ListOfSliderItems("RangeWithCustomSlider")
}
