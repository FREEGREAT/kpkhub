package com.example.kpkhub

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class KursyActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kursy)
        val exit = findViewById<Button>(R.id.exitKursy)
        exit.setOnClickListener {
            finish()
        }
        val openSignInKursy = findViewById<Button>(R.id.signInKursy)
        openSignInKursy.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

}