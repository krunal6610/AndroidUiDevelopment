package com.example.dialogbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var btn:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)



    }



    fun btnClick(view: View) {

        var dialog = Dialog(this)
       dialog.setContentView(R.layout.db_layout)
        

        var btn = dialog.findViewById<Button>(R.id.btn_db)
        var edt_db = dialog.findViewById<EditText>(R.id.edt_db)

       btn.setOnClickListener {

           var name = edt_db.text.toString()
           Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
           dialog.dismiss()
       }

        dialog.show()



    }




}