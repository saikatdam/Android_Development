package com.example.myapplication
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.material.icons.rounded.NetworkWifi1Bar

//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyApplicationTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android")
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MyApplicationTheme {
//        Greeting("Android")
//    }
//}



import androidx.compose.material.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.ui.unit.sp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            FoodAppTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
////                    Greeting("Android")
////                    Home()
//                    Controller()
//                }
//            }
//        }
//    }
//}
//
//
//@Composable
//fun Controller(){
//   val navController=rememberNavController()
//    Scaffold(
//        bottomBar ={
//            MyBottomNavigation(navController)}) {
//        Box(Modifier.padding(it)) {
//            NavHost(navController = navController, startDestination = Home.route) {
//                composable(Home.route) {
//                    Home()
//                }
//                composable(Menu.route) {
//                    Menu()
//                }
//            }
//        }
//    }
//
//
//
//    }
//
//
//
//@Composable
//fun MyBottomNavigation(navController: NavHostController) {
//    val destination = listOf<dest>(
//        Home,
//        Menu
//    )
//
//
//    val selected_index = rememberSaveable {
//        mutableStateOf(0)
//    }
//
//
////    () {
//        destination.forEachIndexed { index, destinationList ->
//            Column()
////                 = { Text(text = destinationList.title) },
////                icon = @Composable {
////                    Icon(
////                        imageVector = destinationList.icon,
////                        contentDescription = "welcome to my app")
//            {
////                selected = index == selected_index.value,
//           Button(ButtonDefaults.buttonColors(backgroundColor(Color.Green))) {
//                   onClick = {
//                       selected_index.value = index
//                       navController.navigate(destination[index].route) {
//                           popUpTo(Home.route)
//                           launchSingleTop = true
//                       }
//                   }
//               }
//
//                }
//
//
//
//
//        }
//    }
//
////
////@Composable
////fun Greeting(name: String, modifier: Modifier = Modifier) {
////    Text(
////        text = "Hello $name!",
////        modifier = modifier
////    )
////}
////
////@Composable
////fun GreetingPreview() {
////    FoodAppTheme {
////        Greeting("Android")
////    }
////}
////
//

//package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

import androidx.navigation.NavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController) }) {
        Box(Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = Home.route) {
                composable(Home.route) {
                    Home()
                }
                composable(Menu.route) {
                    Menu()
                }
//                composable(Location.route) {
//                    LocationScreen()
//                }
            }
        }
    }
}

@Composable
fun MyBottomNavigation(navController: NavController) {
    val destinationList = listOf(
        Menu,
        Home,

    )

    val selectedIndex = rememberSaveable {
        mutableStateOf(0)
    }


    BottomNavigation() {

        destinationList.forEachIndexed { index, destination ->

                BottomNavigationItem(
                    label = { Text(text = destination.title) },
                    icon = {
                        Icon(imageVector = destination.icon, contentDescription =destination.title)
                    },
                    selected = index==selectedIndex.value,
                    onClick = {
                        selectedIndex.value = index
                        navController.navigate(destinationList[index].route) {
                            popUpTo(Home.route)
                            launchSingleTop = true
                        }

                    }
                )
            }
        }




    }