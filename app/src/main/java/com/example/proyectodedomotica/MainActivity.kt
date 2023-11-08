package com.example.proyectodedomotica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_regi = findViewById<Button>(R.id.regi)
        btn_regi.setOnClickListener {
            val intent = Intent(this, regi::class.java)
            startActivity(intent)
        }

    }

}