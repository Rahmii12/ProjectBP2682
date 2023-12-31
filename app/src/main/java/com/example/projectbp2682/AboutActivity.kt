package com.example.projectbp2682

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        //instance
        val imgCall:ImageView = findViewById(R.id.imageViewCall)
        //event saat image call di-klik
        imgCall.setOnClickListener {
            val callIntent:Intent = Uri.parse("tell:085456735276").let {number->Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }
    }
}