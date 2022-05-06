package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Spinner

class SpinCustomView : AppCompatActivity() {
    lateinit var spinView: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spin_custom_view)
        view()
    }

    private fun view(){
        val spinV = findViewById<Spinner>(R.id.spin)
        val arrayL = ArrayList<SpinUser>()
        arrayL.add(SpinUser(" Egypt",R.drawable.ic_baseline_flag_24))
        arrayL.add(SpinUser(" France",R.drawable.ic_baseline_flag_24))
        arrayL.add(SpinUser(" Japan", R.drawable.ic_baseline_flag_24))
        arrayL.add(SpinUser(" Barbados",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(SpinUser(" Africa",R.drawable.ic_baseline_self_improvement_24))
        arrayL.add(SpinUser(" Turkey",R.drawable.ic_baseline_two_wheeler_24))
        arrayL.add(SpinUser(" Ukraine",R.drawable.ic_baseline_spa_24))
        arrayL.add(SpinUser(" Zimbabwe",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(SpinUser(" South America",R.drawable.ic_baseline_flag_24))
        arrayL.add(SpinUser(" Syria",R.drawable.ic_baseline_sports_esports_24))
        arrayL.add(SpinUser(" Singapore",R.drawable.ic_baseline_sports_esports_24))

        val useAdapter = SpinAdapter(arrayL)
        spinV.adapter = useAdapter
    }
}