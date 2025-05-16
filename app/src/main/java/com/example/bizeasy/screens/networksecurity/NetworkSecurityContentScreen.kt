package com.example.bizeasy.screens.networksecurity

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
fun NetworkSecurityContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Networking and Network Security") }
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
                text = "Networking and network security are fundamental aspects of cybersecurity. They involve the practices and technologies used to protect computer networks and the data transmitted across them from unauthorized access, misuse, modification, or destruction.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Concepts in Network Security:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "1. **Firewalls:** Hardware or software systems that control incoming and outgoing network traffic based on predefined security rules.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "2. **Intrusion Detection and Prevention Systems (IDPS):** Systems that monitor network traffic for suspicious activity and can either alert administrators (IDS) or automatically block malicious traffic (IPS).",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "3. **Virtual Private Networks (VPNs):** Technologies that create secure and encrypted connections over a less secure network, such as the internet.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "4. **Access Control Lists (ACLs):** Rules applied to network interfaces that permit or deny network traffic based on source and destination IP addresses, ports, and protocols.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "5. **Network Segmentation:** Dividing a network into smaller, isolated segments to limit the impact of a security breach.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "6. **Wireless Security:** Protocols and practices used to secure wireless networks, such as WPA2/3 encryption.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Common Network Security Threats:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "- **Malware:** Viruses, worms, ransomware, and other malicious software that can spread through networks.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Denial-of-Service (DoS) and Distributed Denial-of-Service (DDoS) Attacks:** Attempts to overwhelm network resources and make them unavailable to legitimate users.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Man-in-the-Middle (MitM) Attacks:** Attackers intercepting communication between two parties.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Network Sniffing:** Capturing and analyzing network traffic to gain unauthorized access to information.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **SQL Injection:** Exploiting vulnerabilities in web applications to inject malicious SQL code into databases.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Best Practices for Network Security:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Text(
                text = "- Implement strong passwords and multi-factor authentication.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Regularly update network devices and software.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Educate users about network security threats and best practices.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Implement network segmentation and the principle of least privilege.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Regularly monitor network traffic and security logs.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            // Add more content as needed
        }
    }
}