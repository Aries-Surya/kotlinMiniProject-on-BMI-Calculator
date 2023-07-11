package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val editText =  findViewById<EditText>(R.id.editT)
            val button = findViewById<Button>(R.id.button)
            val editText2 = findViewById<EditText>(R.id.editT2)

        button.setOnClickListener {
            val weight = editText.text.toString().toDouble()
            var height = editText2.text.toString().toDouble()
            height*=0.01
            val bmi = weight / (height*height)
            val int= bmi.toInt()
            val intent=Intent(applicationContext,MainActivity2::class.java)
            intent.putExtra("IT", int)

            startActivity(intent)
        }




    }
}






