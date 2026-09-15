      package com.example.myvpn

import android.app.Activity
import android.content.Intent
import android.net.VpnService
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    private lateinit var statusText: TextView
    private lateinit var connectButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        statusText = findViewById(R.id.statusText)
        connectButton = findViewById(R.id.connectButton)

        connectButton.setOnClickListener {
            val intent = VpnService.prepare(this)

            if (intent != null) {
                startActivityForResult(intent, 0)
            } else {
                startVpn()
            }
        }
    }

    private fun startVpn() {
        startService(
            Intent(this, MyVpnService::class.java)
        )

        statusText.text = "VPN açık"
        connectButton.text = "VPN ÇALIŞIYOR"
    }
}