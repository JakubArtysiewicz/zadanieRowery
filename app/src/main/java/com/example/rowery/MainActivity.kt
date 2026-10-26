package com.example.rowery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
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
        val imie = findViewById<EditText>(R.id.Imie).text.toString()
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val selectedId = radioGroup.checkedRadioButtonId
        var cena = 0
        var nazwa = ""
        if (selectedId == 0){
            cena = 15
            nazwa = "miejski"
        }
        if (selectedId == 1){
            cena = 25
            nazwa = "górski"
        }
        if (selectedId == 2){
            cena = 40
            nazwa = "elektryczny"
        }

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("imie",imie)
            intent.putExtra("nazwa",nazwa)
            intent.putExtra("cena",cena)
            intent.putExtra("wiek", 25)

            startActivity(intent)
        }
    }
}