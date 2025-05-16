package com.example.bizeasy.screens.cloudcomputingtopic

import android.R.attr.title
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Button
import androidx.compose.material3.Card


import com.example.bizeasy.navigation.ROUTE_CLOUD_SERVICE_MODELS_SCREEN
import com.example.bizeasy.navigation.ROUTE_MAJOR_CLOUD_PROVIDERS_CONTENT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CloudComputingTopicsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Cloud Computing Topics") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Column {
                TopicCard(title = "Introduction to Cloud Computing") {
                    navController.navigate(_root_ide_package_.com.example.bizeasy.navigation.ROUTE_CLOUD_COMPUTING_INTRODUCTION_CONTENT)
                }
                TopicCard(title = "Cloud Service Models (IaaS, PaaS, SaaS)") {
                    navController.navigate(ROUTE_CLOUD_SERVICE_MODELS_SCREEN)
                }
                TopicCard(title = "Major Cloud Providers") {
                    navController.navigate(ROUTE_MAJOR_CLOUD_PROVIDERS_CONTENT)
                }

            }
            Button(
                onClick = {
                    navController.navigate("createNote/MIT")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp)
            ) {
                Text("click to create notes")
            }
        }
    }
}



@Composable
fun TopicCard(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .background(SolidColor(Color.LightGray)) // Alternative using background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
Text(text =  title)
        }
    }
}
