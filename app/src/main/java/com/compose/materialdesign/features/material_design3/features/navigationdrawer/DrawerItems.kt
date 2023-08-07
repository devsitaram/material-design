package com.compose.materialdesign.features.material_design3.features.navigationdrawer

sealed class DrawerItems(var route: String) {
    object ModalNavigationDrawerBarSample : DrawerItems("ModalNavigationDrawerBarSample")
    object PermanentNavigationDrawerBarSample : DrawerItems("PermanentNavigationDrawerBarSample")
    object DismissibleNavigationDrawerBarSample : DrawerItems("DismissibleNavigationDrawerBarSample")




}




