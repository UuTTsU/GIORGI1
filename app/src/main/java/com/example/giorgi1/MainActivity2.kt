package com.example.giorgi1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.giorgi1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            val numberString = intent.extras?.getString("number", "0")
            var number = numberString?.toIntOrNull() ?: 0
            numberInput.text = number.toString()

            clickBtn.setOnClickListener {
                number--
                numberInput.text = number.toString()
            }
        }
    }
}
