package com.example.proyecto1trimestre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto1trimestre.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonCrearEncuesta.setOnClickListener {
            startActivity(Intent(this, CrearEncuesta::class.java))


            binding.botonVotar.setOnClickListener {
                startActivity(Intent(this, Votar::class.java))


            }
        }
    }
}