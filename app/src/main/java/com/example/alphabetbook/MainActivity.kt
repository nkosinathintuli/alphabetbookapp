package com.example.alphabetbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonA: Button = findViewById(R.id.buttonA)
        buttonA.setOnClickListener {
            var intent = Intent(this, LetterPageActivity::class.java)
            startActivity(intent)
        }
    }
}