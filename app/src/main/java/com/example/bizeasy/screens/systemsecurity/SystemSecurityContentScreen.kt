package com.example.bizeasy.screens.systemsecurity

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
fun SystemSecurityContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("System Security") }
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
                text = "System security focuses on protecting individual computer systems and their resources from threats. This includes hardware, software, and the data stored and processed within these systems. Effective system security involves implementing various controls and practices to ensure confidentiality, integrity, and availability.",
                style = TextStyle(lineHeight = 24.sp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Key Areas of System Security:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "1. **Operating System Security:** Hardening the OS through patching, secure configurations, and access controls.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "2. **User Account Management:** Creating strong passwords, implementing the principle of least privilege, and managing user rights and permissions.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "3. **Endpoint Security:** Protecting individual devices (desktops, laptops, mobile devices) from threats through antivirus software, firewalls, and endpoint detection and response (EDR) solutions.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "4. **Data Security:** Implementing measures to protect data at rest (stored on devices) and data in transit (being transmitted), including encryption and access controls.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "5. **Patch Management:** Regularly updating operating systems and applications to address known vulnerabilities.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "6. **Physical Security:** Protecting the physical access to computer systems and infrastructure.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Common System Security Threats:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )

            Text(
                text = "- **Malware:** Viruses, worms, Trojans, ransomware, and spyware that can compromise system integrity and confidentiality.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Unauthorized Access:** Individuals gaining access to systems or data without proper authorization.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Insider Threats:** Security breaches caused by individuals with legitimate access to systems.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Social Engineering:** Manipulating users into revealing sensitive information or performing actions that compromise security.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- **Vulnerabilities:** Weaknesses in software or hardware that can be exploited by attackers.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "Best Practices for System Security:",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Text(
                text = "- Use strong, unique passwords and enable multi-factor authentication.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Keep operating systems and applications up to date with the latest patches.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Install and maintain reputable antivirus and anti-malware software.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Be cautious of suspicious emails, links, and attachments.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Implement firewalls and intrusion detection/prevention systems.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Regularly back up important data.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )
            Text(
                text = "- Educate users about system security best practices.",
                modifier = Modifier.padding(start = 8.dp, top = 8.dp)
            )

            // Add more content as needed
        }
    }
}