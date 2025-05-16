package com.example.bizeasy.ui.theme.screens.cybersecuritytopic

import android.R.attr.title
import android.adservices.topics.Topic
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.bizeasy.navigation.ROUTES_PHISHING_FUNDAMENTALS_CONTENT
import com.example.bizeasy.navigation.ROUTES_SYSTEM_SECURITY_CONTENT
import com.example.bizeasy.navigation.ROUTE_CYBER_SECURITY_ETHICS_CONTENT
import com.example.bizeasy.navigation.ROUTE_NETWORK_SECURITY_CONTENT
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.graphics.SolidColor
import com.example.bizeasy.navigation.ROUTE_CREATE_NOTE
import com.example.bizeasy.screens.datascience.TopicCard
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.material3.Card
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CybersecurityTopicScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Cybersecurity Topics") })

        },

        ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {

            Column { TopicCard(title = "Phishing Analysis Fundamentals") {
                navController.navigate(ROUTES_PHISHING_FUNDAMENTALS_CONTENT)
            }
            Spacer(modifier = Modifier.padding(8.dp))
            TopicCard(title = "Philosophy and Ethics in Cybersecurity") {
                navController.navigate(ROUTE_CYBER_SECURITY_ETHICS_CONTENT)
            }
            Spacer(modifier = Modifier.padding(8.dp))
            TopicCard(title = "Networking and Network Security") {
                navController.navigate(ROUTE_NETWORK_SECURITY_CONTENT)
            }
            Spacer(modifier = Modifier.padding(8.dp))
            TopicCard(title = "System Security") {
                navController.navigate(ROUTES_SYSTEM_SECURITY_CONTENT)
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
            .background(SolidColor(Color.Black)) // Alternative using background
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {

            Text(text = title)
        }
    }
}