package com.yourpackage.notes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

// Example data class for a Note
data class Note(val id: String = "", val title: String, val content: String)

// Example interface for a Note repository (replace with your actual implementation)
interface NoteRepository {
    suspend fun getNoteById(id: String): Note?
    suspend fun getAllNotes(): List<Note>
    suspend fun insertNote(note: Note)
    suspend fun updateNote(note: Note)
    suspend fun deleteNote(id: String)
}

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val noteRepository: NoteRepository // Inject your repository
) : ViewModel() {

    private val _note = MutableStateFlow<Note?>(null)
    val note: StateFlow<Note?> = _note

    private val _notes = MutableStateFlow<List<Note>>(emptyList())
    val notes: StateFlow<List<Note>> = _notes

    private val _isAddingNote = MutableStateFlow(false)
    val isAddingNote: StateFlow<Boolean> = _isAddingNote

    private val _isUpdatingNote = MutableStateFlow(false)
    val isUpdatingNote: StateFlow<Boolean> = _isUpdatingNote

    private val _currentNoteId = MutableStateFlow<String?>(null)
    val currentNoteId: StateFlow<String?> = _currentNoteId

    fun setCurrentNoteId(noteId: String?) {
        _currentNoteId.value = noteId
        if (noteId != null) {
            fetchNote(noteId)
        } else {
            _note.value = null
        }
    }

    fun getAllNotes() {
        viewModelScope.launch {
            _notes.value = noteRepository.getAllNotes()
        }
    }

    fun fetchNote(id: String) {
        viewModelScope.launch {
            _note.value = noteRepository.getNoteById(id)
        }
    }

    fun startAddingNote() {
        _isAddingNote.value = true
        _note.value = Note(title = "", content = "") // Initialize with empty note
    }

    fun stopAddingNote() {
        _isAddingNote.value = false
        _note.value = null
    }

    fun startUpdatingNote(noteId: String) {
        _isUpdatingNote.value = true
        setCurrentNoteId(noteId) // Fetch the note to be updated
    }

    fun stopUpdatingNote() {
        _isUpdatingNote.value = false
        _note.value = null
        _currentNoteId.value = null
    }

    fun updateNoteTitle(title: String) {
        _note.update { it?.copy(title = title) }
    }

    fun updateNoteContent(content: String) {
        _note.update { it?.copy(content = content) }
    }

    fun saveNote() {
        viewModelScope.launch {
            _note.value?.let { noteToSave ->
                if (noteToSave.id.isEmpty()) {
                    noteRepository.insertNote(noteToSave)
                } else {
                    noteRepository.updateNote(noteToSave)
                }
                getAllNotes() // Refresh the list after saving
                stopAddingNote()
                stopUpdatingNote()
                setCurrentNoteId(null)
            }
        }
    }

    fun deleteNote(noteId: String) {
        viewModelScope.launch {
            noteRepository.deleteNote(noteId)
            getAllNotes() // Refresh the list after deletion
            setCurrentNoteId(null)
        }
    }
}