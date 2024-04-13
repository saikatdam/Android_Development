package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Home(){
    Box(
  modifier= Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
//        contentAlignment=Alignment.center
    ){
        Text(text = Home.title, Modifier.background(Color.Red))
    }
}