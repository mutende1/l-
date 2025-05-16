package com.example.bizeasy.screens.datastructuresalgorithms


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
fun DataStructuresAlgorithmsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Structures  Algorithms") }
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
                text = "Learn about fundamental data structures like arrays, linked lists, trees, and graphs, as well as common algorithms for sorting, searching, and problem-solving" +
                        ".",

                style = TextStyle(lineHeight = 24.sp)
            )
            // Add more content on data structures and algorithms
        }
    }
}