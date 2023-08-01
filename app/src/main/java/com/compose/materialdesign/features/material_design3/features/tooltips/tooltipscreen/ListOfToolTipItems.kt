package com.compose.materialdesign.features.material_design3.features.tooltips.tooltipscreen

sealed class ListOfToolTipItems(var route: String){
    object SimpleTooltip: ListOfToolTipItems("SimpleTooltip")
    object ManualInvocationTooltip: ListOfToolTipItems("ManualInvocationTooltip")
    object RichTooltip: ListOfToolTipItems("RichTooltip")
    object RichTooltipWithManualInvocation: ListOfToolTipItems("RichTooltipWithManualInvocation")
}
