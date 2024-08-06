package com.akashnavik.algo.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.akashnavik.algo.ui_layer.ScreenAFinal
import com.akashnavik.algo.ui_layer.ScreenBFinal



@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Route.ScreenA) {

        composable(Route.ScreenA) {
            ScreenAFinal(navController)
        }
        composable(Route.ScreenB+"/{name}") {
            backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")?:""
            val navHostController = navController
            ScreenBFinal(name,navHostController)
        }
    }
}