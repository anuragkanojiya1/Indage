package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class BodhGaya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bodh_gaya)

        val bgbtn = findViewById<MaterialButton>(R.id.bgbtn1)
        bgbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.yatra.com/indian-monuments/bodh-gaya/archaeological-museum"))
            startActivity(intent)
        }
    }
}