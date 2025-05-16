package com.example.bizeasy.screens.softwaredevelopment


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
import com.example.bizeasy.navigation.ROUTE_DATA_STRUCTURES_ALGORITHMS_CONTENT
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import com.example.bizeasy.navigation.ROUTE_INTRODUCTION_TO_SOFTWARE_DEVELOPMENT_CONTENT_SCREEN


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SoftwareDevelopmentTopicsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Software Development Topics") }
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
                TopicCard(title = "Introduction to Software Development") {
                    navController.navigate(ROUTE_INTRODUCTION_TO_SOFTWARE_DEVELOPMENT_CONTENT_SCREEN) // Define this route
                }
                TopicCard(title = "Programming Languages Fundamentals") {
                    navController.navigate(_root_ide_package_.com.example.bizeasy.navigation.ROUTE_PROGRAMMING_LANGUAGES_FUNDAMENTALS_CONTENT)
                }
                TopicCard(title = "Data Structures and Algorithms") {
                    navController.navigate(ROUTE_DATA_STRUCTURES_ALGORITHMS_CONTENT) // Define this route
                }
                TopicCard(title = "Software Development Methodologies") {
                    navController.navigate(_root_ide_package_.com.example.bizeasy.navigation.ROUTE_SOFTWARE_DEVELOPMENT_METHODOLOGIES_CONTENT) // Define this route
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
            Text(text = title)

        }
    }
}
