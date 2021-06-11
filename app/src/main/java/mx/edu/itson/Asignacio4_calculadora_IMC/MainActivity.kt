package mx.edu.itson.Asignacio4_calculadora_IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var estatura:Float = 0.0f
    var peso:Float = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText_estatura:EditText = findViewById(R.id.editTextNumberDecimal_estatura)
        val editText_peso:EditText = findViewById(R.id.editTextNumberDecimal_peso)
        val button_calcularIMC:Button = findViewById(R.id.button_imc)
        val textView_imc:TextView = findViewById(R.id.textView_imc)

        button_calcularIMC.setOnClickListener{
            this.estatura = editText_estatura.text.toString().toFloat()
            this.peso = editText_peso.text.toString().toFloat()
            var imc = peso/estatura
            textView_imc.setText(imc.toString())
        }


    }
}