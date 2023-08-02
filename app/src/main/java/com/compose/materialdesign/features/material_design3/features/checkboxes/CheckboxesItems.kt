package com.compose.materialdesign.features.material_design3.features.checkboxes

sealed class CheckboxesItems(var route: String) {
    object CheckboxesSample : CheckboxesItems("CheckboxesSample")
    object CheckboxWithTextSample : CheckboxesItems("CheckboxWithTextSample")
    object TriStateCheckboxSample : CheckboxesItems("TriStateCheckboxSample")



}




