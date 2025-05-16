package com.example.bizeasy.screens


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
fun MITInnovationsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Notable MIT Innovations") }
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
                text = "MIT has been at the heart of numerous groundbreaking innovations that have shaped the modern world. Here are just a few notable examples of MIT's impact:",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Significant MIT Innovations:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **The Internet and World Wide Web:** While the internet has many contributors, key technologies and individuals who played a crucial role had strong ties to MIT.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **GPS (Global Positioning System):** MIT's Lincoln Laboratory played a vital role in the development and early testing of GPS technology.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **CAD (Computer-Aided Design):** Early and significant advancements in CAD software originated from MIT.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Artificial Intelligence (Early Development):** MIT was a major center for early AI research and continues to be a leader in the field.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Advancements in Robotics:** MIT's robotics labs have consistently produced cutting-edge robots and robotic technologies.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Medical Imaging Technologies (like MRI):** MIT researchers made significant contributions to the development of Magnetic Resonance Imaging.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Spreadsheet Software (VisiCalc):** While developed by Harvard Business School students, the underlying concepts and the environment of the time at MIT were influential.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Email (as we know it today):** While the history is complex, the development of modern email systems has roots in early work at MIT.",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can elaborate on these innovations with more details and historical context.
        }
    }
}