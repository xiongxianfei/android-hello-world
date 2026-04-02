package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTap.setOnClickListener {
            binding.textHello.text = if (binding.textHello.text == getString(R.string.hello_world)) {
                getString(R.string.hello_android)
            } else {
                getString(R.string.hello_world)
            }
        }

        binding.btnDetails.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
