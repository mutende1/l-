package com.example.bizeasy.screens.cloudservicemodels

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
fun CloudServiceModelsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Cloud service models (laaS,paas.saaS)") }
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
                text = "Cloud service models, such as IaaS (Infrastructure as a Service), PaaS (Platform as a Service), and SaaS (Software as a Service), each offer different levels of cloud resource management and access. IaaS provides the foundation of virtualized computing resources, while PaaS offers a platform for developers to build and deploy applications,\n" +
                        "Here's a more detailed breakdown:.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "IaaS (Infrastructure as a Service):",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "IaaS provides on-demand access to basic computing resources like virtual machines, storage, and networking over the internet. Businesses can rent these resources from a cloud provider, allowing them to focus on their software and data rather than managing the underlying infrastructure.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = " PaaS (Platform as a Service):\n" +
                        "PaaS offers a platform for developers to build, deploy, and manage applications without the burden of managing the underlying infrastructure. It provides tools and services for developing, testing, and deploying applications, often including operating systems, databases, and other necessary components.\n" +
                        "SaaS (Software as a Service):\n" +
                        "SaaS delivers software applications over the internet, allowing users to access and use them without the need for installation, maintenance, or updates. Examples include online email, CRM systems, and cloud storage services and SaaS delivers fully functional software applications over the internet",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
        }
    }
}




























