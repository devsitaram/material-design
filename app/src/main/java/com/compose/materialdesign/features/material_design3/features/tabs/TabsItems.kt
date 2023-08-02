package com.compose.materialdesign.features.material_design3.features.tabs

sealed class TabsItems(var route: String) {
    object TextTabs : TabsItems("TextTabs")
    object IconTabs : TabsItems("IconTabs")
    object TextAndIconTabs : TabsItems("TextAndIconTabs")
    object LeadingIconTabs : TabsItems("LeadingIconTabs")
    object ScrollingTextTabs : TabsItems("ScrollingTextTabs")
    object FancyTabs : TabsItems("FancyTabs")

    object FancyIndicatorTabs : TabsItems("FancyIndicatorTabs")
    object FancyIndicatorContainerTabs : TabsItems("FancyIndicatorContainerTabs")
    object ScrollingFancyIndicatorContainerTabs:TabsItems("ScrollingFancyIndicatorContainerTabs")


}




