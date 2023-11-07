package com.example.actividad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.actividad.modelo.Usuario

class SegundaActivity2 : AppCompatActivity() {
    lateinit var textViewRol: TextView
    lateinit var textViewNombre: TextView
    lateinit var textViewApellido: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda2)

        textViewRol = findViewById(R.id.textViewRol)
        textViewNombre = findViewById(R.id.textViewNombre )
        textViewApellido = findViewById(R.id.textViewApellido)




        var bundleUsuario = intent.getBundleExtra("claseUsuario")
        var usuario = Usuario(bundleUsuario!!)

        textViewNombre.text = usuario.nombre
        textViewApellido.text= usuario.apellido
        textViewRol.text = usuario.rol



    }
    fun onVolver(view : View) {
        val mi_intent = Intent(this, MainActivity::class.java)

        startActivity(mi_intent)
        finish()
    }
}