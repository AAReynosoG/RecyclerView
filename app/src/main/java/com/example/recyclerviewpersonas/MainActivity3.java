package com.example.recyclerviewpersonas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    String nombre, edad, pais, matricula;
    TextView txtN, txtE, txtP, txtM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txtN = findViewById(R.id.eNombre);
        txtE = findViewById(R.id.eEdad);
        txtP = findViewById(R.id.ePais);
        txtM = findViewById(R.id.eMatricula);

        Bundle bundle = getIntent().getExtras();
        nombre = bundle.getString("nombre");
        edad = bundle.getString("edad");
        pais = bundle.getString("pais");
        matricula = bundle.getString("matricula");

        txtN.setText(nombre);
        txtE.setText(edad);
        txtP.setText(pais);
        txtM.setText(matricula);
    }

}