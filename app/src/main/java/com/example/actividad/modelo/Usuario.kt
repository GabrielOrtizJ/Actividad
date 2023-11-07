package com.example.actividad.modelo

import android.os.Bundle

class Usuario {
    var nombre:String
    var apellido:String
    var rol :String


    constructor(nombre: String, apellido: String,rol: String ) {
        this.nombre = nombre
        this.apellido = apellido
        this.rol = rol
    }
    constructor(bundle: Bundle){
        this.nombre = bundle.getString("nombre")!!
        this.apellido = bundle.getString("apellido")!!
        this.rol = bundle.getString("rol")!!
    }
    fun getBundle(): Bundle?{
        var bundle = Bundle()

        bundle.putString("nombre",this.nombre)
        bundle.putString("apellido", this.apellido)
        bundle.putString("rol", this.rol)
        return bundle
    }
}