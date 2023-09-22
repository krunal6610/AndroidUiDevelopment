package com.example.fontsizeincreasedecrease

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var btnPlus : Button
    lateinit var btnMinus : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)

        var userTextSize = textView.textSize
        var diff = 1.0f
        userTextSize = userTextSize.plus(diff)

        btnPlus.setOnClickListener(View.OnClickListener {
            userTextSize = userTextSize.plus(diff)
           textView.textSize = userTextSize
        })

        btnMinus.setOnClickListener(View.OnClickListener {
            userTextSize = userTextSize.minus(diff)
            textView.textSize = userTextSize
        })

    }
}