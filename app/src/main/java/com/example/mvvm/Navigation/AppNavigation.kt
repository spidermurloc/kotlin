package com.example.mvvm.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.View.FirstScreen
import com.example.mvvm.View.SecondScreen
import com.example.mvvm.View.ThirdScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppsScreens.FirstScreen.route) {
        composable(route = AppsScreens.FirstScreen.route){
            FirstScreen(navController = navController)
        }
        composable(route = AppsScreens.SecondScreen.route + "/{text}", arguments = listOf(
            navArgument(name = "text"){
                type = NavType.StringType
            }
        )){
            SecondScreen(navController = navController, it.arguments?.getString("text"))
        }
        composable(route = AppsScreens.ThirdScreen.route + "/{text}", arguments = listOf(
            navArgument(name = "text"){
                type = NavType.StringType
        }
        )){
            ThirdScreen(navController = navController, it.arguments?.getString( "text"))

    }
    }
}