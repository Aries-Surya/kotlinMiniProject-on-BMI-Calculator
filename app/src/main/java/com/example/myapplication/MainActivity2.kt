package com.example.myapplication


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val txt = findViewById<TextView>(R.id.txt)
        val view = findViewById<TextView>(R.id.view)
        val intent = intent
        val value :Int = intent.getIntExtra("IT",0)
            txt.text= value.toString()
        if (value.toString() < 18.5.toString()) {
            view.text = "Your Under Weight"
        } else if (value.toString() >= 18.5.toString() && value.toString() < 24.9.toString()) {
            view.text = "your Healthy"
        } else if (value.toString() >= 24.9.toString() && value.toString() < 30.toString()) {
            view.text = "Your Overweight"
        } else if (value.toString() >= 30.toString()) {
            view.text = " Your Suffering from Obesity"
        }


    }

}
















