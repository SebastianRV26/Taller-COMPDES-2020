package com.movicom.misegundaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var tv1:TextView ?= null
    private var lv1:ListView ?= null
    val paises = arrayOf( "Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay")
    val habitantes = arrayOf(40_000_000, 17_000_000, 6_500_000, 10_000_000, 30_000_000, 14_000_000, 183_000_000, 44_000_000, 31_000_000, 3_500_000)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        lv1 = findViewById(R.id.lv1)

        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises)
        lv1!!.adapter = adaptador

        lv1!!.setOnItemClickListener(this)
    }

    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        tv1!!.setText("La población de "+paises.get(p2) +" tiene "+habitantes.get(p2).toString()+" habitantes")
        Toast.makeText(this, paises.get(p2), Toast.LENGTH_SHORT).show()
    }
}
