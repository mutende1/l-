package com.example.bizeasy.screens.softwareintroduction

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
fun  IntroductionToSoftwareDevelopmentContentScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Introduction To Software Development") }
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
                text = "Just like building a house requires a plan, creating software follows a structured process known as the Software Development Life Cycle (SDLC). While different methodologies exist, the SDLC generally involves these stages:\n" +
                        "" +
                        "Planning: Defining the goals, scope, and feasibility of the software project. What problem are we trying to solve? Who is the target audience? What are the constraints?\n" +
                        "Requirements Gathering: Eliciting and documenting the detailed needs and expectations of the users and stakeholders. What exactly should the software do? How should it behave?\n" +
                        "Design: Creating the blueprint for the software. This includes the overall architecture, user interface (UI), user experience (UX), database design, and algorithms.\n" +
                        "Implementation (Coding): Translating the design into actual code using a chosen programming language(s). This is where developers write the instructions for the computer.\n" +
                        "Testing: Rigorously evaluating the software to identify and fix any defects or bugs. Different types of testing ensure the software functions correctly, performs well, and is secure.\n" +
                        "Deployment: Making the software available to the users in their intended environment. This could involve installing it on computers, deploying it to web servers, or publishing it in app stores.\n" +
                        "Maintenance: Ongoing support after deployment to fix bugs, release updates, and adapt the software to changing needs or technologies..",
                style = androidx.compose.ui.text.TextStyle(lineHeight = 24.sp)
            )

        }
    }
}