package com.example.navegaoentretelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegaoentretelas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icNavegar.setOnClickListener {
            val navegarSegundaTela = Intent(this,SegundaTela::class.java)
            startActivity(navegarSegundaTela)
        }
    }
}