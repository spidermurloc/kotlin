package com.example.mvvm.View

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mvvm.Navigation.AppsScreens

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar(title = {
            Text(text = "Primer Ventana")
        })
    }) {
        bodyFirstScreen(navController)
    }
}

@Composable
fun bodyFirstScreen(navController: NavController){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxSize())
    {
        Text(text = "Primer pantalla")
        Button(onClick = { navController.navigate(route = AppsScreens.SecondScreen.route + "/Bienvenido") }) {
            Text(text = "Ir a Segunda pantalla")

        }

    }
}

