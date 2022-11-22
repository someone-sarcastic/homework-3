package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val number = findViewById<EditText>(R.id.number)
        val signup = findViewById<TextView>(R.id.signup)
        val nextpagebtn = findViewById<TextView>(R.id.nextpagebtn)

                findViewById<com.google.android.material.button.MaterialButton>(R.id.nextpagebtn).setOnClickListener {
            var username = username.text.toString()
            var password = password.text.toString()
            var number = number.text.toString()
            if (username == null) {
                Toast.makeText(this, "Please, enter your Usernaame", Toast.LENGTH_SHORT).show()
        }   else if (password == null) {
                Toast.makeText(this, "Please, enter your Password", Toast.LENGTH_SHORT).show()
        }   else if (number == null) {
                Toast.makeText(this, "Please, enter your Number", Toast.LENGTH_SHORT).show()
        }   else {
            signup.setTextColor(getColor(R.color.black))
            }

    }
    }
}