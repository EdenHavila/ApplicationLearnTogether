package com.example.myapplearntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplearntogether.ui.theme.MyAppLearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppLearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnTogetherGreetingText(
                        message1 = "Jetpack Compose tutorial\n",
                        message2 = "",
                        message3 = "",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogetherGreetingText(message1: String,message2: String,message3: String, modifier: Modifier = Modifier) {

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier

    ){
        Text(
            text = message1,
            fontSize = 26.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)



        )
        Text(
            text = message2,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)

        )
        Text(
            text = message3,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)


        )
    }
}
@Composable
fun LearnTogetherGreetingImage(message1: String,message2: String,message3: String,modifier: Modifier = Modifier) {
    val image= painterResource(R.drawable.bg_compose_background)

    Column {
        Image(
            painter = image,
            contentDescription = "image"
        )
        LearnTogetherGreetingText(
            message1 = message1,
            message2 = message2,
            message3 = message3
        )
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun  MyAppLearnTogetherPreview() {
    MyAppLearnTogetherTheme {
        LearnTogetherGreetingImage(
            message1= stringResource(R.string.message1),
            message2 = stringResource(R.string.message2),
            message3 = stringResource(R.string.message3)

        )
    }
}