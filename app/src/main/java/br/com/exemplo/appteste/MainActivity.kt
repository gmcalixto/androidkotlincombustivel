package br.com.exemplo.appteste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btCalcular:Button = findViewById(R.id.btCalcular)
        var btSobre:Button = findViewById(R.id.btSobre)
        var editAlcool:EditText = findViewById(R.id.editAlcool)
        var editGasolina:EditText = findViewById(R.id.editGasolina)


        btSobre.setOnClickListener(View.OnClickListener {
            var intent= Intent(this,SobreActivity::class.java)
            startActivity(intent)
        })


        btCalcular.setOnClickListener(View.OnClickListener {


            if(editAlcool.text.isEmpty() || editAlcool.text.isEmpty()){
                Toast.makeText(this,"Os valores precisam ser preenchidos",Toast.LENGTH_LONG).show()
            }
            else{
                var precoAlcool = editAlcool.text.toString().toDouble()
                var precoGasolina = editGasolina.text.toString().toDouble()

                var razao = precoAlcool/precoGasolina

                Log.i("Resultado",razao.toString())


                var intent = Intent(this,ResultadoActivity::class.java)
                intent.putExtra("res",razao)

                startActivity(intent)
            }


        })



    }
}