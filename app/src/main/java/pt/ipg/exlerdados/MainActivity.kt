package pt.ipg.exlerdados

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatViewInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object{

        const val Info_Extra_Nome = "Nome"

    }

    fun mostrarDados(view: View){

        val editTextName = findViewById<EditText>(R.id.editTextTextPersonName)
        val nome = editTextName.text.toString()

        val intent = Intent(this, MostrarDados::class.java).apply {

          //  putExtra(Info_Extra_Mensagem, mensagem)

        }

        startActivity(intent)

    }

}