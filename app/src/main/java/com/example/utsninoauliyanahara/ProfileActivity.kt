package com.example.utsninoauliyanahara

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsninoauliyanahara.databinding.ActivityMainBinding
import com.example.utsninoauliyanahara.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            homeIkon.setOnClickListener {
                val intentToLogin = Intent(this@ProfileActivity, MainActivity::class.java)
                startActivity(intentToLogin)
            }
        }
    }
}