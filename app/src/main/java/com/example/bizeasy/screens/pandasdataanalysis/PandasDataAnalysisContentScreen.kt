package com.example.bizeasy.screens.pandasdataanalysis

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
fun PandasDataAnalysisContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Analysis with Pandas") }
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
                text = "Pandas is a powerful and flexible Python library that provides data structures for efficiently working with structured (tabular, spreadsheet-like, SQL table) and time series data. It is a cornerstone of data analysis in the Python ecosystem.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Core Data Structures in Pandas:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Series:** A one-dimensional labeled array capable of holding any data type (integers, strings, floats, Python objects, etc.). Think of it like a single column of a spreadsheet.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**DataFrame:** A two-dimensional labeled data structure with columns of potentially different types. You can think of it like a spreadsheet or a SQL table, or a dictionary of Series objects.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Operations with Pandas:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **Data Loading and Reading:** Pandas can read data from various file formats like CSV, Excel, SQL databases, and more using functions like `pd.read_csv()`, `pd.read_excel()`, `pd.read_sql()`. ",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Selection and Filtering:** You can easily select specific columns, rows, or subsets of data based on conditions using indexing (`[]`, `.loc[]`, `.iloc[]`) and boolean indexing.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Cleaning:** Pandas provides tools for handling missing data (`.dropna()`, `.fillna()`), removing duplicates (`.drop_duplicates()`), and correcting inconsistencies.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Transformation:** You can add new columns, rename columns, apply functions to data (`.apply()`, `.map()`), and perform other transformations.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Aggregation:** Pandas allows you to group data based on one or more columns and calculate summary statistics (e.g., mean, sum, count) using `.groupby()` and aggregation functions.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Merging and Joining:** You can combine DataFrames based on common columns using operations like `.merge()` and `.join()`, similar to SQL JOIN operations.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Visualization:** While Matplotlib and Seaborn are primary visualization libraries, Pandas provides basic plotting capabilities directly on Series and DataFrame objects (`.plot()`).",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Basic Pandas Operations (Illustrative - Code examples would go here in a real tutorial):",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- Creating a DataFrame from a dictionary.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Selecting a single column and multiple columns.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Filtering rows based on a condition.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Calculating the mean of a column.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Grouping data by a column and counting occurrences.",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can expand on these operations with more detailed explanations and code examples in later modules.
        }
    }
}