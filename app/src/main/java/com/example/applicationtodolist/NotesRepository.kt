package com.example.applicationtodolist

import androidx.lifecycle.LiveData


class NotesRepository(private val noteDao: NotesDao) {


    val allNotes  = noteDao.getAllNotes()

    suspend fun insert(note: Notes) {
        noteDao.insert(note)
    }
    suspend fun delete(note: Notes){
        noteDao.delete(note)
    }

}