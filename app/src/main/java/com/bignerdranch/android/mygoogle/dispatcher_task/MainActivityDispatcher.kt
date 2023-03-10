package com.bignerdranch.android.mygoogle.dispatcher_task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.mygoogle.R
import com.bignerdranch.android.mygoogle.dispatcher_task.ui.theme.MyGoogleTheme

class MainActivityDispatcher : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DispatcherText()
                }
            }
        }
    }
}

@Composable
fun DispatcherText() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {

        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(id = R.string.all),
            modifier = Modifier
                .padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = stringResource(id = R.string.nice),


            fontSize = 16.sp
        )

    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    MyGoogleTheme {
        DispatcherText()
    }
}