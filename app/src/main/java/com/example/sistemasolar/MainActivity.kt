package com.example.sistemasolar

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar)) // Corregido

        val solarSystemImage: ImageView = findViewById(R.id.solarSystemImage)

        // Obtén referencias a los botones usando findViewById
        val mercuryButton: Button = findViewById(R.id.mercuryButton)
        val venusButton: Button = findViewById(R.id.venusButton)
        val marsButton: Button = findViewById(R.id.marsButton)
        val earthButton: Button = findViewById(R.id.earthButton)
        val jupiterButton: Button = findViewById(R.id.jupiterButton)
        val saturnButton: Button = findViewById(R.id.saturnButton)
        val uranusButton: Button = findViewById(R.id.uranusButton)
        val neptuneButton: Button = findViewById(R.id.neptuneButton)

        // Inicialmente, oculta TODOS los botones
        mercuryButton.alpha = 0f
        mercuryButton.isClickable = false

        venusButton.alpha = 0f
        venusButton.isClickable = false

        marsButton.alpha = 0f
        marsButton.isClickable = false

        earthButton.alpha = 0f
        earthButton.isClickable = false

        jupiterButton.alpha = 0f
        jupiterButton.isClickable = false

        saturnButton.alpha = 0f
        saturnButton.isClickable = false

        uranusButton.alpha = 0f
        uranusButton.isClickable = false

        neptuneButton.alpha = 0f
        neptuneButton.isClickable = false


        solarSystemImage.setOnClickListener {
            // Cuando se hace clic en la imagen, muestra TODOS los botones
            mercuryButton.alpha = 1f
            mercuryButton.isClickable = true

            venusButton.alpha = 1f
            venusButton.isClickable = true

            marsButton.alpha = 1f
            marsButton.isClickable = true

            earthButton.alpha = 1f
            earthButton.isClickable = true

            jupiterButton.alpha = 1f
            jupiterButton.isClickable = true

            saturnButton.alpha = 1f
            saturnButton.isClickable = true

            uranusButton.alpha = 1f
            uranusButton.isClickable = true

            neptuneButton.alpha = 1f
            neptuneButton.isClickable = true
        }


        marsButton.setOnClickListener {
            val intent = Intent(this, MarteActivity::class.java)
            startActivity(intent)
        }

        earthButton.setOnClickListener {
            val intent = Intent(this, TierraActivity::class.java)
            startActivity(intent)
        }

        jupiterButton.setOnClickListener {
            val intent = Intent(this, JupiterActivity::class.java)
            startActivity(intent)
        }

        saturnButton.setOnClickListener {
            val intent = Intent(this, SaturnoActivity::class.java)
            startActivity(intent)
        }

        uranusButton.setOnClickListener {
            val intent = Intent(this, UranoActivity::class.java)
            startActivity(intent)
        }

        mercuryButton.setOnClickListener {
            val intent = Intent(this, MercurioActivity::class.java)
            startActivity(intent)
        }

        neptuneButton.setOnClickListener {
            val intent = Intent(this, NeptunoActivity::class.java)
            startActivity(intent)
        }

    }
}