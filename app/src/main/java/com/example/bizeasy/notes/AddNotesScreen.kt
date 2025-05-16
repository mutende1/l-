package com.bizeasy.ui.notes

import androidx.compose.foundation.layout.*
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.bizeasy.navigation.ROUTE_VIEW_NOTE
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

@Composable
fun AddNotesScreen(
    navController: NavController
) {
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var isSaving by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Add New Note") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Title") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = content,
                onValueChange = { content = it },
                label = { Text("Content") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    isSaving = true
                    saveNoteToFirestore(title, content) {
                        isSaving = false
                        navController.popBackStack()
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = title.isNotBlank() && content.isNotBlank() && !isSaving
            ) {
                Text(if (isSaving) "Saving..." else "Save Note")
            }
        }
    }
}

fun saveNoteToFirestore(title: String, content: String, onSuccess: () -> Unit) {
    val db = FirebaseFirestore.getInstance()
    val note = hashMapOf(
        "title" to title,
        "content" to content,
        "timestamp" to Date()
    )

    db.collection("notes")
        .add(note)
        .addOnSuccessListener { onSuccess() }
        .addOnFailureListener { it.printStackTrace() }
}
