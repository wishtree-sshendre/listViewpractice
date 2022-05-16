package com.example.practicedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.practicedemo.databinding.ActivityHomeBinding
import com.example.practicedemo.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_user)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

         val name= intent.getStringExtra("username")
        val country= intent.getStringExtra("country")
        val phoneNo= intent.getStringExtra("phoneNo")
        val imageId=intent.getIntExtra("imageId",R.drawable.a)

        binding.nameUser.text =name
        binding.country.text=country
        binding.phoneno.text=phoneNo
        binding.profilePic.setImageResource(imageId)



    }
}