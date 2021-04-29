package pt.ipg.exlerdados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatViewInflater
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object{
        const val Info_Extra_Nome = "Nome"
        const val Info_Extra_Mail = "Mail"
        const val Info_Extra_Idade = "Idade"
        const val Info_Extra_Telemovel = "Telemovel"
    }

    fun mostrarDados(view: View) {

        val TextInputEditNome = findViewById<EditText>(R.id.TextInputEditNome)
        val nome = TextInputEditNome.text.toString()

        val TextInputEditMail = findViewById<EditText>(R.id.TextInputEditMail)
        val mail = TextInputEditMail.text.toString()

        val TextInputEditIdade = findViewById<EditText>(R.id.TextInputEditIdade)
        val idade = TextInputEditIdade.text.toString()

        val TextInputEditTelemovel = findViewById<EditText>(R.id.TextInputEditTelemovel)
        val telemovel = TextInputEditTelemovel.text.toString()

        val intent = Intent(this, MostrarDadosActivity::class.java).apply {

            putExtra(Info_Extra_Nome, nome)
            putExtra(Info_Extra_Mail, mail)
            putExtra(Info_Extra_Idade, idade)
            putExtra(Info_Extra_Telemovel, telemovel)

        }

        startActivity(intent)

    }

}