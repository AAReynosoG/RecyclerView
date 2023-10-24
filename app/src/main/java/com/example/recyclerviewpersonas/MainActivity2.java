package com.example.recyclerviewpersonas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewpersonas.adapters.PersonaAdapter;
import com.example.recyclerviewpersonas.models.Persona;

import java.util.ArrayList;
import java.util.List;

import kotlin.collections.ArrayDeque;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        List<Persona> lp = new ArrayList<>();
        lp.add(new Persona("Juanito", "20", "Mexico", "22170060"));
        lp.add(new Persona("Pepito", "25", "Mexico", "22170060"));
        lp.add(new Persona("Pablito", "30", "Mexico", "22170060"));
        lp.add(new Persona("Toñito", "35", "Mexico", "22170060"));
        lp.add(new Persona("Carlitos", "40", "Mexico", "22170060"));
        lp.add(new Persona("Neymar JR", "45", "Mexico", "22170060"));
        lp.add(new Persona("Cristiano Ronaldo", "50", "Mexico", "22170060"));
        lp.add(new Persona("Leonel Messi", "55", "Mexico", "22170060"));
        lp.add(new Persona("Manuel Neuer", "60", "Mexico", "22170060"));
        lp.add(new Persona("Thomas Muller", "65", "Mexico", "22170060"));
        lp.add(new Persona("Frank Riveri", "70", "Mexico", "22170060"));


        PersonaAdapter pa = new PersonaAdapter(lp);
        RecyclerView rp = findViewById(R.id.idPersonas);
        rp.setAdapter(pa);
        rp.setLayoutManager(new LinearLayoutManager(this));
        rp.setHasFixedSize(true);
    }
}