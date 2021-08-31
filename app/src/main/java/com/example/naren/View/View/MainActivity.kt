package com.example.naren.View.View

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.example.naren.R

class MainActivity : AppCompatActivity() {

    lateinit var sharedPreferences: SharedPreferences
    lateinit var saved : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.asgn)

        val btn = findViewById<Button>(R.id.btnIN)
        val checkbox = findViewById<CheckBox>(R.id.checkBox)
        val username = findViewById<EditText>(R.id.wperson)
        val password = findViewById<EditText>(R.id.password)

        loaddata()

        checkbox.setOnClickListener{
            storedata()
        }

        btn.setOnClickListener {
             if ((username.text.toString() == "naren@1234") && (password.text.toString() == "1234")) {

                    val intent = Intent(this, MainActivity2::class.java)
                    intent.putExtra("email", username.text.toString())
                    intent.putExtra("password", password.text.toString())
                    startActivity(intent)
            } else {

                Toast.makeText(applicationContext, "INVAILID INPUT", Toast.LENGTH_SHORT).show()

            }}




    }

    private fun storedata() {
        val username = findViewById<EditText>(R.id.wperson)

        var data = username.text.toString()
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putString("id", data)
        editor.putBoolean("marked",true )
        editor.apply()

        Toast.makeText(this,"saved",Toast.LENGTH_SHORT).show()
    }

    fun loaddata() {

        val username = findViewById<EditText>(R.id.wperson)
        sharedPreferences = getSharedPreferences("storage", MODE_PRIVATE)
        val saved =   sharedPreferences.getString("id", "")

        username.setText(saved)
    }

    /*fun display() {
        //val checkbox = findViewById<CheckBox>(R.id.checkBox)
        val username = findViewById<EditText>(R.id.wperson)

        username.setText(saved)
        //checkbox.isChecked = true
    }




    fun rememberuser() {
            sharedPreferences = getSharedPreferences("storage", MODE_PRIVATE)
            var data = loaddata()!!
            display(data)

        }*/





    }








