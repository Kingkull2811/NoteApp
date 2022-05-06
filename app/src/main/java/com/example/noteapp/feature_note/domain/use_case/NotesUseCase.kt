package com.example.noteapp.feature_note.domain.use_case

data class NotesUseCase(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
