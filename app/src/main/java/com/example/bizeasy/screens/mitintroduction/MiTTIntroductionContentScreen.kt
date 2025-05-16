package com.example.bizeasy.screens.mitintroduction

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
fun MITIntroductionContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Introduction to MIT Concepts") }
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
                text = "Welcome to the introduction to the Massachusetts Institute of Technology (MIT)! MIT is a world-renowned institution known for its groundbreaking research, innovation, and education in science, technology, engineering, mathematics (STEM), and beyond.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Core Values and Principles:",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "- **Mens et Manus (Mind and Hand):** MIT's motto emphasizes the importance of combining theoretical knowledge with practical application.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Innovation and Entrepreneurship:** MIT fosters a culture of innovation and encourages its students and faculty to pursue entrepreneurial ventures.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Rigorous Education:** MIT provides a challenging and comprehensive education across a wide range of disciplines.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Impactful Research:** MIT is at the forefront of scientific and technological research, addressing some of the world's most pressing challenges.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Areas of Study at MIT:",
                style = TextStyle(fontSize = 18.sp)
            )
            Text(
                text = "- Engineering (various disciplines)",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Science (physics, chemistry, biology, mathematics)",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Architecture and Planning",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Management",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Humanities, Arts, and Social Sciences (though with a strong technological focus)",
                modifier = Modifier.padding(start = 8.dp)
            )


        }
    }
}