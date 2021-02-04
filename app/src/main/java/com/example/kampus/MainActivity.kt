package com.example.kampus

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username = findViewById<View>(R.id.email) as EditText
        val password = findViewById<View>(R.id.password) as EditText
        val login = findViewById<View>(R.id.masuk) as Button
        login.setOnClickListener {
            val user_name = username.text.toString()
            val pass_ = password.text.toString()
            if (user_name == "admin" && pass_ == "admin") {
                Toast.makeText(
                    applicationContext,
                    "Username dan Password benar Anda berhasil Login",
                    Toast.LENGTH_SHORT
                ).show()
//                startActivity(Intent(this, register::class.java))
            } else {
                Toast.makeText(
                    applicationContext,
                    "Username dan Pssword tidak sesuai Anda gagal Login",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}