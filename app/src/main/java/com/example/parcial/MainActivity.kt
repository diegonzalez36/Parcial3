package com.example.parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Boton Nueva Ambulancia
        val boton_nueva_ambulancia = findViewById<Button>(R.id.bn_nueva_ambulancia_ma)
        boton_nueva_ambulancia.setOnClickListener{
            val intent = Intent(this, NuevaAmbulancia::class.java)
            startActivity(intent)
        }
        //Boton Nuevo hospital
        val boton_nuevo_hospital = findViewById<Button>(R.id.bn_nuevo_hospital_ma)
        boton_nuevo_hospital.setOnClickListener{
            val intent = Intent(this, NuevoHospital::class.java)
            startActivity(intent)
        }
        //Boton Actualizar info ambulancia
        val boton_actualizar_ambulancia = findViewById<Button>(R.id.bn_actualizar_ambulancia_ma)
        boton_actualizar_ambulancia.setOnClickListener{
                val intent = Intent(this, ActualizarAmbulancia::class.java)
                startActivity(intent)
        }
        //Boton Informar accidente
        val boton_informar_acc = findViewById<Button>(R.id.bn_informar_accidente_ma)
        boton_actualizar_ambulancia.setOnClickListener{
                val intent = Intent(this, InformarAcc::class.java)
                startActivity(intent)
        }
        //Boton Llevar accidentado
        val boton_llevar_acc = findViewById<Button>(R.id.bn_llevar_accidentado_ma)
        boton_llevar_acc.setOnClickListener{
                val intent = Intent(this, LlevarAcc::class.java)
                startActivity(intent)
        }
        //Boton Dar de alta accidentado
        val boton_dar_de_alta = findViewById<Button>(R.id.bn_dar_de_alta_acc_ma)
        boton_dar_de_alta.setOnClickListener{
                val intent = Intent(this, DarDeAlta::class.java)
                startActivity(intent)
        }
        //Boton Todas las ambulancias
        val boton_mostar_todas_ambulancias = findViewById<Button>(R.id.bn_mostrar_todas_amb_ma)
        boton_mostar_todas_ambulancias.setOnClickListener{
                val intent = Intent(this, TodasAmbulancias::class.java)
                startActivity(intent)
        }
        //Boton Todos los hospitales
        val boton_mostrar_todos_hospitales = findViewById<Button>(R.id.bn_mostrar_todos_hosp_ma)
        boton_mostrar_todos_hospitales.setOnClickListener{
                val intent = Intent(this, TodosHospitales::class.java)
                startActivity(intent)
        }
        //Boton Pacientes de un hospital
        val boton_mostrar_pacientes = findViewById<Button>(R.id.bn_mostrar_pacientes_ma)
        boton_mostrar_pacientes.setOnClickListener{
                val intent = Intent(this, PacientesHospital::class.java)
                startActivity(intent)
        }
        //Boton Ambulancias libres
        val boton_ambulancias_libres = findViewById<Button>(R.id.bn_mostrar_amb_libres_ma)
        boton_ambulancias_libres.setOnClickListener{
                val intent = Intent(this, AmbulanciasLibres::class.java)
                startActivity(intent)
        }
        //Boton Ambulancias ocupadas
        val boton_ambulancias_ocupadas = findViewById<Button>(R.id.bn_mostrar_amb_ocup_ma)
        boton_ambulancias_ocupadas.setOnClickListener{
                val intent = Intent(this, AmbulanciasOcup::class.java)
                startActivity(intent)
        }
        //Boton Informacion hospital
        val boton_mostrar_info_hospital = findViewById<Button>(R.id.bn_mostrar_info_hospital_ma)
        boton_mostrar_info_hospital.setOnClickListener{
                val intent = Intent(this, InformacionHospital::class.java)
                startActivity(intent)
        }
    }
}