package com.example.addsubtractionmultiplydivision

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edtNuber1: EditText
    lateinit var edtNuber2: EditText
    lateinit var radioGroup: RadioGroup
    lateinit var addRadio: RadioButton
    lateinit var divRadio: RadioButton
    lateinit var mulRadio: RadioButton
    lateinit var subRadio: RadioButton
    lateinit var result: TextView
    lateinit var btnClear:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNuber1 = findViewById(R.id.edtNumber1)
        edtNuber2 = findViewById(R.id.edtNuber2)
        radioGroup = findViewById(R.id.radioGroup)
        addRadio = findViewById(R.id.addition)
        divRadio = findViewById(R.id.division)
        mulRadio = findViewById(R.id.multiply)
        subRadio = findViewById(R.id.subtraction)
        result = findViewById(R.id.result)
        btnClear = findViewById(R.id.btnClear)



        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when (radioGroup.checkedRadioButtonId) {
                R.id.addition -> {
                    if (edtNuber1.text.isNotBlank() && edtNuber2.text.isNotBlank()){
                        var getNumber1 = edtNuber1.text.toString().toDouble()
                        var getNumber2 = edtNuber2.text.toString().toDouble()
                        result.text = getNumber1.plus(getNumber2).toString()
                    }else{
                        Toast.makeText(this,"Enter Number",Toast.LENGTH_SHORT).show()
                    }

                }

                R.id.subtraction -> {
                    if (edtNuber1.text.isNotBlank() && edtNuber2.text.isNotBlank()){
                        var getNumber1 = edtNuber1.text.toString().toDouble()
                        var getNumber2 = edtNuber2.text.toString().toDouble()
                        result.text = getNumber1.minus(getNumber2).toString()
                    }else{
                        Toast.makeText(this,"Enter Number",Toast.LENGTH_SHORT).show()
                    }

                }

                R.id.multiply -> {
                    if (edtNuber1.text.isNotBlank() && edtNuber2.text.isNotBlank()){
                        var getNumber1 = edtNuber1.text.toString().toDouble()
                        var getNumber2 = edtNuber2.text.toString().toDouble()
                        result.text = getNumber1.times(getNumber2).toString()
                    }else{
                        Toast.makeText(this,"Enter Number",Toast.LENGTH_SHORT).show()
                    }

                }

                R.id.division -> {
                    if (edtNuber1.text.isNotBlank() && edtNuber2.text.isNotBlank()){
                        var getNumber1 = edtNuber1.text.toString().toDouble()
                        var getNumber2 = edtNuber2.text.toString().toDouble()
                        result.text = getNumber1.div(getNumber2).toString()
                    }else{
                        Toast.makeText(this,"Enter Number",Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }

        btnClear.setOnClickListener(View.OnClickListener {
            radioGroup.clearCheck()
            result.text = "Result"
        })


    }

}
