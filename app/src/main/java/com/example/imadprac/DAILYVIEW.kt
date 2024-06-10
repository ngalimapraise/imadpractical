package com.example.imadprac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DAILYVIEW : AppCompatActivity() {
    private val day = arrayListOf("MONDAY", "TUSEDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")
    private val mintemp = arrayListOf( "12","15","9","25","26","9","5")
    private val maxtemp = arrayListOf("19","21","16","29","29","17","9")
    private val conditions = arrayListOf("COLD", "COLD","RAINY", "SUNNY", "SUNNY", "COLD", "RAINY" )
    private val images = arrayListOf(R.drawable.coldweather, R.drawable.coldweather, R.drawable.rainny_weather,R.drawable.sunnywaeather,R.drawable.sunnywaeather,R.drawable.coldweather, R.drawable.rainny_weather)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dailyview)

        //declarations
        val dayofweek = findViewById<TextView>(R.id.DAYSOFWEEK)
        val temperatureview = findViewById<TextView>(R.id.TEMPRATUREVIEW)

        //button
        val display = findViewById<Button>(R.id.DISPLAY)
        val clear = findViewById<Button>(R.id.CLEAR)
        val weekview = findViewById<Button>(R.id.WEEKVIEWERBUTTON)
        val exit = findViewById<Button>(R.id.EXIT4)
        val back = findViewById<Button>(R.id.BACKBUTTON)

        //edittext
        val edit1 = findViewById<EditText>(R.id.EDIT1)

        //IMAGEVIEW
        var image = findViewById<ImageView>(R.id.WEARTHERVIEWPICTURE)


        //CODE
        val edit101 = edit1.text.toString()
        // FUNCTIONS
        fun daysearch(){
            val edit101 = edit1.text.toString()
            val i = day.indexOf(edit101)
            if (edit101 == ""){
                Toast.makeText(this, "PLEASE INPUT DAY.", Toast.LENGTH_SHORT).show()
            }else if (edit101 in day) {
                dayofweek.text = day[i]
                image.setImageResource(images[i])
                temperatureview.text = "MIN TEMP: ${mintemp[i]}    MAX TEMP: ${maxtemp[i]} \n \n" + " ${day[i]} IS GOING TO BE A ${conditions[i]} DAY. "
            }else{
                Toast.makeText(this, "INCORRECT SPELLING / NOT IN CAPITAL LETTERS", Toast.LENGTH_SHORT).show()
            }
        }

        fun clearall(){
            edit1.text.clear()
            dayofweek.text = ""
            temperatureview.text = ""
            image.setImageResource(R.drawable.weather)
        }

        //button to search for day in array
        display.setOnClickListener {
            daysearch()
        }

        // BUTTON TO VIEW WEEKS DATA
        weekview.setOnClickListener {
            val intent4 = Intent(this, DETAILED ::class.java)
            startActivity(intent4)
        }

        //CLEAR BUTTON
        clear.setOnClickListener {
           clearall()
        }

        //exit button
        exit.setOnClickListener {
            finishAffinity()
        }

        //back to weeks average
        back.setOnClickListener {
            val intent5 = Intent(this, MAINVIEW ::class.java)
            startActivity(intent5)
        }








    }
}