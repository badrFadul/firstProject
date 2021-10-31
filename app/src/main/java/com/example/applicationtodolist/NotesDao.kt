package com.example.applicationtodolist

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
abstract class NotesDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    abstract suspend fun insert(note : Notes)

    @Delete
    abstract suspend fun delete(note: Notes)

    @Query("Select * from notes_Table order by id ASC")
    abstract fun getAllNotes(): LiveData<List<Notes>>


}