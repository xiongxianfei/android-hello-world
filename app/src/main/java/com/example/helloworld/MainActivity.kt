package com.example.helloworld

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.helloworld.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTap.setOnClickListener { viewModel.toggleGreeting() }
        binding.btnDetails.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.greeting.collect { greeting ->
                    binding.textHello.text = getString(
                        when (greeting) {
                            MainViewModel.Greeting.HELLO_WORLD -> R.string.hello_world
                            MainViewModel.Greeting.HELLO_ANDROID -> R.string.hello_android
                        }
                    )
                }
            }
        }
    }
}
