package com.example.bizeasy.screens.basicuicomponentsinandroid

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicUiComponentsInAndroidContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Basic ui components") }
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
                text = "Welcome to the fascinating world of Data Science! In this introductory module, we'll explore the fundamental concepts and the broad impact of data science across various industries.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "What is Data Science?",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "Data Science is an interdisciplinary field that uses scientific methods, processes, algorithms, and systems to extract knowledge and insights from noisy, structured, and unstructured data, and apply knowledge and actionable insights from data across a broad range of application domains.",
                style = TextStyle(lineHeight = 24.sp),
                modifier = Modifier.padding(top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "The Data Science Process:",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "The data science process typically involves several key steps:",
                modifier = Modifier.padding(top = 8.dp)
            )
            Text(
                text = "1. **Data Collection:** Gathering data from various sources.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "2. **Data Cleaning and Preprocessing:** Handling missing values, outliers, and transforming data into a suitable format.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "3. **Exploratory Data Analysis (EDA):** Visualizing and summarizing data to understand its patterns and characteristics.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "4. **Feature Engineering:** Creating new relevant features from existing data.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "5. **Modeling:** Applying statistical and machine learning algorithms to build predictive or descriptive models.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "6. **Evaluation:** Assessing the performance and validity of the models.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "7. **Deployment:** Implementing the models in a real-world application.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "8. **Communication and Visualization:** Presenting findings and insights to stakeholders in a clear and understandable way.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Why is Data Science Important?",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "Data science is crucial for organizations to make data-driven decisions, gain a competitive advantage, understand customer behavior, predict future trends, and solve complex problems across various domains like healthcare, finance, marketing, and more.",
                style = TextStyle(lineHeight = 24.sp),
                modifier = Modifier.padding(top = 8.dp)
            )

            // You can add more introductory content here, like the roles of data scientists, tools used, etc.
        }
    }
}