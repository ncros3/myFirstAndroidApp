package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appName = getResources().getString(R.string.app_name) // on récupère la chaîne de caractères associée à l'ID

        val text = TextView(this)
        text.text = appName // affichage du nom de l'appli
        setContentView(text)
    }
}