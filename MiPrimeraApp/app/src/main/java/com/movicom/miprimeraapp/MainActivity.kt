package com.movicom.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.IntegerRes

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var et1:EditText?= null
    private var et2:EditText?= null
    private var rb1:RadioButton?= null
    private var rb2:RadioButton?= null
    private var btn1:Button?= null
    private var tv1:TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        rb1 = findViewById(R.id.radbtnSuma)
        rb2 = findViewById(R.id.radbtnResta)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)

        btn1!!.setOnClickListener(this)
        tv1!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btn1 -> {
                var resultado:Int
                if (rb1!!.isChecked) {
                    resultado = et1!!.getText().toString().toInt() + et2!!.getText().toString().toInt()
                }else{
                    resultado = et1!!.text.toString().toInt() - et2!!.text.toString().toInt()
                }
                tv1!!.setText("Resultado: "+resultado)
            }
            R.id.tv1 -> {
                Toast.makeText(this, "No peciones aquí", Toast.LENGTH_LONG).show()
            }
        }
    }
}
