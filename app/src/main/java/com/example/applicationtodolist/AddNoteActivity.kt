package com.example.applicationtodolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider

class AddNoteActivity : AppCompatActivity() {
    private lateinit var viewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        viewModel = ViewModelProvider(this).get(NotesViewModel::class.java)
        val btn :Button = findViewById(R.id.addNote)
        btn.setOnClickListener{
            addingNote()
        }
    }
    private fun addingNote(){
        val editText: EditText = findViewById(R.id.input)
        val input= editText.text.toString()
        if(input.isNotEmpty()){
            viewModel.insertNote(Notes(input))
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}