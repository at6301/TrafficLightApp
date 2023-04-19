package com.thies.trafficlightapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var redLight: ImageView
    private lateinit var greenLight: ImageView
    private lateinit var yellowLight: ImageView

    private var isRed: Boolean = false
    private var isGreen: Boolean = false
    private var isYellow: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        redLight = findViewById(R.id.redlight)
        greenLight = findViewById(R.id.greenlight)
        yellowLight = findViewById(R.id.yellowlight)
        isRed = true
        isGreen = false
        isYellow = false

        button.setOnClickListener {
           if(isRed) {
               isRed = false
               isGreen = true
               button.text = "Go"
               button.setBackgroundColor(Color.GREEN)
               redLight.visibility = View.GONE
               greenLight.visibility = View.VISIBLE
               yellowLight.visibility = View.GONE
           }
            else if(isGreen) {
                isGreen = false
                isYellow = true
                button.text = "Wait"
                button.setBackgroundColor(Color.YELLOW)
                redLight.visibility = View.GONE
                greenLight.visibility = View.GONE
                yellowLight.visibility = View.VISIBLE
            }
           else {
               isYellow = false
               isRed = true
               button.text = "Stop"
               button.setBackgroundColor(Color.RED)
               redLight.visibility = View.VISIBLE
               greenLight.visibility = View.GONE
               yellowLight.visibility = View.GONE
           }


        }

    }
}