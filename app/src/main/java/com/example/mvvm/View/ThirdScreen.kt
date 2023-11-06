package com.example.mvvm.View


import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
fun ThirdScreen(navController: NavController,text : String?){
    Scaffold (topBar = {
        TopAppBar(title = {
            Row() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Text(text = "Tercera ventana")
            }

        })
    }) {
        bodyThirdScreen(navController,text)
    }
}

@Composable
fun bodyThirdScreen(navController: NavController,text : String?){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())
    {
        Text(text = "Tercera pantalla")
        text?.let {
            Text(it)
        }
        Button(onClick = { navController.navigate(route = AppsScreens.SecondScreen.route + "/Bienvenido") }) {
            Text(text = "Ir a Segunda pantalla")
        }
        Button(onClick = { navController.navigate(route = AppsScreens.ThirdScreen.route + "/Bienvenido") }) {
            Text(text = "Ir a Tercera pantalla")
        }

    }
}