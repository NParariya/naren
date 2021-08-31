package com.example.naren.View.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.naren.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val email = findViewById<TextView>(R.id.textView)
        val password = findViewById<TextView>(R.id.textView2)


        val intentValueEmailId = intent.getStringExtra("email")
            email.text = intentValueEmailId


        val intentValuepassword = intent.getStringExtra("password")
            password.text = intentValuepassword


    }
}