
package com.example.bizeasy.ui.theme.screens.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

// Dummy data class for Order (replace with your actual Order model)
data class Order(val id: Int, val items: List<OrderItem>, val orderDate: String)
data class OrderItem(val productName: String, val quantity: Int)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewOrderScreen(navController: NavController) {
    // Dummy order list (replace with your actual data fetching)
    val orderList = remember {
        listOf(
            Order(
                1,
                listOf(OrderItem("Laptop", 1), OrderItem("Mouse", 2)),
                "2025-05-08"
            ),
            Order(
                2,
                listOf(OrderItem("Keyboard", 1)),
                "2025-05-07"
            )
            // Add more dummy or actual order data here
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My Orders") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Filled.ArrowBack, "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                )
            )
        }
    ) { innerPadding ->
        OrderListContent(modifier = Modifier.padding(innerPadding), orders = orderList)
    }
}

@Composable
fun OrderListContent(modifier: Modifier = Modifier, orders: List<Order>) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("Your Placed Orders:", style = androidx.compose.ui.text.TextStyle(fontSize = 18.sp))
        LazyColumn {
            items(orders) { order ->
                OrderCard(order = order)
            }
        }
    }
}

@Composable
fun OrderCard(order: Order) {
    androidx.compose.material3.Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = androidx.compose.material3.CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Order ID: ${order.id}", style = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold))
            Text(text = "Order Date: ${order.orderDate}")
            Text(text = "Items:")
            order.items.forEach { item ->
                Text(text = "- ${item.productName} (Qty: ${item.quantity})")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ViewOrderScreenPreview() {
    ViewOrderScreen(rememberNavController())
}