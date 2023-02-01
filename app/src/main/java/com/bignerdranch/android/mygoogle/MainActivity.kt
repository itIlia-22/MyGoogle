package com.bignerdranch.android.mygoogle

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.mygoogle.ui.theme.MyGoogleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(
                        massage = stringResource(R.string.t),
                        from = stringResource(R.string.i)
                    )
                }
            }
        }
    }


}

@Composable
fun BirthdayGreetingWithText(massage: String, from: String) {
    Column {
        Text(
            text = massage,
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = from,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp, top = 10.dp)

        )
    }

}

@Composable
fun BirthdayGreetingWithImage(massage: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop

        )
        BirthdayGreetingWithText(massage = massage, from = from)
    }


}


@Preview(
    showBackground = true,
    name = "Android"
)
@Composable
fun DefaultPreview() {
    MyGoogleTheme {
        BirthdayGreetingWithText(
            massage = stringResource(R.string.t),
            from = stringResource(R.string.i)
        )
        BirthdayGreetingWithImage(
            massage = stringResource(R.string.t),
            from = stringResource(R.string.i)
        )
    }
}