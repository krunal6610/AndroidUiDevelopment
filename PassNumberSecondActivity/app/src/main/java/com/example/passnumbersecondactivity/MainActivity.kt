package com.example.passnumbersecondactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtNum1:EditText
    lateinit var txtNum2:EditText
    lateinit var btnSubmit:Button
    lateinit var txtFor:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNum1 = findViewById(R.id.txtNum1)
        txtNum2 = findViewById(R.id.txtNum2)
        btnSubmit = findViewById(R.id.btnSubmit)
        txtFor = findViewById(R.id.textFor)


        btnSubmit.setOnClickListener(View.OnClickListener {
         /*   var intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("num",txtNum1.text.toString())
            intent.putExtra("num2",txtNum2.text.toString())
            startActivity(intent) */

            var num1 = txtNum1.text.toString()
            var num2 = txtNum2.text.toString()

            var a = arrayOf("0","1","2")
            for (i in num1.toInt()..num2.toInt()){


                txtFor.text = a[1]
            }

        })

    }
}