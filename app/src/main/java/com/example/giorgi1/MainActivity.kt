package com.example.giorgi1


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.giorgi1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {

            okayButton.setOnClickListener{
                val number = userNumber.text.toString()

                displayText.text = "Your number is $number"
            }


            nextButton.setOnClickListener{
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("number", userNumber.text.toString())

                startActivity(intent)
                finish()
            }

        }

    }
}



