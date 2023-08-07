package com.compose.materialdesign.features.material_design3.features.searchbar.searchbarscreen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun MainSearchBarViewScreen() {
    val navSearchBarController = rememberNavController()
    NavHost(navController = navSearchBarController, startDestination  = ""){

    }
}