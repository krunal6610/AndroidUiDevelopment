package com.example.radiobtnchangebgcolor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var radioGroup: RadioGroup
    lateinit var red:RadioButton
    lateinit var green:RadioButton
    lateinit var blue:RadioButton
    lateinit var yellow:RadioButton
    lateinit var pink:RadioButton
    lateinit var btnClear:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup = findViewById(R.id.radioGroup)
        red = findViewById(R.id.red)
        green = findViewById(R.id.green)
        blue = findViewById(R.id.blue)
        yellow = findViewById(R.id.yellow)
        pink = findViewById(R.id.pink)
        btnClear = findViewById(R.id.btnCler)
        var consLayout:ConstraintLayout = findViewById(R.id.consLayout)

        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            when(radioGroup.checkedRadioButtonId){

                R.id.red -> {
                   consLayout.setBackgroundColor(resources.getColor(R.color.red))
                }
                R.id.green -> {
                    consLayout.setBackgroundColor(resources.getColor(R.color.green))
                }
                R.id.blue -> {
                    consLayout.setBackgroundColor(resources.getColor(R.color.blue))
                }
                R.id.yellow -> {
                    consLayout.setBackgroundColor(resources.getColor(R.color.yellow))
                }
                R.id.pink -> {
                    consLayout.setBackgroundColor(resources.getColor(R.color.pink))
                }

            }
        })

        btnClear.setOnClickListener(View.OnClickListener {
            radioGroup.clearCheck()
            consLayout.setBackgroundColor(resources.getColor(R.color.white))
        })

    }
}