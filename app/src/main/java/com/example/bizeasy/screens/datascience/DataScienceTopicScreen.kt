package com.example.bizeasy.screens.datascience


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
import com.example.bizeasy.navigation.ROUTE_DATA_SCIENCE_INTRODUCTION_CONTENT
import com.example.bizeasy.navigation.ROUTE_DATA_VISUALIZATION_CONTENT
import com.example.bizeasy.navigation.ROUTE_MACHINE_LEARNING_FUNDAMENTALS_CONTENT
import com.example.bizeasy.navigation.ROUTE_PANDAS_DATA_ANALYSIS_CONTENT
import com.example.bizeasy.navigation.ROUTE_PYTHON_FOR_DATA_SCIENCE_CONTENT


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataScienceTopicsScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Science Topics") }
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
                TopicCard(title = "Introduction to Data Science") {
                    navController.navigate(ROUTE_DATA_SCIENCE_INTRODUCTION_CONTENT) // Define this route
                }
                TopicCard(title = "Python for Data Science") {
                    navController.navigate(ROUTE_PYTHON_FOR_DATA_SCIENCE_CONTENT) // Define this route
                }
                TopicCard(title = "Data Analysis with Pandas") {
                    navController.navigate(ROUTE_PANDAS_DATA_ANALYSIS_CONTENT) // Define this route
                }
                TopicCard(title = "Data Visualization") {
                    navController.navigate(ROUTE_DATA_VISUALIZATION_CONTENT) // Define this route
                }
                TopicCard(title = "Machine Learning Fundamentals") {
                    navController.navigate(ROUTE_MACHINE_LEARNING_FUNDAMENTALS_CONTENT) // Define this route
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