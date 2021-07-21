package com.example.radiobuttonkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btncalcular.setOnClickListener {

            var valor1 = ednum1.text.toString().toInt()
            var valor2 = ednum2.text.toString().toInt()

            if (rbop1.isChecked) {
                var suma = valor1 + valor2
                tvresultado.text = "La suma es: ${suma}"

            } else if (rbop2.isChecked) {
                var resta: Int
                resta = valor1 - valor2
                tvresultado.text = "La resta es: ${resta}"

            }

            if (rbop3.isChecked) {
                var multipicar = valor1 * valor2
                tvresultado.text = "La mulitiplicación es: ${multipicar}"

            } else if (rbop4.isChecked) {
                var dividir = valor1 / valor2
                tvresultado.text = "La division es: ${dividir}"

            }

        }

    }
}






