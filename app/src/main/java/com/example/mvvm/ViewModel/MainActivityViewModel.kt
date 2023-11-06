package com.example.mvvm.ViewModel


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var text: String = "Hola View Model"
    var textEditor  = mutableStateOf("")

    var Num1 = mutableStateOf("0")
    var Num2 = mutableStateOf("0")
    var resultadoSum = mutableStateOf(0)
    var resultadoRest = mutableStateOf(0)


    fun suma() {
        if (!Num1.value.isEmpty() && !Num2.value.isEmpty()) {resultadoSum.value = Num1.value.toInt()+Num2.value.toInt()}

    }

    fun resta() {
        if (!Num1.value.isEmpty() && !Num2.value.isEmpty()){resultadoRest.value =Num1.value.toInt()-Num2.value.toInt()}
    }
    var usuario = mutableStateOf("")
    var contra = mutableStateOf("")
}

