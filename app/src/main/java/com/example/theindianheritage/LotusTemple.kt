package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class LotusTemple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lotus_temple)

        val ltbtn1 = findViewById<MaterialButton>(R.id.ltbtn1)
        ltbtn1.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://delhitourism.travel/lotus-temple-bahai-temple-delhi#:~:text=Entry%20Fee%20of%20Lotus%20Temple%2C%20Delhi"))
            startActivity(intent)
        }
    }
}