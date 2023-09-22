package com.example.checkbox

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myText:TextView
    lateinit var myCheckbox:CheckBox
    lateinit var myBtn : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myText = findViewById(R.id.myText)
        myCheckbox = findViewById(R.id.myCheckbox)
        myBtn = findViewById(R.id.myBtn)

        myText.visibility = View.INVISIBLE

        myBtn.setOnClickListener(View.OnClickListener {
            if (myCheckbox.isChecked){
                myText.visibility = View.VISIBLE
            }else{
                myText.visibility = View.INVISIBLE
            }
        })


    }
}