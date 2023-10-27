package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val email = intent.getStringExtra("email")
        val userName = intent.getStringExtra("userName")
        val firstName = intent.getStringExtra("firstName")
        val lastName = intent.getStringExtra("lastName")
        val age = intent.getStringExtra("age")

        findViewById<AppCompatTextView>(R.id.tvEmail).text = email
        findViewById<AppCompatTextView>(R.id.tvUserName).text = userName
        findViewById<AppCompatTextView>(R.id.tvFirstAndLastname).text = firstName + " " + lastName
        findViewById<AppCompatTextView>(R.id.tvAge).text = age

        val btn =  findViewById<AppCompatButton>(R.id.btnAgain)
        btn.setOnClickListener(){
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }

    }
}