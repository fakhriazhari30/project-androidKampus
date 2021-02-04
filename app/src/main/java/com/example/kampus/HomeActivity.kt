package com.example.kampus

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        daftarkampus.setOnClickListener {
            val intent = Intent(this@HomeActivity, DaftarActivity::class.java)
            startActivity(intent)
        }
    }
}