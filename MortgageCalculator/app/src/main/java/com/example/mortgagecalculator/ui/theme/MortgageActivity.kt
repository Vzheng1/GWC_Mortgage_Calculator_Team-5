package com.example.mortgagecalculator.ui.theme

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.example.mortgagecalculator.R

class MortgageActivity : ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val housePrice = intent.getIntExtra("housePrice", 0)

        val housePriceTextView: TextView = findViewById(R.id.housePrice)
        val downPaymentEditText: EditText = findViewById(R.id.downPayment)
        val loanDurationSpinner: Spinner = findViewById(R.id.loanDuration)
        val interestRateEditText: EditText = findViewById(R.id.interestRate)
        val calculateButton: Button = findViewById(R.id.calculateButton)
        val mortgageResultTextView: TextView = findViewById(R.id.mortgageResult)

        val loanDurations = arrayOf("10", "15", "30")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, loanDurations)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        loanDurationSpinner.adapter = adapter

        calculateButton.setOnClickListener {
            val downPayment = downPaymentEditText.text.toString().toDoubleOrNull() ?: 0.0
            val loanDuration = loanDurationSpinner.selectedItem.toString().toIntOrNull() ?: 0
            val interestRate = interestRateEditText.text.toString().toDoubleOrNull() ?: 0.0

            if (loanDuration > 0 && interestRate > 0.0) {
                val loanAmount = housePrice - downPayment
                val monthlyInterestRate = interestRate / 100 / 12
                val numberOfPayments = loanDuration * 12

                val monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(
                    (1 + monthlyInterestRate), numberOfPayments.toDouble()
                )) / (Math.pow((1 + monthlyInterestRate), numberOfPayments.toDouble()) - 1)

                mortgageResultTextView.text =
                    "Monthly Payment: $${String.format("%.2f", monthlyPayment)}"

            } else {
                mortgageResultTextView.text = "Please enter valid values."
            }
        }
    }
}