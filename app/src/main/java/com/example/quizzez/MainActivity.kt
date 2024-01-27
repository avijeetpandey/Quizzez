package com.example.quizzez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.start_button)
        val edit_text: EditText = findViewById(R.id.name_edit_text)
        button.setOnClickListener {
            if(edit_text.text.isEmpty()) {
                Toast.makeText(this,"Please enter a valid name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}