package br.com.exemplo.appteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var razao = intent.getDoubleExtra("res",0.0)
        var txtResultado:TextView = findViewById(R.id.txtResultado)

        if(razao > 0.7){
            txtResultado.setText("Abasteça com Gasolina")
        }
        else if(razao < 0.7){
            txtResultado.setText("Abasteça com Álcool")
        }
        else{
            txtResultado.setText("Tanto faz")
        }

    }
}