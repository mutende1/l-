
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
        import com.google.firebase.firestore.FirebaseFirestore
        import com.bizeasy.model.Note

        @Composable
        fun UpdateNotesScreen(
            navController: NavController, noteId: String,
            note: Note // This should be a parcelable or serializable object
        ) {
            var title by remember { mutableStateOf(note.title) }
            var content by remember { mutableStateOf(note.content) }

            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Update Note") },
                        navigationIcon = {
                            IconButton(onClick = { navController.popBackStack() }) {
                                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                            }
                        }
                    )
                },
                content = { padding ->
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
                                updateNoteInFirestore(note.id, title, content) {
                                    navController.popBackStack()
                                }
                            },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Update Note")
                        }
                    }
                }
            )
        }

        fun updateNoteInFirestore(noteId: String, newTitle: String, newContent: String, onSuccess: () -> Unit) {
            val db = FirebaseFirestore.getInstance()
            db.collection("notes").document(noteId)
                .update(mapOf("title" to newTitle, "content" to newContent))
                .addOnSuccessListener { onSuccess() }
                .addOnFailureListener { e ->
                    e.printStackTrace()
                }
        }



