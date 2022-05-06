package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SecList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec_list)
        views()
    }

    private fun views(){
        val state: Array<String> = resources.getStringArray(R.array.States)
        val list = findViewById<ListView>(R.id.state_list)

        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_expandable_list_item_1,
            state
        )
        list.adapter = arrayAdapter
    }
}