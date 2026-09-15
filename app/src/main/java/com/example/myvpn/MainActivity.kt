package com.example.myvpn

import android.app.Activity
import android.content.Intent
import android.net.VpnService
import android.os.Bundle

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = VpnService.prepare(this)

        if (intent != null) {
            startActivityForResult(intent, 0)
        } else {
            startVpn()
        }
    }

    private fun startVpn() {
        startService(
            Intent(this, MyVpnService::class.java)
        )
    }
}