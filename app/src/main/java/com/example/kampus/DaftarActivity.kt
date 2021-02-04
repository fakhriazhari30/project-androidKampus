package com.example.kampus

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.list.*

class DaftarActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.list)

        button3.setOnClickListener {
            val intent = Intent(this@DaftarActivity, KeteranganActivity::class.java)
            startActivity(intent)
        }

    }
}