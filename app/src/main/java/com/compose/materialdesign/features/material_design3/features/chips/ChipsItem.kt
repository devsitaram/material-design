package com.compose.materialdesign.features.material_design3.features.chips

sealed class ChipsItem(var route: String) {
    object AssistChipSample : ChipsItem("AssistChipSample")
    object ElevatedAssistChipSample : ChipsItem("ElevatedAssistChipSample")
    object FilterChipSample : ChipsItem("FilterChipSample")
    object ElevatedFilterChipSample : ChipsItem("ElevatedFilterChipSample")
    object FilterChipWithLeadingIconSample : ChipsItem("FilterChipWithLeadingIconSample")
    object InputChipSample : ChipsItem("InputChipSample")
    object InputChipWithAvatarSample : ChipsItem("InputChipWithAvatarSample")
    object SuggestionChipSample : ChipsItem("SuggestionChipSample")
    object ElevatedSuggestionChipSample : ChipsItem("ElevatedSuggestionChipSample")
    object ChipGroupSingleLineSample : ChipsItem("ChipGroupSingleLineSample")
    object ChipGroupReflowSample : ChipsItem("ChipGroupReflowSample")
}