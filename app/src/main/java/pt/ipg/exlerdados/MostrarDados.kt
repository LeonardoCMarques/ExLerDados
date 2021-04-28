package pt.ipg.exlerdados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostrarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        val nome =intent.getStringExtra(MainActivity.Info_Extra_Nome)

        val textViewNome = findViewById<TextView>(R.id.textViewNome)
        textViewNome.setText(nome)

    }
}