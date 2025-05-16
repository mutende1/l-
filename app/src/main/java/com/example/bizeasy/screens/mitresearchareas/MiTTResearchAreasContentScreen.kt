package com.example.bizeasy.screens.mitresearchareas

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MITResearchAreasContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Key MIT Research Areas") }
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
                text = "MIT is at the forefront of numerous cutting-edge research areas, contributing significantly to advancements in science and technology. Here are some key areas of research at MIT:",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Leading Research Areas:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **Artificial Intelligence (AI):** Developing intelligent systems for various applications, including robotics, natural language processing, and computer vision.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Biotechnology and Bioengineering:** Advancing healthcare through areas like genetic engineering, drug discovery, and medical devices.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Climate Change and Sustainability:** Researching solutions to mitigate climate change, develop sustainable energy sources, and address environmental challenges.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Quantum Computing:** Exploring the potential of quantum mechanics for revolutionary computation.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Robotics:** Designing and building intelligent robots for diverse tasks in manufacturing, healthcare, and exploration.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Materials Science and Engineering:** Developing new materials with enhanced properties for various applications.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Space Exploration:** Contributing to space science and the development of technologies for space travel and exploration.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Economics and Social Sciences:** Studying economic behavior, social dynamics, and policy to address societal issues.",
                modifier = Modifier.padding(start = 8.dp)
            )


        }
    }
}