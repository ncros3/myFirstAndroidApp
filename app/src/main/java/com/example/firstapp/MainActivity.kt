package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView(R.layout.activity_main)
        val text = TextView(this)
        text.text = R.string.app_name.toString() // id de l'app_name décrit dans strings.xml
        setContentView(text)
    }
}