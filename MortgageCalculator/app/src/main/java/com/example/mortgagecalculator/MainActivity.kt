package com.example.mortgagecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
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
import android.widget.EditText
import android.widget.TextView


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etHomeValue = findViewById<EditText>(R.id.etHomeValue)
        val etDownPayment = findViewById<EditText>(R.id.etDownPayment)
        val etLoanPayment = findViewById<EditText>(R.id.etLoanPayment)
    }
}



