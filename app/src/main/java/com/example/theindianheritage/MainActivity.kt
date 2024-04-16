package com.example.theindianheritage

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ltbtn = findViewById<MaterialButton>(R.id.ltbtn)
        ltbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, LotusTemple::class.java)
            startActivity(intent)
        }

        val rfbtn = findViewById<MaterialButton>(R.id.rfbtn)
        rfbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, RedFort::class.java)
            startActivity(intent)
        }

        val ctbtn = findViewById<MaterialButton>(R.id.ctbtn)
        ctbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, CholaTemple::class.java)
            startActivity(intent)
        }

        val jmbtn = findViewById<MaterialButton>(R.id.jmbtn)
        jmbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, JantarMantar::class.java)
            startActivity(intent)
        }

        val bgbtn = findViewById<MaterialButton>(R.id.bgbtn)
        bgbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, BodhGaya::class.java)
            startActivity(intent)
        }

        val qmbtn = findViewById<MaterialButton>(R.id.qmbtn)
        qmbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, QutubMinar::class.java)
            startActivity(intent)
        }

        val tmbtn = findViewById<MaterialButton>(R.id.tmbtn)
        tmbtn.setOnClickListener{
            val intent = Intent(this@MainActivity, TajMahal::class.java)
            startActivity(intent)
        }

    }
}