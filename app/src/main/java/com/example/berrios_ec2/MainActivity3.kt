package com.example.berrios_ec2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn = findViewById(R.id.btn_ubicacion_)
        btn2 = findViewById(R.id.btn_ubicacion_2)
        btn3 = findViewById(R.id.btn_ubicacion_3)

        btn.setOnClickListener {
            val intentUri = Uri.parse("geo:0,0?q=-11.8400704,-77.1139872(IDAT-Tomas Valle")
            val mapIntent = Intent(Intent.ACTION_VIEW,intentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager).let { startActivity(mapIntent) }
        }
        btn2.setOnClickListener {
            val intentUri = Uri.parse("geo:0,0?q=-12.066877,-77.035721(IDAT-Lima Centro")
            val mapIntent = Intent(Intent.ACTION_VIEW,intentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager).let { startActivity(mapIntent) }
        }
        btn3.setOnClickListener {
            val intentUri = Uri.parse("geo:0,0?q=-11.8456320,-77.1129344(IDAT-Ate")
            val mapIntent = Intent(Intent.ACTION_VIEW,intentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            mapIntent.resolveActivity(packageManager).let { startActivity(mapIntent) }
        }
    }
}