package com.example.bizeasy.screens.cybersecurityethics



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
fun CybersecurityEthicsContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Philosophy and Ethics in Cybersecurity") }
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
                text = "The field of cybersecurity is deeply intertwined with philosophical and ethical considerations. As cybersecurity professionals work to protect digital assets and ensure the security of information, they constantly face decisions that have significant ethical implications.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Ethical Principles in Cybersecurity:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "1. **Confidentiality:** Respecting the privacy of data and ensuring that sensitive information is not disclosed to unauthorized individuals.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "2. **Integrity:** Maintaining the accuracy and completeness of data and systems, protecting them from unauthorized modification or destruction.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "3. **Availability:** Ensuring that authorized users have timely and reliable access to information and systems.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "4. **Legality:** Adhering to all relevant laws and regulations related to data privacy, intellectual property, and cybercrime.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "5. **Professional Responsibility:** Acting with competence, diligence, and honesty in all professional activities.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "6. **Public Good:** Considering the broader societal impact of cybersecurity practices and working to protect the public from cyber threats.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Ethical Dilemmas in Cybersecurity:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "- **Ethical Hacking:** Determining the boundaries of penetration testing and vulnerability assessments.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Data Privacy vs. Security:** Balancing the need for security measures with the right to privacy.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Disclosure of Vulnerabilities:** Deciding when and how to disclose security vulnerabilities.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Use of AI in Security:** Addressing ethical concerns related to bias and autonomy in AI-powered security tools.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Codes of Ethics and Professional Organizations:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Text(
                text = "Many professional organizations in cybersecurity, such as (ISC)² and ISACA, have established codes of ethics that provide guidance for practitioners.",
                modifier = Modifier.padding(top = 8.dp)
            )

            // Add more content as needed
        }
    }
}