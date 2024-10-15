package com.services.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        enableEdgeToEdge()
        var implicit_Btn=findViewById<Button>(R.id.btn1)
        implicit_Btn.setOnClickListener{
            val intent = Intent(this,explicit_intent::class.java)
            startActivity(intent)
        }
        
    }
}