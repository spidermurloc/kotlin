package com.example.mvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvm.Navigation.AppNavigation
import com.example.mvvm.ViewModel.MainActivityViewModel
import com.example.mvvm.ui.theme.MVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: MainActivityViewModel = viewModel()
            MVVMTheme {
                Surface {
                    AppNavigation()

                }


            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun testeo (viewModel: MainActivityViewModel) {
    Column() {


        Text(text = viewModel.text)
        TextField(
            value = viewModel.textEditor.value,
            onValueChange = { viewModel.textEditor.value = it })
        Text(text = viewModel.textEditor.value)
        TextField(value = viewModel.Num1.value, onValueChange = { viewModel.Num1.value = it
            viewModel.suma()
            viewModel.resta()})
        TextField(value = viewModel.Num2.value, onValueChange = { viewModel.Num2.value = it
            viewModel.resta()               
            viewModel.suma()})
        Button(onClick = { viewModel.suma() }) {
            Text(text= "+")
        }
        Button(onClick = { viewModel.resta() }) {
            Text(text= "-")
        }
        Text(text = viewModel.resultadoSum.value.toString())
        Text(text = viewModel.resultadoRest.value.toString())

        
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun twitter (viewModel: MainActivityViewModel) {
    Column() {
        Column(modifier = Modifier .background(Color(29,161,242))) {
            Image(painter = painterResource(id = R.drawable.pngaaa_com_615958),
                contentDescription = "")
            TextField(value = viewModel.usuario.value, onValueChange = {viewModel.usuario.value = it})
            TextField(value = viewModel.contra.value, onValueChange = {viewModel.contra.value = it})
        }
    }

    
    
    
    
}