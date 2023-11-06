package com.example.mvvm.Navigation

sealed class AppsScreens(val route: String) {
    object FirstScreen: AppsScreens(route = "first_screen")
    object SecondScreen: AppsScreens(route = "second_screen")
    object ThirdScreen: AppsScreens(route = "third_screen")
}
