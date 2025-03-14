package mx.edu.itson.examen_uc2_huertajose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val botonBebidasFrias = findViewById<Button>(R.id.btnColdDrinks)
        val botonBebidasCalientes = findViewById<Button>(R.id.btnHotDrinks)
        val botonDulces = findViewById<Button>(R.id.btnSweets)
        val botonSalados = findViewById<Button>(R.id.btnSalties)

        botonBebidasFrias.setOnClickListener {
            val intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Cold Drinks")
            startActivity(intent)
        }

        botonBebidasCalientes.setOnClickListener {
            val intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Hot Drinks")
            startActivity(intent)
        }

        botonDulces.setOnClickListener {
            val intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Sweets")
            startActivity(intent)
        }

        botonSalados.setOnClickListener {
            val intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Salties")
            startActivity(intent)
        }
    }
}
