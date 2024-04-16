package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class TajMahal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_taj_mahal)

        val tmbtn = findViewById<MaterialButton>(R.id.tmbtn1)
        tmbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://asi.payumoney.com/quick/taj"))
            startActivity(intent)
        }
    }
}