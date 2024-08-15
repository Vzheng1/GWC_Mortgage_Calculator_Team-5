package com.example.mortgagecalculator


import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
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






class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        // Get the spinner from the xml layout
        val dropdown = findViewById<Spinner>(R.id.spinner)


        // Create a list of items for the spinner
        val items = arrayOf("1", "2", "3", "4", "5", "6", "7")


        // Create an adapter for the spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)


        // Set the adapter for the spinner
        dropdown.adapter = adapter


    }


}
