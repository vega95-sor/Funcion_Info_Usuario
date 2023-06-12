package com.example.funcion_matematicas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

    public class SegundaPantalla extends AppCompatActivity {
        private TextView textViewData;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            textViewData = findViewById(R.id.textViewData);

            Intent intent = getIntent();
            String nombre = intent.getStringExtra("Nombre");
            String apellidos = intent.getStringExtra("Apellidos");
            int edad = intent.getIntExtra("Edad", 0);
            String correo_Electronico = intent.getStringExtra("Correo_Electronico");

            String data = "Nombre: " + nombre + "\n" +
                    "Apellidos: " + apellidos + "\n" +
                    "Edad: " + edad + "\n" +
                    "Correo electrónico: " + correo_Electronico;

            textViewData.setText(data);
        }
    }


