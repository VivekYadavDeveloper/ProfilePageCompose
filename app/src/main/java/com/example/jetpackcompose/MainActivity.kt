package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fontFamily = FontFamily(
            Font(R.font.oswald_medium)
        )
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Cyan)
                    .border(width = 5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(width = 10.dp, Color.Green)
                    .padding(5.dp)
                    .border(15.dp, Color.Red)
                    .padding(50.dp), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val painter = painterResource(id = R.drawable.smart)
                val description = "Smart Boy With Specs"
                val title = "Smart Boy Wear Specs"
                ImageCard(
                    painter = painter, title = title, contentDescription = description
                )
                //*** Spacer(SizedBox) ***//
                Spacer(modifier = Modifier.height(20.dp))
                //*** Title Container(BOX) **//
                Box(
                    modifier = Modifier
                        .height(80.dp)
                        .background(
                            Color(color = 0xFF282C34), shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Text(
                        text = "This is Vivek Yadav Developer",
                        color = Color.White,
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        textAlign = TextAlign.Center
                    )
                }
                Text(text = "Vivek Yadav Developer")
            }

        }
    }
}
//*** Created Function with parameters
//*** painter title contentDescription and modifier
//*** Then Call the Card Widget
//*** Given Shape
//*** After that Call Box(Container) Widget
//*** Now Inside Box Call Image Widget and Pass All The Given Para

@Composable
fun ImageCard(
    painter: Painter, title: String, contentDescription: String, modifier: Modifier = Modifier
) {
    Card(
        modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = 2.dp,
    ) {
        Box(modifier = Modifier.height(300.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
            )

            //*** Creating Gradient Color Call Container(Box)
            //*** Inside Container Call Modifier
            //*** Give Size to Container and Background Para
            //*** Call Brush With Horizontal or Vertical With Color
            //*** With Gradient the color Should be listOF Color


//    ********************* Gradient In Box ************************//
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, Color.Gray
                            ), startY = 300f
                        ),
                    ),
            )
            //    *** Title In Box ***//
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(15.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text(text = title, style = TextStyle(Color.Black, fontSize = 16.sp))
            }
        }
    }
}
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){
//
//
//    /*** ‘ComposeGettingStarted’ is the name of my project so the composable theme function generated for you will start with your project name.**/
//    JetpackComposeTheme() {
//        Greeting(" World")
//
//    }}