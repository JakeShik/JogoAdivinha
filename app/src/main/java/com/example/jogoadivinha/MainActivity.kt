package com.example.jogoadivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun enviarNumero (view: View){
        val editTextNumero = findViewById<TextView>(R.id.EditTextNumero)
        val edit
        val numeroAdv = editTextNumero.text.toString().toInt()
        val numeroC = 8
        if (numeroC > numeroAdv){

        }
    }
}


