package com.example.adapterpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapt(private val arrayList: ArrayList<User>): BaseAdapter() {
    lateinit var image: ImageView
    lateinit var user_name : TextView
    lateinit var user_hobby: TextView

    override fun getCount() = arrayList.size
    override fun getItem(p0: Int) = p0
    override fun getItemId(p0: Int)= p0.toLong()
    override fun getView(p0: Int, covertView: View?, parent: ViewGroup?): View {
        var view = covertView
        view = LayoutInflater.from(parent?.context)
            .inflate(R.layout.activity_user_adapt,parent,false)

        image = view.findViewById(R.id.user_image)
        user_name = view.findViewById(R.id.name)
        user_hobby = view.findViewById(R.id.hobby)

        arrayList[p0].apply {
            image.setImageResource(images)
            user_name.text = name
            user_hobby.text = hobby
        }
         return view
    }

    }
