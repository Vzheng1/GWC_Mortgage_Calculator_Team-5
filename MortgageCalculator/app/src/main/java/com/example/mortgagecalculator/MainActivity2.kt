package com.example.mortgagecalculator

import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.mortgagecalculator.ui.theme.MortgageActivity

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mortgagecalculator.ui.theme.MortgageCalculatorTheme



class MainActivity2 : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val mortgageButton1: Button = findViewById(R.id.mortgageButton1)

        mortgageButton1.setOnClickListener {
            val intent = Intent(this, MortgageActivity::class.java)
            intent.putExtra("housePrice", 300000)
            startActivity(intent)
        }

    }
}

