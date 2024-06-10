package com.example.imadprac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DETAILED : AppCompatActivity() {
    private val day = arrayListOf("MONDAY", "TUSEDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")
    private val mintemp = arrayListOf( "12","15","9","25","26","9","5")
    private val maxtemp = arrayListOf("19","21","16","29","29","17","9")
    private val conditions = arrayListOf("COLD", "COLD","RAINING", "SUNNY", "SUNNY", "COLD", "RAINING" )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed)

        //DECLARATIONS
        val days = findViewById<TextView>(R.id.DAYS)
        val min = findViewById<TextView>(R.id.minTEMP)
        val max = findViewById<TextView>(R.id.maxTEMP)
        val condition = findViewById<TextView>(R.id.conditons)
        //BUTTON
        val dailydbutton = findViewById<Button>(R.id.DAILY)


        // I HAVE DECIDED TO MAKE ALL MY ARRAYS STRINGS DUE TO HAVING TO OUT PUT THEM AS TEXTS
        //CODES TO PRINT THE DATA ONE AFTER ANOTHER
        days.text = "DAY \n \n \n  ${day[0]} \n \n \n ${day[1]} \n \n \n  ${day[2]} \n \n \n ${day[3]} \n \n \n ${day[4]} \n \n \n ${day[5]} \n \n \n  ${day[6]}"
        min.text = "MIN \n \n \n ${mintemp[0]} \n \n \n  ${mintemp[1]} \n \n \n  ${mintemp[2]} \n \n \n  ${mintemp[3]} \n \n \n  ${mintemp[4]} \n \n \n  ${mintemp[5]} \n \n \n  ${mintemp[6]}"
            max.text = "MAX \n \n \n ${maxtemp[0]} \n \n \n ${maxtemp[1]} \n \n \n ${maxtemp[2]} \n \n \n ${maxtemp[3]} \n \n \n ${maxtemp[4]} \n \n \n ${maxtemp[5]} \n \n \n ${maxtemp[6]}"
            condition.text = "CONDITIONS \n \n \n ${conditions[0]} \n \n \n ${conditions[1]} \n \n \n ${conditions[2]} \n \n \n ${conditions[3]} \n \n \n ${conditions[4]} \n \n \n ${conditions[5]} \n \n \n ${conditions[6]}"

        //BUTTON TO SEND TO NEXT PAGE WERE USER WILL INPUT WHICH DAY THEY WOULD LIKE TO VIEW MORE OF
        dailydbutton.setOnClickListener {
           val intent3 = Intent(this, DAILYVIEW ::class.java)
            startActivity(intent3)
        }
    }
}