package com.example.myvpn

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "MyVPN çalışıyor!"
        text.textSize = 28f
        text.setPadding(40, 40, 40, 40)

        setContentView(text)
    }
}