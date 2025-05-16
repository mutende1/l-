package com.example.bizeasy.ui.theme.screens.mit



import android.R
import android.R.attr.title
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
import com.example.bizeasy.navigation.ROUTE_MIT_INNOVATIONS_CONTENT
import com.example.bizeasy.navigation.ROUTE_MIT_INTRODUCTION_CONTENT
import com.example.bizeasy.navigation.ROUTE_MIT_RESEARCH_AREAS_CONTENT
import androidx.compose.material3.Button
import androidx.compose.material3.Card

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MITTopicsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("MIT Learning Topics") }
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
                TopicCard(title = "Introduction to MIT Concepts") {
                    navController.navigate(ROUTE_MIT_INTRODUCTION_CONTENT)
                }
                TopicCard(title = "Key MIT Research Areas") {
                    navController.navigate(ROUTE_MIT_RESEARCH_AREAS_CONTENT)
                }
                TopicCard(title = "Notable MIT Innovations") {
                    navController.navigate(ROUTE_MIT_INNOVATIONS_CONTENT)
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
            .background(SolidColor(Color.Black)) // Alternative using background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {

          Text(text = title)
        }
    }
}