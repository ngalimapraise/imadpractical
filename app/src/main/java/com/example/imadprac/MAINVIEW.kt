package com.example.imadprac

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MAINVIEW : AppCompatActivity() {
    private val day = arrayListOf("MONDAY", "TUSEDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY")
    private val mintemp = arrayListOf( 12,15,9,25,26,9,5)
    private val maxtemp = arrayListOf(19,21,16,29,29,17,9 )
    private val conditions = arrayListOf("COLD", "COLD","RAINING", "SUNNY", "SUNNY", "COLD", "RAINING" )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainview)


        //DECLARATIONS
        val minnumber = findViewById<TextView>(R.id.MINWEEK)
        val maxnumber = findViewById<TextView>(R.id.MAXTEMP)
        // BUTTONS
        val detailed = findViewById<Button>(R.id.DETAILED)
        val end = findViewById<Button>(R.id.EXIT2)

        // New page
        detailed.setOnClickListener {
            val intent2 = Intent(this, DAILYVIEW::class.java)
            startActivity(intent2)
        }

        //AVERAGE OF ARRAYS
        // CALCULATION OF WEEKS FIN TEMP
        fun mintemp() {
            var minsum = 0
            var minAverage = 0
            for (number in mintemp) {
                minsum += number
            }
            minAverage = minsum / 7
            minnumber.text = "MIN TEMP OF WEEK = $minAverage"
        }
// CALCULATION OF MAX WEEK TEMP
        fun maxtemp() {
    var maxsum = 0
    var maxAverage = 0
    for (number in maxtemp) {
        maxsum += number
    }
    maxAverage = maxsum / 7
    maxnumber.text = "MAX TEMP OF WEEK = $maxAverage "
}
//WILL RUN THE FUNCTIONS
mintemp()
        maxtemp()

        // EXIT APP
        end.setOnClickListener {
            finishAffinity()
        }


    }
}