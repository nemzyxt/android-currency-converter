package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dollar = findViewById<EditText>(R.id.dollar)
        val btn = findViewById<Button>(R.id.btn)
        val kshs = findViewById<TextView>(R.id.kshs)

        btn.setOnClickListener {
            val d = dollar.text.toString()
            val dollars = d.toFloat()
            // current rate : 1 dollar = 117.61 Kenyan shillings :)
            val shillings = dollars * 117.61
            kshs.text = shillings.toString() }
    }
}