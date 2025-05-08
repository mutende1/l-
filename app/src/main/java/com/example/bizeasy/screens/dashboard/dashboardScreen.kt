package com.example.bizeasy.ui.theme.screens.dashboard

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bizeasy.R
import com.example.bizeasy.navigation.ROUTE_ADD_PRODUCT
import com.example.bizeasy.navigation.ROUTE_PLACE_ORDER // Import the new route
import com.example.bizeasy.navigation.ROUTE_VIEW_PRODUCTS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController) {
    val selectedItem = remember { mutableStateOf(0) }
    val context = LocalContext.current
    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = Color.Magenta) {
                NavigationBarItem(
                    selected = selectedItem.value == 0,
                    onClick = {
                        selectedItem.value = 0
                        val intent = Intent(Intent.ACTION_DIAL).apply {
                            data = Uri.parse("tel:0794920985")
                        }
                        context.startActivity(intent)
                    },
                    icon = { Icon(Icons.Filled.Phone, contentDescription = "Phone") },
                    label = { Text(text = "Phone") },
                    alwaysShowLabel = true
                )
                NavigationBarItem(
                    selected = selectedItem.value == 1,
                    onClick = {
                        selectedItem.value = 1
                        val intent = Intent(Intent.ACTION_SENDTO).apply {
                            data = Uri.parse("mailto: info@emobilis.ac.ke")
                            putExtra(Intent.EXTRA_SUBJECT, "Inquiry")
                            putExtra(Intent.EXTRA_TEXT, "Hello, How do i join your school?")
                        }
                        context.startActivity(intent)
                    },
                    icon = { Icon(Icons.Filled.Email, contentDescription = "Email") },
                    label = { Text(text = "EMail") },
                    alwaysShowLabel = true
                )
                NavigationBarItem(
                    selected = selectedItem.value == 2,
                    onClick = {
                        selectedItem.value = 2
                        val sendIntent = Intent().apply {
                            action = Intent.ACTION_SEND
                            putExtra(Intent.EXTRA_TEXT, "Download app here: https://www.download.com")
                            type = "text/plain"
                        }
                        val shareIntent = Intent.createChooser(sendIntent, null)
                        context.startActivity(shareIntent)
                    },
                    icon = { Icon(Icons.Filled.Share, contentDescription = "Share") },
                    label = { Text(text = "Share") },
                    alwaysShowLabel = true
                )
            }
        }
    )
    { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Dashboard background image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TopAppBar(
                    title = { Text(text = "BizRAHISI") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Filled.Home,
                                contentDescription = "Home"
                            )
                        }
                    },
                    actions = {
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Filled.Person,
                                contentDescription = "Profile"
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "Search"
                            )
                        }
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Filled.Close,
                                contentDescription = "Logout"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Magenta,
                        titleContentColor = Color.Black,
                        navigationIconContentColor = Color.Black,
                        actionIconContentColor = Color.Black
                    )
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(0.8f)
                            .clickable {
                                navController.navigate(ROUTE_PLACE_ORDER) // Navigate to the OrderScreen
                            },
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Black)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .padding(25.dp),
                            contentAlignment = Alignment.Center
                        ) { Text(text = "Products") }
                    }

                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(0.8f)
                            .clickable { // Make the Orders card clickable
                                navController.navigate(ROUTE_VIEW_PRODUCTS) // Navigate to the ViewProductsScreen
                            },
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Gray)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .padding(25.dp),
                            contentAlignment = Alignment.Center
                        ) { Text(text = "Orders") }
                    }
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(0.8f),
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Gray)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .padding(25.dp),
                            contentAlignment = Alignment.Center
                        ) { Text(text = "Payments") }
                    }
                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(0.8f),
                        shape = RoundedCornerShape(20.dp),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color.Gray)
                    ) {
                        Box(
                            modifier = Modifier
                                .height(100.dp)
                                .padding(25.dp),
                            contentAlignment = Alignment.Center
                        ) { Text(text = "Sales Report") }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen(rememberNavController())
}