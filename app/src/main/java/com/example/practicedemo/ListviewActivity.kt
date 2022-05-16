package com.example.practicedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ListviewActivity : AppCompatActivity() {

    val names = arrayOf("sonal","aarti","dimple","ishan","sneha","heena","sonal","aarti","dimple","ishan","sneha","heena",)
  lateinit var listview:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)
        listview = findViewById(R.id.list_view)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        listview.adapter=adapter
        listview.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                Toast.makeText(applicationContext,"hi i am "+ names[position],Toast.LENGTH_SHORT).show()
            }

        }
    }
}