package com.example.theindianheritage

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class CholaTemple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chola_temple)

        val ctbtn = findViewById<MaterialButton>(R.id.ctbtn1)
        ctbtn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.viator.com/tours/Thanjavur/Great-Living-Chola-Temples-Around-Thanjavur/d27741-50182P335"))
            startActivity(intent)
        }
    }
}