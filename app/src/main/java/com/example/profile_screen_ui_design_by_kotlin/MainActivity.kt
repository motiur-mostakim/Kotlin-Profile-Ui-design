package com.example.profile_screen_ui_design_by_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile_screen_ui_design_by_kotlin.ui.theme.Profile_screen_ui_design_by_kotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Profile_screen_ui_design_by_kotlinTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ) {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard(modifier: Modifier = Modifier) {
    Box {
        BackgroundImage()
        ProfileBody()
    }
}

@Composable
fun BackgroundImage(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable._738263128658),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
            .height(250.dp),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ProfileBody(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 170.dp)
    ) {
        ProfilePicture()
        HeaderSection()
        Divider()
        ContactInfo()
        Divider()
        ButtonSection()
    }
}

@Composable
fun ProfilePicture(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.drawable._738262645225),
        contentDescription = null,
        modifier = modifier
            .size(150.dp)
            .border(BorderStroke(3.dp, color = Color.Green), CircleShape)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}


@Composable
fun HeaderSection(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Spacer(modifier.height(20.dp))
        Text(text = "Motiur Rahman Mostakim", fontSize = 22.sp)
        Text(
            text = "Jr. Flutter Developer", fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            color = Color(0xFF1C1C1C)
        )
    }
}


@Composable
fun Divider(modifier: Modifier = Modifier) {
    Spacer(modifier.height(20.dp))
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(color = Color.Black)
            .border(
                BorderStroke(1.dp, color = Color.Gray)
            )
    ) { }
}


@Composable
fun ContactInfo(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.Call, contentDescription = null)
            Text(text = "+088 01957-585557",modifier.padding(start = 10.dp))
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.Email, contentDescription = null)
            Text(text = "mdmrmostakim1406204@gmail.com",modifier.padding(start = 10.dp))
        }
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Icon(Icons.Rounded.LocationOn, contentDescription = null)
            Text(text = "Mirpur, Dhaka, Bangladesh",modifier.padding(start = 10.dp))
        }
    }
}


@Composable
fun ButtonSection(modifier: Modifier = Modifier){
    Column (
        modifier =  modifier.fillMaxHeight().wrapContentSize()
    ) {
        Button(modifier = modifier.size(200.dp,50.dp).padding(2.dp),
            shape = RoundedCornerShape(percent = 16),
            onClick = {},
        ) {
            Text(text = "Continue", fontSize = 16.sp)
        }
        Spacer(modifier = modifier.height(10.dp))
        Button(modifier = modifier.size(200.dp,50.dp).padding(2.dp),
            shape = RoundedCornerShape(percent = 16),
            onClick = {},
        ) {
            Text(text = "View Bio", fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}