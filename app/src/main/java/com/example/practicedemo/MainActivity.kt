package com.example.practicedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextView>(R.id.Email);
        val password= findViewById<TextView>(R.id.password);
        val loginB=findViewById<TextView>(R.id.loginB);
        loginB.setOnClickListener {
            if (email.text.isNullOrBlank() && password.text.isNullOrBlank())
            {
                Toast.makeText(this,"please fill the required details",Toast.LENGTH_SHORT).show()
            }
         else
            {
                intent = Intent(this,ActivityHome::class.java)
//                intent.putExtra("email", email.text.toString())
//                intent.putExtra("password",password.text.toString())
                startActivity(intent)
                Toast.makeText(this,"${email.text} is successfully Login",Toast.LENGTH_SHORT).show()
            }
        }

    }
}