package com.example.radiobuttonsurvey

import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgSurvey = findViewById<RadioGroup>(R.id.rgSurvey)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSubmit.setOnClickListener {
            val selectedId = rgSurvey.checkedRadioButtonId
            if (selectedId == -1) {
                tvResult.text = "Please select an option"
            } else {
                val selectedText = when (selectedId) {
                    R.id.rbExcellent -> "Excellent"
                    R.id.rbGood -> "Good"
                    R.id.rbAverage -> "Average"
                    R.id.rbPoor -> "Poor"
                    else -> ""
                }
                tvResult.text = "Your response: $selectedText"
            }
        }
    }
}