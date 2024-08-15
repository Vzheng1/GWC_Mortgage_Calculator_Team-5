package com.example.mortgagecalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.example.mortgagecalculator.ui.theme.MortgageActivity


class HousesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_houses)

        val mortgageButton1: Button = findViewById(R.id.mortgageButton1)
        val mortgageButton2: Button = findViewById(R.id.mortgageButton2)

        mortgageButton1.setOnClickListener {
            val intent = Intent(this, MortgageActivity::class.java)
            intent.putExtra("housePrice", 300000)
            startActivity(intent)
        }

        mortgageButton2.setOnClickListener {
            val intent = Intent(this, MortgageActivity::class.java)
            intent.putExtra("housePrice", 450000)
            startActivity(intent)
        }
    }
}
