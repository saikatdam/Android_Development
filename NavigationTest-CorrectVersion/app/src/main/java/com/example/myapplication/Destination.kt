package com.example.myapplication


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

interface dest{
    val route:String
    val title:String
    val icon:ImageVector
}

object Home:dest {

    override val route = "Home"
    override val title = "Home Screen"
    override val icon = Icons.Filled.Home
}
object Menu:dest {

    override val route = "Menu"
    override val title = "Menu Screen"
    override val icon = Icons.Filled.Menu
}
