package com.example.reversenumber

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtNumber:EditText
    lateinit var txtResult:TextView
    lateinit var btnResult:Button
    lateinit var btnClear:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNumber = findViewById(R.id.txtNumber)
        txtResult = findViewById(R.id.txtResult)
        btnResult = findViewById(R.id.btnResult)
        btnClear = findViewById(R.id.btnClear)


        btnResult.setOnClickListener(View.OnClickListener {
            var getNumber = txtNumber.text.toString().reversed()
            txtResult.text = getNumber
        })

        btnClear.setOnClickListener(View.OnClickListener {
            txtNumber.text = null
            txtResult.text = "Result"
        })


    }
}