package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import mundo.SistemaDeUrgencias
import java.lang.Exception

class NuevaAmbulancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_ambulancia)
        val boton_ingresar = findViewById<Button>(R.id.bn_ingresar_na)
        boton_ingresar.setOnClickListener{
            val txt_codigo = findViewById<EditText>(R.id.codigo_na)
            val txt_calle = findViewById<EditText>(R.id.calle_na)
            val txt_carrera = findViewById<EditText>(R.id.carrera_na)
        try{
            val codigo = txt_codigo.text.toString().toInt()
            val calle = txt_calle.text.toString().toInt()
            val carrera = txt_carrera.text.toString().toInt()
            SistemaDeUrgencias.AgregarAmbulancia(codigo, calle, carrera)
        }
        catch(e:Exception){
            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
        }
        }



    }
}