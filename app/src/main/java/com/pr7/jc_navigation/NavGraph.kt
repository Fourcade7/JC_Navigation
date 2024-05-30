package com.pr7.jc_navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.pr7.jc_navigation.screens.DetailScreen
import com.pr7.jc_navigation.screens.HomeScreen


@Composable
fun NavGraph(navHostController: NavHostController) {

    NavHost(
        navController = navHostController,
        startDestination = Screens.Home.route
    ) {

        composable(route = Screens.Home.route){
            HomeScreen(navHostController)
        }
        composable(
            route = Screens.Detail.route,
            arguments = listOf(
                navArgument(PASS_STRING){ type= NavType.StringType},
                navArgument(PASS_INT){ type= NavType.IntType}
            )
        ){
            val name=it.arguments?.getString(PASS_STRING).toString()
            val id= it.arguments?.getInt(PASS_INT)!!.toInt()
            DetailScreen(navHostController,name=name,id=id)
        }
    }

}