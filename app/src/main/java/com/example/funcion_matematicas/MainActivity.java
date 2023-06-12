package com.example.funcion_matematicas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre, Apellidos, Edad, Correo_Electronico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Nombre);
        Apellidos = findViewById(R.id.Apellidos);
        Edad = findViewById(R.id.Edad);
        Correo_Electronico = findViewById(R.id.Correo_Electronico);
    }

    public void submitData(View view) {
        String nombre = Nombre.getText().toString();
        String apellidos = Apellidos.getText().toString();
        int edad = Integer.parseInt(Edad.getText().toString());
        String correo_Electronico = Correo_Electronico.getText().toString();

        Intent intent = new Intent(this, SegundaPantalla.class);
        intent.putExtra("Nombre", nombre);
        intent.putExtra("Apellidos", apellidos);
        intent.putExtra("Edad", edad);
        intent.putExtra("Correo_Electronico", correo_Electronico);
        startActivity(intent);
    }
}
