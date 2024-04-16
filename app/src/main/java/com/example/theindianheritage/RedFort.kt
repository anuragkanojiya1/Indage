package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class RedFort : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_red_fort)

        val rfbtn = findViewById<MaterialButton>(R.id.rfbtn1)
        rfbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.yatra.com/indian-monuments/new-delhi/red-fort"))
            startActivity(intent)
        }
    }
}