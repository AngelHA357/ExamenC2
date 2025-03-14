package mx.edu.itson.examen_uc2_huertajose

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetalleProducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_producto)

        val imagenProducto: ImageView = findViewById(R.id.ivProductoImagen)
        val nombreProducto: TextView = findViewById(R.id.tvProductoNombre)
        val precioProducto: TextView = findViewById(R.id.tvProductoPrecio)

        val datosRecibidos = intent.extras
        if (datosRecibidos != null) {
            imagenProducto.setImageResource(datosRecibidos.getInt("imagen"))
            nombreProducto.text = datosRecibidos.getString("nombre")
            precioProducto.text = datosRecibidos.getString("precio")
        }
    }
}
