package com.example.mylistview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var myListView : ListView
     var countries = arrayOf("Afghanistan","Australia","Bangladesh","Brazil","Canada","China","Colombia","Denmark","Egypt","France","Germany","Hungary",
         "India","Japan","Kenya","Latvia","Mexico","Nepal","Oman","Poland","Quatar","Russia","South Africa","Thailand","Ukraine","Vietnam","Zimbabwe")

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myListView = findViewById(R.id.myListView)

        var arrAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,countries)
        myListView.adapter = arrAdapter

        myListView.setOnItemClickListener(AdapterView.OnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this,countries[i],Toast.LENGTH_SHORT).show()
        })


    }
}