package com.example.deletethisone

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deletethisone.ui.theme.DeleteThisOneTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                    Column(modifier = Modifier
//                        .fillMaxHeight()
//                        .verticalScroll(rememberScrollState())) {
//
//                        repeat(20) {
//
////                                DisplayScreen(itemValue)
//                            Row(modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState()), horizontalArrangement =Arrangement.Center) {
//                                repeat(5) { value ->
//                                    DisplayScreen(value)
//                                }
//                            }
//
//                        }
//                    }
            Column(modifier = Modifier
                .fillMaxHeight()
                .verticalScroll(rememberScrollState())) {

                repeat(20) {

//                                DisplayScreen(itemValue)
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()), horizontalArrangement =Arrangement.Center) {
                        repeat(5) { value ->
                            DisplayScreen(value)
                        }
                    }

                }
            }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  var visible by remember { mutableStateOf(true)
  }
    Column {
        AnimatedVisibility(visible = visible) {
         Text(text = "Hello World")
        }
        Button(onClick = {visible=!visible},shape= RoundedCornerShape(10.dp)) {
        Text(text = "Button")
        }

    }




        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeleteThisOneTheme {
        Greeting("Android")
    }
}
    @Composable
    fun DisplayScreen(count:Int) {
        Card(
            modifier = Modifier.padding(10.dp),

        )
        {
            Text(text = count.toString())
        }

    }