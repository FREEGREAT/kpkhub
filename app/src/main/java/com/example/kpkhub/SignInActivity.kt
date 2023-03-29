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
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_signinkursy)

        val webViewSignIn = findViewById<WebView>(R.id.signInWebView)

        webViewSignIn?.settings?.javaScriptEnabled = true
        webViewSignIn?.settings?.allowContentAccess = true
        webViewSignIn?.settings?.domStorageEnabled = true
        webViewSignIn?.settings?.useWideViewPort = true
        webViewSignIn?.settings?.loadWithOverviewMode = true
        webViewSignIn?.setWebViewClient(
            SSLTolerentWebViewClient()
        )
        webViewSignIn?.loadUrl("https://kpk-lp.com.ua/entrant/prepare-course")
    }

}