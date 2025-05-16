package com.example.bizeasy.screens.machinelearning

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
fun MachineLearningFundamentalsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Machine Learning Fundamentals") }
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
                text = "Machine learning (ML) is a subfield of artificial intelligence (AI) that enables computer systems to learn from data without being explicitly programmed. It focuses on the development of algorithms that can access data and use it to learn for themselves.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Concepts in Machine Learning:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Algorithms:** The core of ML, these are sets of rules or statistical techniques used to learn patterns from data.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Data:** The fuel for ML algorithms. The quality and quantity of data significantly impact the performance of ML models.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Features:** The measurable properties or attributes of the data used by ML algorithms.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Models:** The output of an ML algorithm after it has learned from the data. Models can be used for prediction, classification, clustering, etc.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Training:** The process of feeding data to an ML algorithm so it can learn patterns and build a model.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Evaluation:** Assessing the performance of a trained model using metrics relevant to the task.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Types of Machine Learning:",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Supervised Learning:** The algorithm learns from labeled data (input-output pairs) to make predictions on new, unseen data. Common tasks include classification (predicting categories) and regression (predicting continuous values).",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Unsupervised Learning:** The algorithm learns from unlabeled data to find hidden patterns or structures. Common tasks include clustering (grouping similar data points) and dimensionality reduction (reducing the number of features).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Reinforcement Learning:** An agent learns to make decisions by interacting with an environment and receiving rewards or penalties for its actions.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Common Machine Learning Algorithms (Brief Overview):",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "**Linear Regression:** For predicting continuous values based on a linear relationship between variables (Supervised).",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "**Logistic Regression:** For binary classification tasks (Supervised).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Decision Trees:** Tree-like structures used for both classification and regression (Supervised).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Support Vector Machines (SVMs):** Powerful algorithms for classification and regression (Supervised).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**K-Nearest Neighbors (KNN):** A simple algorithm for classification and regression based on the nearest data points (Supervised).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**K-Means Clustering:** An algorithm for grouping data points into clusters based on their similarity (Unsupervised).",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "**Principal Component Analysis (PCA):** A dimensionality reduction technique (Unsupervised).",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "The Machine Learning Workflow (Simplified):",
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
            Text(
                text = "1. **Data Collection and Preparation**",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "2. **Model Selection**",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "3. **Model Training**",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "4. **Model Evaluation**",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "5. **Model Deployment and Monitoring**",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can expand on these concepts and provide more details about specific algorithms in further modules.
        }
    }
}