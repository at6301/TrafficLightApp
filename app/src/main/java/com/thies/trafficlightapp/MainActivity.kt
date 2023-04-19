package com.thies.trafficlightapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // creating variables for the main button and traffic light images
    private lateinit var button: Button
    private lateinit var redLight: ImageView
    private lateinit var greenLight: ImageView
    private lateinit var yellowLight: ImageView

    // creating variables for the booleans that will let the app know which light is currently on
    private var red: Boolean = false
    private var green: Boolean = false
    private var yellow: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // defining all variables by their ID
        button = findViewById(R.id.button)
        redLight = findViewById(R.id.redlight)
        greenLight = findViewById(R.id.greenlight)
        yellowLight = findViewById(R.id.yellowlight)

        // setting booleans to the way the lights are on when app loads
        red = true
        green = false
        yellow = false

        // method that will occur when main button is clicked
        button.setOnClickListener {
            // red light is on
           if(red) {
               red = false
               green = true
               button.text = "Go"
               button.setBackgroundColor(Color.GREEN)
               redLight.visibility = View.GONE
               greenLight.visibility = View.VISIBLE
               yellowLight.visibility = View.GONE
           }
            // green light is on
            else if(green) {
               green = false
               yellow = true
                button.text = "Wait"
                button.setBackgroundColor(Color.YELLOW)
                redLight.visibility = View.GONE
                greenLight.visibility = View.GONE
                yellowLight.visibility = View.VISIBLE
            }
           // yellow light is on
           else {
               yellow = false
               red = true
               button.text = "Stop"
               button.setBackgroundColor(Color.RED)
               redLight.visibility = View.VISIBLE
               greenLight.visibility = View.GONE
               yellowLight.visibility = View.GONE
           }


        }

    }
}