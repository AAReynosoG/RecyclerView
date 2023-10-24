package com.example.recyclerviewpersonas.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewpersonas.MainActivity3;
import com.example.recyclerviewpersonas.R;
import com.example.recyclerviewpersonas.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.ViewHolder> {

    List<Persona> lp = new ArrayList<>();

    public  PersonaAdapter(List<Persona> lp){ this.lp = lp; }

    @NonNull
    @Override
    public PersonaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View view = ly.inflate(R.layout.itempersonas, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonaAdapter.ViewHolder holder, int position) {

        Persona p = lp.get(position);
        holder.setData(p);

    }

    @Override
    public int getItemCount() {
        return lp.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        Persona pprop;
        TextView txtN, txtNa, txtE;
        String matricula, nombre, edad,  pais;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtN = itemView.findViewById(R.id.name);
            txtNa = itemView.findViewById(R.id.pais);
            txtE = itemView.findViewById(R.id.edad);

            txtN.setOnClickListener(this);
        }

        public void setData(Persona p){

            pprop = p;
            txtN.setText(pprop.getNombre());
            txtNa.setText(pprop.getNacionalidad());
            txtE.setText(pprop.getEdad());

        }

        @Override
        public void onClick(View view) {

            nombre = pprop.getNombre();
            edad = pprop.getEdad();
            pais = pprop.getNacionalidad();
            matricula = pprop.getMatricula();

            Intent i = new Intent(view.getContext(), MainActivity3.class);
            Bundle bundle = new Bundle();

            bundle.putString("nombre", nombre);
            bundle.putString("edad", edad);
            bundle.putString("pais", pais);
            bundle.putString("matricula", matricula);

            i.putExtras(bundle);
            view.getContext().startActivity(i);



        }
    }

}
