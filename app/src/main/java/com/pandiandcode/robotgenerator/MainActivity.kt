package com.pandiandcode.robotgenerator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var input: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
        setupClickListener()
    }

    private fun setupView() {
        image = findViewById(R.id.image)
        input = findViewById(R.id.input)
        button = findViewById(R.id.button)
    }

    private fun setupClickListener() {
        button.setOnClickListener {
            
        }
    }
}
