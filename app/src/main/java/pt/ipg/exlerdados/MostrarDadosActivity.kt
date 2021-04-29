package pt.ipg.exlerdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarDadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        val nome = intent.getStringExtra(MainActivity.Info_Extra_Nome)
        val mail = intent.getStringExtra(MainActivity.Info_Extra_Mail)
        val idade = intent.getStringExtra(MainActivity.Info_Extra_Idade)
        val telemovel = intent.getStringExtra(MainActivity.Info_Extra_Telemovel)

        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.setText(nome)

        val textViewMail = findViewById<TextView>(R.id.textViewMail)
        textViewMail.setText(mail)

        val textViewIdade = findViewById<TextView>(R.id.textViewIdade)
        textViewIdade.setText(idade)

        val textViewTelemovel = findViewById<TextView>(R.id.textViewTelemovel)
        textViewTelemovel.setText(telemovel)
    }
}