package com.example.bizeasy.ui.theme.screens.cybersecuritytopic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhishingFundamentalsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Phishing Analysis Fundamentals") }
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
                text = "Phishing is a type of social engineering attack where malicious actors attempt to deceive individuals into revealing sensitive information, such as usernames, passwords, credit card details, or other personal data. These attacks are often carried out through deceptive emails, websites, text messages, or other forms of electronic communication that mimic legitimate entities.",
                style = androidx.compose.ui.text.TextStyle(lineHeight = 24.sp)
            )
            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Characteristics of Phishing:",
                style = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
            )
            Text(
                text = "1. **Deceptive Appearance:** Phishing attempts often use branding, logos, and language that closely resemble those of legitimate organizations.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "2. **Urgency or Threat:** Attackers often create a sense of urgency or imply negative consequences if the recipient doesn't act immediately.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "3. **Request for Sensitive Information:** The primary goal is to trick users into providing confidential data.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "4. **Links or Attachments:** Phishing messages often contain malicious links that lead to fake login pages or attachments that contain malware.",
                modifier = Modifier.padding(start = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Examples of Phishing Attacks:",
                style = androidx.compose.ui.text.TextStyle(fontWeight = androidx.compose.ui.text.font.FontWeight.Bold)
            )
            Text(
                text = "- Email claiming your bank account has been compromised.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Text message saying you have a package waiting for delivery and need to pay a fee.",
                modifier = Modifier.padding(start = 8.dp)
            )
            Text(
                text = "- Fake login page for a social media platform.",
                modifier = Modifier.padding(start = 8.dp)
            )

            // You can add more content here, like prevention tips, etc.
        }
    }
}