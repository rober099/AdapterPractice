package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class SpinAdapter (private val arrayList: ArrayList<SpinUser>): BaseAdapter() {
    lateinit var image: ImageView
    lateinit var spin_name : TextView

    override fun getCount() = arrayList.size
    override fun getItem(p0: Int) = p0
    override fun getItemId(p0: Int)= p0.toLong()
    override fun getView(p0: Int, covertView: View?, parent: ViewGroup?): View {
        var view = covertView
        view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.activity_spin_adapter,parent,false)

        image = view.findViewById(R.id.spin_image)
        spin_name = view.findViewById(R.id.spin_name)

        arrayList[p0].apply {
            image.setImageResource(images)
            spin_name.text = name
        }
        return view
    }
}