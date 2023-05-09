package com.example.mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        var continue_button = findViewById<TextView>(R.id.continue_button)
        continue_button.setOnClickListener {
            val intent = Intent(this, DonateActivity::class.java)
            startActivity(intent)
        }
    }
}