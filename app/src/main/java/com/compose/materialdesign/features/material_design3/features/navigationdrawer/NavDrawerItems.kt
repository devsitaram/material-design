package com.compose.materialdesign.features.material_design3.features.navigationdrawer

sealed class NavDrawerItems(var route: String) {
    object ModalNavigationNavDrawerBarSample : NavDrawerItems("ModalNavigationDrawerBarSample")
    object PermanentNavigationNavDrawerBarSample : NavDrawerItems("PermanentNavigationDrawerBarSample")
    object DismissibleNavigationNavDrawerBarSample : NavDrawerItems("DismissibleNavigationDrawerBarSample")




}




