package com.example.berrios_ec2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityMenu : AppCompatActivity() {

    private lateinit var btncamara1: Button
    private lateinit var btnubicacion1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        btncamara1 = findViewById(R.id.btncamara)
        btnubicacion1 = findViewById(R.id.btnubicacion)

        btncamara1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnubicacion1.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}