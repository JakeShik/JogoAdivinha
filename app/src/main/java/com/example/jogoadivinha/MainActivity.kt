package com.example.jogoadivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    private val random = Random()
    private var numeroF = 0
    private var tentativas = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novoJogo()
    }

    private fun novoJogo() {
        numeroF = random.nextInt(10) +1

        atualizaTentativas()
    }

    private fun atualizaTentativas() {
        findViewById<TextView>(R.id.textViewTentativas).text = getString(R.string.tentativas_restantes) + tentativas
    }

    fun enviarNumero (view: View){
        val editTextNumero = findViewById<TextView>(R.id.EditTextNumero)
        val numeroAdv = editTextNumero.text.toString().toIntOrNull()
        when(numeroAdv){
            in 1..10 -> verificaSeAcertou(numeroAdv!!)
            null -> editTextNumero.error = "Introduza um número entre 1 e 10"
            else -> editTextNumero.error = "O número deve estar entre 1 e 10"
        }
    }

    private fun verificaSeAcertou(numeroAdv: Int) {
        val textViewFeedback = findViewById<TextView>(R.id.textViewFeedBack)
        tentativas++
        atualizaTentativas()
        if(numeroAdv==numeroF){
            textViewFeedback.text = getString(R.string.parab_ns_acertou)
            querJogarNovamente()
        }else if (numeroAdv > numeroF){
            textViewFeedback.text = getString(R.string.numero_maior)
        }else{
            textViewFeedback.text = getString(R.string.numero_menor)
        }
    }
    private fun querJogarNovamente(){

    }
}


