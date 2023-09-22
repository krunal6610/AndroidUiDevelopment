package com.example.toolbar

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import android.widget.Toolbar
import androidx.annotation.RequiresApi


class MainActivity : AppCompatActivity() {

    lateinit var myToolbar: Toolbar
    lateinit var txtHello:TextView
    lateinit var spinner: Spinner
    lateinit var searchView: SearchView
     var countries = arrayOf("item 1","item 2","item 3","item 4","item 5",)


    @RequiresApi(Build.VERSION_CODES.Q)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToolbar = findViewById(R.id.myToolbar)
        txtHello = findViewById(R.id.txtHello)
        spinner = findViewById(R.id.spinner)
        searchView = findViewById(R.id.searchView)
        searchView.queryHint = "Search"

        var arrAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
        spinner.adapter = arrAdapter

        setActionBar(myToolbar)



    }

}