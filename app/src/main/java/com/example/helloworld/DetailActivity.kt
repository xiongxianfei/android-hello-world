package com.example.helloworld

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = getString(R.string.detail_title)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
