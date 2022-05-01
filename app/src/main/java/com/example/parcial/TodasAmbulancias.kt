package com.example.parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import mundo.SistemaDeUrgencias

class TodasAmbulancias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todas_ambulancias)
        val listaAmbulancias = findViewById<ListView>(R.id.todas_ambulancias_ta)
        val ambulancias = SistemaDeUrgencias.ListadeAmbulacias
        val adaptAmbulancias = ArrayAdapter(this, android.R.layout.simple_list_item_1, ambulancias)
        listaAmbulancias.adapter = adaptAmbulancias

    }
}