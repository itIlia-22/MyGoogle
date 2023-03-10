package com.bignerdranch.android.mygoogle.cv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bignerdranch.android.mygoogle.cv.ui.theme.MyGoogleTheme

class MainActivityCv : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposView()
                }
            }
        }
    }
}

@Composable
fun ComposView() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            CardCompos(
                title = "Text composable",
                desc = "Displays text and follows Material Design guidelines.",
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            CardCompos(
                title = "Image composable",
                desc = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color.Red,
                        modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            CardCompos(
                title = "Row composable",
                desc = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )

            CardCompos(
                title = "Column composable",
                desc = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color.Blue,
                modifier = Modifier.weight(1f)
            )

        }
    }

}

@Composable
private fun CardCompos(
    title: String,
    desc: String,
    backgroundColor: androidx.compose.ui.graphics.Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    MyGoogleTheme {
        ComposView()
    }
}