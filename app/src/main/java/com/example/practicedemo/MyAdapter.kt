package com.example.practicedemo

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class MyAdapter(private val context: Activity,private val arrayList:ArrayList<User>) :ArrayAdapter<User>(context,R.layout.list_item,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflator:LayoutInflater = LayoutInflater.from(context)
        val view:View= inflator.inflate(R.layout.list_item,null)

        val imageView = view.findViewById<ImageView>(R.id.profile_image)
        val userName = view.findViewById<TextView>(R.id.personName)
        val lastMessage = view.findViewById<TextView>(R.id.lastMessage)
        val time = view.findViewById<TextView>(R.id.time)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].username
        lastMessage.text = arrayList[position].lastmessage
        time.text = arrayList[position].time

        return view
    }
}