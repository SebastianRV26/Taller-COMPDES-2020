package com.movicom.miterceraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.system.exitProcess

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    private var btn2: Button?= null
    private var btn3:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)

        btn2!!.setOnClickListener(this)
        btn3!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btn2 -> {
                val intento1 = Intent(this, MainActivity::class.java)
                startActivity(intento1)
            }
            R.id.btn3 -> {
                exitProcess(0)
            }
        }
    }
}
