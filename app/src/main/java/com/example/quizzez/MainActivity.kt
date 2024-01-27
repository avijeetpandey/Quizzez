package com.example.quizzez

import android.content.Intent
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
        val editText: EditText = findViewById(R.id.name_edit_text)

        button.setOnClickListener {
            if(editText.text.isEmpty()) {
                Toast.makeText(this,"Please enter a valid name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this,QuizQuestionActivity::class.java)
                startActivity(intent)
            }
        }
    }
}