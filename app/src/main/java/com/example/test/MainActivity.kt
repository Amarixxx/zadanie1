package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stext = findViewById<TextView>(R.id.text)
        stext.text ="Nie zostalem jescze klikniety"

        var btn = findViewById<Button>(R.id.Btn)
        btn.setOnClickListener{
            stext.text ="Kliknales button"
        }
    }
}