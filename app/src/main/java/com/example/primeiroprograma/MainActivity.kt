package com.example.primeiroprograma

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = getColor(R.color.white)
        val button = findViewById<Button>(R.id.calculate)

        button.setOnClickListener {
            val distance = paraDouble(findViewById(R.id.edit_distance))
            val price = paraDouble(findViewById(R.id.edit_price))
            val autonomy = paraDouble(findViewById(R.id.edit_autonomy))

            val total = findViewById<TextView>(R.id.text_total)

            val valor: Double = distance / (autonomy * price)

            total.text = "R$" + "%,.2f".format(valor)
        }
    }

    private fun paraDouble(parameter: EditText): Double {
        val example = parameter.text.toString()

        return example.toDouble()
    }
}
