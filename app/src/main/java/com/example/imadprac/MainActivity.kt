package com.example.imadprac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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

        //DECLARATIONS
        val detail = findViewById<TextView>(R.id.DETAIL)
        val enter = findViewById<Button>(R.id.ENTER)
        val exit = findViewById<Button>(R.id.EXIT)



        //MY INFO
        detail.text = "PRAISE NGALIMA \n ST10459054"

        //BUTTON TO MAIN PAGE
        enter.setOnClickListener {
            val intent = Intent(this, MAINVIEW::class.java)
            startActivity(intent)
        }

        // EXITING APP
        exit.setOnClickListener {
            finishAffinity()
        }

    }
}