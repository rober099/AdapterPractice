package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class DropDown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drop_down)
        views()
    }

    private fun views(){
        val fruitList = resources.getStringArray(R.array.Fruits)
        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item, fruitList)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
    }
}