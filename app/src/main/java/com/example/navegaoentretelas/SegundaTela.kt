package com.example.navegaoentretelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegaoentretelas.databinding.ActivitySegundaTelaBinding

class SegundaTela : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaTelaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaTelaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icVoltar.setOnClickListener{
            val voltarTelaPrincipal = Intent(this,MainActivity::class.java)
            startActivity(voltarTelaPrincipal)
        }
    }
}