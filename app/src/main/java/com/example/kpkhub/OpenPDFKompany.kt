package com.example.kpkhub

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebBackForwardList
import android.webkit.WebView
import android.webkit.WebViewClient

class OpenPDFKompany : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_pdfkompany)

        val opendPdfWeb = findViewById<WebView>(R.id.openPdfWeb)
        opendPdfWeb?.settings?.javaScriptEnabled = true
        opendPdfWeb?.settings?.allowContentAccess = true
        opendPdfWeb?.settings?.domStorageEnabled = true
        opendPdfWeb?.settings?.useWideViewPort = true
        opendPdfWeb?.settings?.loadWithOverviewMode = true
        opendPdfWeb?.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        opendPdfWeb?.webViewClient = SSLTolerentWebViewClient()
        opendPdfWeb?.loadUrl("https://drive.google.com/file/d/1bjK5K-zcNTsY2RzZlVtLHwwf9asrLAWH/view")
    }
}