package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class QutubMinar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qutub_minar)

        val qmbtn = findViewById<MaterialButton>(R.id.qmbtn1)
        qmbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.yatra.com/indian-monuments/new-delhi/qutub-minar"))
            startActivity(intent)
        }
    }
}