package com.example.kpkhub

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class BuyActivity : AppCompatActivity()  {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy)

        val kitsanyuk = findViewById<TextView>(R.id.urlKitsanyuk)
        val kuryshchuk = findViewById<TextView>(R.id.urlKuryshchuk)
        val dmitrenko = findViewById<TextView>(R.id.urlDmitrenko)
        val kidanetska = findViewById<TextView>(R.id.urlKidanetska)

        kitsanyuk.setOnClickListener{
            val telegramUrl = "https://t.me/pashakrasava"
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse(telegramUrl))
            telegramIntent.setPackage("org.telegram.messenger")
            startActivity(telegramIntent)
        }
        kuryshchuk.setOnClickListener{
            val telegramUrl = "https://t.me/Kuryshchuk"
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse(telegramUrl))
            telegramIntent.setPackage("org.telegram.messenger")
            startActivity(telegramIntent)
        }
        dmitrenko.setOnClickListener{
            val telegramUrl = "https://t.me/F_blxxd_T"
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse(telegramUrl))
            telegramIntent.setPackage("org.telegram.messenger")
            startActivity(telegramIntent)
        }
        kidanetska.setOnClickListener{
            val telegramUrl = "https://t.me/takeitorleaveeit"
            val telegramIntent = Intent(Intent.ACTION_VIEW, Uri.parse(telegramUrl))
            telegramIntent.setPackage("org.telegram.messenger")
            startActivity(telegramIntent)
        }


    }
}