package com.example.rowery

import android.os.Bundle
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imie = findViewById<EditText>(R.id.Imie)
        val miejski = findViewById<RadioButton>(R.id.Miejski)
        val Gorski = findViewById<RadioButton>(R.id.Gorski)
        val Elektryczny = findViewById<RadioButton>(R.id.Elektryczny)

    }
}