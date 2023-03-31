package com.example.kpkhub

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signinkursy)

        val webViewSignIn = findViewById<WebView>(R.id.signInWebView)

        webViewSignIn?.settings?.javaScriptEnabled = true
        webViewSignIn?.settings?.allowContentAccess = true
        webViewSignIn?.settings?.domStorageEnabled = true
        webViewSignIn?.settings?.useWideViewPort = true
        webViewSignIn?.settings?.loadWithOverviewMode = true
        webViewSignIn?.webViewClient = object : WebViewClient() {
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webViewSignIn?.webViewClient = SSLTolerentWebViewClient()
        webViewSignIn?.loadUrl("https://kpk-lp.com.ua/entrant/prepare-course")
    }


}