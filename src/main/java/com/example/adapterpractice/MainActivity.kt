package com.example.adapterpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.RadioButton
import android.widget.Toast
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //views()
    }



    private fun firstList(){
        Toast.makeText(this,"Accepted", Toast.LENGTH_LONG).show()
        val intent = Intent(this,FirstList::class.java)
        startActivity(intent)
    }

    private fun secList(){
        Toast.makeText(this,"Accepted", Toast.LENGTH_LONG).show()
        val intent = Intent(this,SecList::class.java)
        startActivity(intent)
    }
}
