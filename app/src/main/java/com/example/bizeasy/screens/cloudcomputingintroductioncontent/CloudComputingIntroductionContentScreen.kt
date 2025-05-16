package com.example.bizeasy.screens.cloudcomputingintroductioncontent

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
fun CloudComputingIntroductionContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Introduction cloud Computing") }
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
                text = "Cloud computing is the on-demand delivery of computing services—including servers, storage, databases, networking, software, analytics, and intelligence—over the Internet (the cloud). Instead of owning and maintaining your own physical data centers and servers, you can access these technology services from a cloud provider like Amazon Web Services (AWS), Microsoft Azure, or Google Cloud. You typically pay only for the cloud services you use, helping you lower your operating costs, run your infrastructure more efficiently, and scale as your business needs change.\n" +
                        "" +
                        "Think of it like renting electricity instead of building your own power plant. You only pay for the power you consume, and the utility company handles the infrastructure and maintenance..",
                style = TextStyle(lineHeight = 24.sp)
            )
        }

            Text(
                text = "",
                style = TextStyle(lineHeight = 24.sp)
            )

    }
}