package com.example.txtviewshowhideonbtnclick

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isGone
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var txtView: TextView
    lateinit var btnHide:Button
    lateinit var btnShow:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView = findViewById(R.id.textView)
        btnHide = findViewById(R.id.btnHide)
        btnShow = findViewById(R.id.btnShow)

        btnHide.setOnClickListener(View.OnClickListener {
            txtView.visibility = View.INVISIBLE
        })

        btnShow.setOnClickListener(View.OnClickListener {
            txtView.visibility = View.VISIBLE
        })

    }
}