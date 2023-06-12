package com.example.myapp

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting()
        }
    }
}



@Composable
fun Greeting() {

    Column(
        modifier = Modifier
            .fillMaxSize()
           // .fillMaxWidth()
            //.fillMaxHeight()
            .background(Color.LightGray),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Text(
            "Hello!",
            fontSize = 60.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
//          fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            "Derek Mochama",
            modifier = Modifier.background(Color.Green),
            letterSpacing = 0.2.em,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = "How are you doing today?",
            textDecoration = TextDecoration.Underline,
            fontSize = 25.sp,
            color = Color.Blue,
            fontWeight = FontWeight.Bold,

        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "This looks like a very lovely day",
            color = Color.Black,
            fontFamily = FontFamily.Serif,
            fontSize = 22.sp,
            modifier = Modifier.background(color = Color.Red),
            textDecoration = TextDecoration.Underline,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.height(30.dp))


        Text(text = "Have a lovely day!",
            fontSize = 45.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.background(color = Color.Yellow)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Greeting()

}