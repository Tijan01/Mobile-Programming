package com.example.item23

import android.content.Intent
import android.net.Uri
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openNetflix(view: View) {
        val url = "https://www.netflix.com/browse"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    fun dialNumber(view: View) {
        val phoneNumber = "089672957230"
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
        startActivity(intent)
    }

    fun openMap(view: View) {
        val location = "latitude,longitude"
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$location"))
        startActivity(intent)
    }

    fun shareText(view: View) {
        val text = R.string.nim
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, text)
        startActivity(Intent.createChooser(intent, "Share via"))
    }
}