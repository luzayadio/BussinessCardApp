package com.example.bussinesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.text.style.TextAlign
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        modifier = Modifier.fillMaxSize(),
                        "Luzayadio Vila",
                        "Android Developer Extraordinaire",
                        "+351 (915) 020 477",
                        "luzayadio.vila@medicare.co.ao",
                        "@luzayadio.vila"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier,
             fullName: String,
             title: String,
             phone: String,
             email: String,
             social: String,
             ) {

    val image = painterResource(R.drawable.android)
    val greenColor = Color(0xFF016B37)
    val bTextModifier = Modifier.padding(top = 9.dp, bottom = 9.dp)


    Column(
        modifier = modifier.background(Color(0xFFD2E8D3)),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Column(
            modifier = Modifier
                .weight(4f)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .width(110.dp)
                    .height(110.dp),
            )
            Text(fullName,
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
            )
            Text(title,
                fontWeight = FontWeight.Bold,
                color = greenColor
                )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            horizontalArrangement = Arrangement.Center,
            ) {
            Column(modifier = Modifier.padding(end = 15.dp)) {
                Icon(Icons.Rounded.Call,
                    contentDescription = "Phone",
                    modifier = bTextModifier,
                    tint = greenColor,
                    )
                Icon(Icons.Rounded.Share,
                    contentDescription = "Share",
                    modifier = bTextModifier,
                    tint = greenColor,
                    )
                Icon(Icons.Rounded.Email,
                    contentDescription = "Mail",
                    modifier = bTextModifier,
                    tint = greenColor,
                    )
            }

            Column() {
                Text(phone, modifier = bTextModifier,)
                Text(social, modifier = bTextModifier,)
                Text(email, modifier = bTextModifier,)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinessCardAppTheme {
        Greeting(
            modifier = Modifier.fillMaxSize(),
            "Luzayadio Vila",
            "Android Developer Extraordinaire",
            "+351 (915) 020 477",
            "luzayadio.vila@medicare.co.ao",
            "@luzayadio.vila"
        )
    }
}