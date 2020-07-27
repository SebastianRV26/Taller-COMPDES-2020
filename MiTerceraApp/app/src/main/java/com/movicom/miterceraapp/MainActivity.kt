package com.movicom.miterceraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btn1:Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)

        btn1!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intento1 =Intent(this, Main2Activity::class.java)
        startActivity(intento1)
    }

}
