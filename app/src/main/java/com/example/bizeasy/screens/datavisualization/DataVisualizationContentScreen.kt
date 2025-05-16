package com.example.bizeasy.screens.datavisualization


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
fun DataVisualizationContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Visualization") }
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
                text = "Data visualization is the graphical representation of information and data. By using visual elements like charts, graphs, and maps, data visualization tools provide an accessible way to see and understand trends, outliers, and patterns in data.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Why is Data Visualization Important?",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **Understanding Insights:** Visuals can reveal complex patterns and relationships that might be hidden in raw data or tables.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Effective Communication:** Visualizations make it easier to communicate data-driven insights to a wider audience, including non-technical stakeholders.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Identifying Trends and Outliers:** Visual tools can quickly highlight trends, anomalies, and correlations in data.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Supporting Decision Making:** Clear visualizations can provide the necessary information for making informed decisions.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Exploring Data:** Interactive visualizations allow users to explore data from different perspectives and uncover new questions.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Common Types of Data Visualizations:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Bar Charts:** Used to compare categorical data.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Line Charts:** Used to show trends over time or continuous data.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Scatter Plots:** Used to explore the relationship between two numerical variables.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Histograms:** Used to show the distribution of a single numerical variable.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Pie Charts:** Used to show parts of a whole (use with caution as they can be difficult to interpret accurately).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Box Plots (Box and Whisker Plots):** Used to display the distribution of numerical data and identify outliers.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Heatmaps:** Used to visualize the magnitude of a phenomenon as color in two dimensions.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Geographic Maps:** Used to visualize data with a spatial component.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Libraries for Data Visualization in Python:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Matplotlib:** A foundational library providing low-level control over plot elements.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Seaborn:** Built on top of Matplotlib, offering a higher-level interface for creating informative and aesthetically pleasing statistical graphics.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Plotly:** A library for creating interactive, web-based visualizations.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Bokeh:** Another library for creating interactive visualizations for modern web browsers.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Principles of Effective Data Visualization:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "- **Clarity:** The visualization should be easy to understand and interpret.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Accuracy:** The visualization should accurately represent the underlying data.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Efficiency:** The visualization should convey information effectively without unnecessary clutter.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Simplicity:** Choose the simplest visualization that effectively communicates the insight.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- **Context:** Provide sufficient context through titles, labels, and annotations.",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can expand on these principles and provide examples of good and bad visualizations.
        }
    }
}