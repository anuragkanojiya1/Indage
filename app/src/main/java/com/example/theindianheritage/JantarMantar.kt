package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class JantarMantar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jantar_mantar)

        val jmbtn = findViewById<MaterialButton>(R.id.jmbtn1)
        jmbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.yatra.com/indian-monuments/new-delhi/jantar-mantar"))
            startActivity(intent)
        }
    }
}