package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomView : AppCompatActivity() {
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)
        view()
    }
    private fun view(){
        val listV = findViewById<ListView>(R.id.custom_list)
        val arrayL = ArrayList<User>()
        arrayL.add(User(" Alyssa","Singing",R.drawable.ic_baseline_self_improvement_24))
        arrayL.add(User(" Abhishek","Motorcycle",R.drawable.ic_baseline_two_wheeler_24))
        arrayL.add(User(" Sara","Meditation",R.drawable.ic_baseline_spa_24))
        arrayL.add(User(" Patrick","Video Games",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(User(" Mia","Dancing",R.drawable.ic_baseline_self_improvement_24))
        arrayL.add(User(" Jesus","Carpenter",R.drawable.ic_baseline_two_wheeler_24))
        arrayL.add(User(" Ana","Meditation",R.drawable.ic_baseline_spa_24))
        arrayL.add(User(" Star","Video Games",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(User(" Lizz","100% That Chick",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(User(" Maria","Being Angelic",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(User(" Vonte","Being Woke AF",R.drawable.ic_baseline_sports_esports_24))

        val useAdapter = UserAdapt(arrayL)
        listV.adapter = useAdapter
    }

}