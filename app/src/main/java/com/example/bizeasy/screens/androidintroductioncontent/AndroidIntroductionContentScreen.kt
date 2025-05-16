package com.example.bizeasy.screens.androidintroductioncontent



import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AndroidIntroductionContentsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Introduction to Android Development)") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Ah, Android! It's the operating system that powers a huge chunk of the smartphones and tablets out there. Think of it as the software backbone that makes your device smart.\n" +
                        "\n" +
                        "At its core, Android is built on top of the Linux kernel, which provides the fundamental system-level services like memory management and process control. On top of this foundation, Android adds layers of software designed specifically for mobile devices..",
                style = TextStyle(lineHeight = 24.sp)
            )


        }
    }
}

