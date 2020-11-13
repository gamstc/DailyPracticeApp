package com.example.dailypracticeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity() : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.startButton)
        val webview = findViewById<WebView>(R.id.webview)
        webview.settings.javaScriptEnabled = true

        generateExercise(webview)

        startButton.setOnClickListener {
          generateExercise(webview)
        }
    }

    private fun generateExercise(webview: WebView){
        val exerciseList = listOf<String>("https://h5p.org/h5p/embed/1396","https://h5p.org/h5p/embed/63697", "https://h5p.org/h5p/embed/611", "https://h5p.org/h5p/embed/6725", "https://h5p.org/h5p/embed/63159")
        val rand = Random.nextInt(5)
        webview.loadUrl(exerciseList.get(rand))
    }

}