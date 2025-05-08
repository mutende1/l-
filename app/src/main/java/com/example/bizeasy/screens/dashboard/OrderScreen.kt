package com.example.bizeasy.ui.theme.screens.dashboard

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.bizeasy.navigation.ROUTE_VIEW_ORDERS
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

// Replace this with your actual Product model
data class Product(val id: String, val name: String, val price: Double)

// Example ViewModel to fetch products (replace with your actual implementation)
class ProductViewModel : ViewModel() {
    private val _products = MutableStateFlow<List<Product>>(
        listOf(
            Product("1", "Laptop", 1200.00),
            Product("2", "Mouse", 25.00),
            Product("3", "Keyboard", 75.00),
            Product("4", "Monitor", 300.00)
            // Add more products here or fetch from your data source
        )
    )
    val products: StateFlow<List<Product>> = _products
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderScreen(navController: NavController, productViewModel: ProductViewModel = viewModel()) {
    val productList = productViewModel.products.collectAsState().value
    val orderQuantities = remember { mutableStateMapOf<String, String>() }
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Place New Order") },
                navigationIcon = { /* Back button if needed */ },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Magenta,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                )
            )
        }
    ) { innerPadding ->
        OrderProductList(
            modifier = Modifier.padding(innerPadding),
            products = productList,
            orderQuantities = orderQuantities,
            onQuantityChange = { productId, quantity ->
                orderQuantities[productId] = quantity
            },
            onSubmitOrder = {
                // Process the order here using productList and orderQuantities
                val orderItems = mutableListOf<OrderItem>()
                productList.forEach { product ->
                    val quantity = orderQuantities[product.id]?.toIntOrNull() ?: 0
                    if (quantity > 0) {
                        orderItems.add(OrderItem(productName = product.name, quantity = quantity))
                    }
                }

                if (orderItems.isNotEmpty()) {
                    println("Order Items: $orderItems")
                    Toast.makeText(context, "Order placed successfully!", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUTE_VIEW_ORDERS)
                    // In a real app, you would save these orderItems
                } else {
                    Toast.makeText(context, "Please select quantity for at least one product", Toast.LENGTH_SHORT).show()
                }
            }
        )
    }
}

@Composable
fun OrderProductList(
    modifier: Modifier = Modifier,
    products: List<Product>,
    orderQuantities: MutableMap<String, String>,
    onQuantityChange: (String, String) -> Unit,
    onSubmitOrder: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Select the quantity for each product:")
        LazyColumn {
            items(products) { product ->
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = product.name, modifier = Modifier.weight(1f))
                    OutlinedTextField(
                        value = orderQuantities[product.id] ?: "",
                        onValueChange = { newValue ->
                            if (newValue.isEmpty() || newValue.all { it.isDigit() }) {
                                onQuantityChange(product.id, newValue)
                            }
                        },
                        label = { Text("Quantity") },
                        modifier = Modifier.weight(0.7f)
                    )
                }
            }
        }
        Button(
            onClick = onSubmitOrder,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Place Order")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OrderScreenPreview() {
    OrderScreen(rememberNavController())
}