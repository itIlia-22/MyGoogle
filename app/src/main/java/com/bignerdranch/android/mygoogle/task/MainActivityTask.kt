package com.bignerdranch.android.mygoogle.task

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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.mygoogle.R
import com.bignerdranch.android.mygoogle.task.ui.theme.MyGoogleTheme

class MainActivityTask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGoogleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ImageInfo(
                        headerText = stringResource(R.string.hedar),
                        infoText1 = stringResource(R.string.sInfo),
                        infoText2 = stringResource(R.string.infos)
                    )
                }
            }
        }
    }
}

@Composable
fun TextInfo(headerText: String, infoText1: String, infoText2: String) {
    Column {
        Text(
            text = headerText,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)

        )
        Text(
            text = infoText1,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp),


            )
        Text(
            text = infoText2,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
        )
    }

}


@Composable
fun ImageInfo(headerText: String, infoText1: String, infoText2: String) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column {


        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()

        )
        TextInfo(headerText = headerText, infoText1 = infoText1, infoText2 = infoText2)
    }

}

@Preview(showBackground = true)

@Composable
fun DefaultPreview2() {
    MyGoogleTheme {
        ImageInfo(
            headerText = stringResource(R.string.hedar),
            infoText1 = stringResource(R.string.sInfo),
            infoText2 = stringResource(
                id = R.string.infos
            )
        )
    }
}