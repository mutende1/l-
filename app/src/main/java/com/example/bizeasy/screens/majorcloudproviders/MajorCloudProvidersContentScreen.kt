package com.example.bizeasy.screens.majorcloudproviders

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
fun MajorCloudProvidersContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Major cloud providers" )}

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
                text = "\"The major cloud providers are Amazon Web Services (AWS), Microsoft Azure, and Google Cloud Platform (GCP). These three providers dominate the global cloud market. They are recognized as the leaders in the cloud infrastructure space.\" +\n" +
                        " Amazon Web Services (AWS):" +
                        "AWS is a comprehensive cloud platform offering a wide range of services, including compute, storage, networking, and more, with a focus on public cloud solutions." +
                        "Microsoft Azure:" +
                        "Azure is known for its strong developer solutions and its integration with Microsoft's ecosystem, offering a robust platform for building and managing applications." +
                        "Google Cloud Platform (GCP):" +
                        "GCP is known for its strengths in data analytics, machine learning, and cloud-native technologies, providing a flexible and scalable platform"
            )
        }
    }
}