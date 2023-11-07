package com.example.actividad

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton

import androidx.appcompat.app.AppCompatActivity
import com.example.actividad.modelo.Usuario

class MainActivity : AppCompatActivity() {

    var apellido = ""
    var nombre = ""
    var rol=""
    lateinit var editTextNombre: EditText
    lateinit var editTextApellido: EditText
    lateinit var rdAlumno : RadioButton
    lateinit var rdProfesor : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextApellido = findViewById(R.id.editTextApellido)
        editTextNombre = findViewById(R.id.editTextNombre)
          rdAlumno = findViewById<RadioButton>(R.id.radioAlumno)
         rdProfesor = findViewById<RadioButton>(R.id.radioProfesor)

   }
    fun onAlta(view : View) {

                var rol = validar()
                val nombre = editTextNombre.text.toString()
               val apellido = editTextApellido.text.toString()
               val usuario = Usuario(nombre, apellido, rol)

                val mi_intent2 = Intent(this, SegundaActivity2::class.java)
               mi_intent2.putExtra("claseUsuario", usuario.getBundle())
              startActivity(mi_intent2)
        }
    fun   validar(): String {
         var rol =""

        if(rdAlumno.isChecked){
            rol="Alumno"
        }
        if(rdProfesor.isChecked){
            rol="Profesor"
        }
    return rol
    }


}