package com.example.webwiewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    lateinit var webView:WebView
    lateinit var progressBar:ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        progressBar = findViewById(R.id.progressBar)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

       webView.webChromeClient = object : WebChromeClient(){

            override fun onProgressChanged(view: WebView?, Progress: Int) {
               // super.onProgressChanged(view, newProgress)
                if (Progress == 100){
                    progressBar.visibility = View.GONE
                }else{
                    progressBar.visibility = View.VISIBLE
                    progressBar.progress = Progress
                }
            }
        }

       // webView.loadUrl("https://www.youtube.com/")
      ///  webView.loadUrl("https://www.divyabhaskar.co.in/")
        webView.loadUrl("https://www.google.co.in/")

        


    }

    override fun onBackPressed() {

        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }



    }


}