package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textHello = findViewById<TextView>(R.id.textHello)
        val btnTap = findViewById<Button>(R.id.btnTap)

        btnTap.setOnClickListener {
            textHello.text = if (textHello.text == getString(R.string.hello_world)) {
                getString(R.string.hello_android)
            } else {
                getString(R.string.hello_world)
            }
        }
    }
}
