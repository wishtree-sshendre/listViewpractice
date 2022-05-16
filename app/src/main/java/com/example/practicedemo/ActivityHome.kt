package com.example.practicedemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practicedemo.databinding.ActivityHomeBinding
import java.util.ArrayList

class ActivityHome : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    private lateinit var userArrayList: ArrayList<User>

    //    lateinit var email: TextView
//    lateinit var password:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         //setContentView(R.layout.activity_home)
          binding = ActivityHomeBinding.inflate(layoutInflater)
          setContentView(binding.root)



    val imageID = intArrayOf(R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e,)
    val username =
        arrayOf("sonal shendre", "virat", "aarti kathane", "aakash khapekar", "avinash tarnekar","sonal shendre", "virat", "aarti kathane", "aakash khapekar", "avina tarnekar",)
    val lastmessage = arrayOf("how are you", "hi", "where are you", "welcome", "miss you","how are you", "hi", "where are you", "welcome", "miss you",)
    val phoneNo = arrayOf("4552814555", "4896753222", "49676555555", "8976453215", "8967451235","4552814555", "4896753222", "49676555555", "8976453215", "8967451235",)
    val time = arrayOf("1.45 pm", "8.00 am", "2.44 pm", "9.08 am", "5.00 am","1.45 pm", "8.00 am", "2.44 pm", "9.08 am", "5.00 am",)
    val country = arrayOf("India", "USA", "London", "India","Japan","India", "USA", "London", "India","Japan",)

    userArrayList = ArrayList()

    for (i in username.indices){


        val user = User(
            username[i],
            lastmessage[i],
            time[i],
            country[i],
            phoneNo[i],
            imageID[i]
        )
        userArrayList.add(user)
    }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

                val username = username[position]
                val phone = phoneNo[position]
                val country = country[position]
                val imageId = imageID[position]
                val  intent = Intent(this@ActivityHome,UserActivity::class.java)
                intent.putExtra("username",username)
                intent.putExtra("country",country)
                intent.putExtra("phoneNo",phone)
                intent.putExtra("imageId",imageId)
                startActivity(intent)
            }

//        email= findViewById(R.id.email_text)
//        password=findViewById(R.id.password_text)
//
//         to get value from previous activity
//        val emailText=  intent.getStringExtra("email")
//        val passwordText =  intent.getStringExtra("password")
//        email.text = emailText
//        password.text =passwordText

        }
    }
}






