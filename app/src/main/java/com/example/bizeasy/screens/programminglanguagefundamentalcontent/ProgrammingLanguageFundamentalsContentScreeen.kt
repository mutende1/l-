package com.example.bizeasy.screens.programminglanguagefundamentalcontent


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
fun ProgrammingLanguagesFundamentalsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Programming Languages Fundamentals") }
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
                text = "This module will explore the basic concepts common to most programming languages, such as variables, data types, control flow, and functions.",
                style = TextStyle(lineHeight = 24.sp)
            )
            // Add more content on programming language fundamentals
        }
    }
}