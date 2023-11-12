package com.example.mad_practical_7_21012011081

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class YouTubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_you_tube)

        val youtubeID = "l04omgNTOt0"
        val myWebView = findViewById<WebView>(R.id.myweb1)

        val settings = myWebView.settings
        settings.javaScriptEnabled=true

        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true

        myWebView.loadUrl("https://www.youtube.com/embed/$youtubeID")
    }

}