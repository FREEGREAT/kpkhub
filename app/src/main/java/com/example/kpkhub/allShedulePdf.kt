package com.example.kpkhub

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.github.barteksc.pdfviewer.PDFView
import java.io.InputStream

class allShedulePdf : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_shedule_pdf)

        pdfView = findViewById(R.id.pdfView)
        val assetManager = this.assets
        val inputStream = assetManager.open("AllScheduleGroup.pdf")
        pdfView.fromStream(inputStream).load()

    }
}