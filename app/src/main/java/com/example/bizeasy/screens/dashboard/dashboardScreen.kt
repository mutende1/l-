package com.example.bizeasy.ui.theme.screens.dashboard

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bizeasy.navigation.* // Assuming your navigation routes are here

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = Color.Magenta) {
                val context = LocalContext.current
                var selectedItem by remember { mutableStateOf(0) }
                val items = listOf("Phone", "Email", "Share")
                val icons = listOf(Icons.Filled.Phone, Icons.Filled.Email, Icons.Filled.Share)

                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(icons[index], contentDescription = item) },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                            when (item) {
                                "Phone" -> {
                                    val intent = Intent(Intent.ACTION_DIAL).apply {
                                        data = Uri.parse("tel:0792492085")
                                    }
                                    context.startActivity(intent)
                                }
                                "Email" -> {
                                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                                        data = Uri.parse("mailto:info@bizeasy.ac.ke")
                                        putExtra(Intent.EXTRA_SUBJECT, "Inquiry")
                                        putExtra(Intent.EXTRA_TEXT, "Hello, How do i join your school?")
                                    }
                                    context.startActivity(intent)
                                }
                                "Share" -> {
                                    val sendIntent = Intent().apply {
                                        action = Intent.ACTION_SEND
                                        putExtra(Intent.EXTRA_TEXT, "Download app here: https://www.download.com")
                                        type = "text/plain"
                                    }
                                    val shareIntent = Intent.createChooser(sendIntent, null)
                                    context.startActivity(shareIntent)
                                }
                            }
                        }
                    )
                }
            }
        },
        topBar = {
            TopAppBar(
                title = { Text("LearnIt") },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Home, contentDescription = "Home")
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Search, contentDescription = "Search")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Person, contentDescription = "Profile")
                    }
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Close, contentDescription = "Logout")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                )
            )
        },
        floatingActionButton = {  // Added FAB here
            FloatingActionButton(
                onClick = {
                    navController.navigate(ROUTE_ADD_NOTE) // Navigate to your notes screen
                },
                containerColor = Color.Magenta,
                contentColor = Color.White
            ) {
                Icon(Icons.Filled.Add, contentDescription = "Add Notes")
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LearningCard(title = "Learning Cybersecurity") {
                    navController.navigate(ROUTE_CYBERSECURITY_TOPICS)
                }
                LearningCard(title = "Learning Data Science") {
                    navController.navigate(ROUTE_DATA_STRUCTURES_ALGORITHMS_CONTENT)
                }
                LearningCard(title = "Learning MIT") {
                    navController.navigate(ROUTE_MIT_TOPICS)
                }
                LearningCard(title = "Learning Software Development") {
                    navController.navigate(ROUTE_SOFTWARE_DEVELOPMENT_TOPICS)
                }
                LearningCard(title = "Learning Android Development") {
                    navController.navigate(ROUTE_ANDROID_DEVELOPMENT_TOPICS)
                }
                LearningCard(title = "Learning Cloud Computing") {
                    navController.navigate(ROUTE_CLOUD_COMPUTING_TOPICS)
                }
            }

        }
    }

}

@Composable
fun LearningCard(title: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
            .padding(horizontal = 16.dp) // Add horizontal padding for better spacing
            .clickable(onClick = onClick),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Black, contentColor = Color.White)
    ) {
        Box(
            modifier = Modifier
                .padding(25.dp) // Increase padding for better touch target
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            contentAlignment = Alignment.CenterStart // Align text to the start
        ) {
            Text(text = title, style = MaterialTheme.typography.titleLarge)
        }
    }
}
