package com.example.bizeasy.screens.pythonfordatascience



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
fun PythonForDataScienceContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Python for Data Science") }
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
                text = "Python has become the lingua franca of data science due to its versatility, extensive libraries, and a large, supportive community. This module will introduce you to the fundamental aspects of Python that are essential for data manipulation, analysis, and visualization.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Why Python for Data Science?",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **Ease of Learning:** Python's syntax is clear and relatively easy to pick up, making it accessible for beginners.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Extensive Libraries:** Python boasts powerful libraries specifically designed for data science tasks, such as NumPy for numerical computing, Pandas for data manipulation and analysis, Matplotlib and Seaborn for visualization, and Scikit-learn for machine learning.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Large Community and Support:** The vast Python community provides ample resources, tutorials, and support forums, making it easier to find solutions to problems.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Integration Capabilities:** Python can easily integrate with other languages and tools, making it a flexible choice for complex data science workflows.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Essential Python Libraries for Data Science:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**NumPy:** Fundamental package for numerical computation in Python. It provides support for large, multi-dimensional arrays and matrices, along with a collection of high-level mathematical functions to operate on these arrays.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Pandas:** Library providing high-performance, easy-to-use data structures and data analysis tools. Its core data structure is the DataFrame, which is excellent for working with structured data.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Matplotlib:** A comprehensive library for creating static, interactive, and animated visualizations in Python.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Seaborn:** A data visualization library built on top of Matplotlib. It provides a high-level interface for drawing attractive and informative statistical graphics.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Scikit-learn:** A simple and efficient tool for data mining and data analysis. It features various classification, regression, clustering algorithms, and tools for model selection and evaluation.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Basic Python Concepts for Data Science:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- Variables, data types (integers, floats, strings, booleans)",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Operators (arithmetic, comparison, logical)",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Control flow (if/else statements, for and while loops)",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Data structures (lists, tuples, dictionaries, sets)",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Functions",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can expand on these basic concepts and provide code examples in later modules.
        }
    }
}