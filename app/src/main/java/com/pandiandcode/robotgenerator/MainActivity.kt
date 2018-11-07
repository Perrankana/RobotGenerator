package com.pandiandcode.robotgenerator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val ROBOT_HASH_URL = "https://robohash.org/"
    }

    lateinit var image: ImageView
    lateinit var input: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    private fun setupView() {
        image = findViewById(R.id.image)
        input = findViewById(R.id.input)
    }
}
