package com.example.rowery

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button)
        val dziekujemy = findViewById<TextView>(R.id.Dziekujemy)
        val imie = intent.getStringExtra("imie")
        dziekujemy.text = "Dziękujemy " + (imie ?: "")
        button.setOnClickListener {
            finish()
        }
    }
}