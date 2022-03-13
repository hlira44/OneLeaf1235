package com.example.oneleaf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this acticity and exttract the string
        val message = intent.getStringArrayExtra(EXTRA_MESSAGE)

        // Capture the layout´s TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).aplly{
            text = message;
        }
    }
}