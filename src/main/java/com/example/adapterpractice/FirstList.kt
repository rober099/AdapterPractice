package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.RadioButton

class FirstList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_list)
        views()
    }
    private fun views(){
        val items = arrayOf(
            "Cereal",
            "Eggs",
            "Cream Cheese",
            "Lamp",
            "Pillow",
            "Cups",
            "Light Bulb",
            "Iphone",
            "Xbox",
            "Dog Food",
            "Cat Litter",
            "Air Freshner",
            "Mr. Clean"

        )
        val state: Array<String> = resources.getStringArray(R.array.States)

        val firstBtn = findViewById<RadioButton>(R.id.firstBtn)
        firstBtn.setOnClickListener { firstList(items) }
        val secBtn = findViewById<RadioButton>(R.id.secBtn)
        secBtn.setOnClickListener { firstList(state) }


    }
    private fun firstList(array: Array<*>){
        val listView = findViewById<ListView>(R.id.list)

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,array)
        listView.adapter = arrayAdapter
    }
}