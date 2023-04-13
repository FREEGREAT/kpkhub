package com.example.kpkhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KompanyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_kompany)

        val openPdf: Button = findViewById(R.id.openPdf)
        openPdf.setOnClickListener{
            val intent = Intent(this, OpenPDFKompany::class.java)
            startActivity(intent)
        }
    }



}