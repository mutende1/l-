package com.example.bizeasy.ui.theme.screens.products

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.bizeasy.data.ProductViewModel
import com.example.bizeasy.R
import com.example.bizeasy.navigation.ROUTE_VIEW_PRODUCTS


@Composable
fun AddproductScreen(navController: NavController) {
    val context = LocalContext.current
    var imageUri by rememberSaveable { mutableStateOf<Uri?>(null) }
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent())
    { uri: Uri? ->
        uri?.let {
            imageUri = it
        }
    }
    var productname by remember { mutableStateOf("") }
    var productquantity by remember { mutableStateOf("") }
    var productprice by remember { mutableStateOf("") }
    var desc by remember { mutableStateOf("") }
    val productViewModel: ProductViewModel = viewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = CircleShape,
            modifier = Modifier
                .padding(10.dp)
                .size(200.dp)
        ) {
            AsyncImage(
                model = imageUri ?: R.drawable.baseline_add_24,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clickable { launcher.launch("image/*") })
        }
        Text(text = "Attach product image")

        OutlinedTextField(
            value = productname,
            onValueChange = { productname = it },
            label = { Text(text = "Product Name") },
            placeholder = { Text(text = "Please enter product name") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = productquantity,
            onValueChange = { productquantity = it },
            label = { Text(text = "Product Quantity") },
            placeholder = { Text(text = "Please enter product quantity") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = productprice,
            onValueChange = { productprice = it },
            label = { Text(text = "Unit Product Price") },
            placeholder = { Text(text = "Please enter unit product price") },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = desc,
            onValueChange = { desc = it },
            label = { Text(text = "Brief description") },
            placeholder = { Text(text = "Please enter product description") },
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            singleLine = false
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = {
                navController.navigate(ROUTE_VIEW_PRODUCTS)
            }) { Text(text = "All Products") }
            Button(onClick = {
                if (imageUri != null) {
                    productViewModel.uploadProductWithImage(
                        uri = imageUri!!,
                        context = context,
                        productname = productname,
                        productquantity = productquantity,
                        productprice = productprice,
                        desc = desc,
                        navController = navController
                    )
                } else {
                    Toast.makeText(context, "Please pick an image", Toast.LENGTH_LONG).show()
                }
            }) { Text(text = "SAVE") }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AddproductScreenPreview() {
    AddproductScreen(rememberNavController())
}


