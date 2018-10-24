package com.kryzcorp.listaspersonalizadas.Adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 4/1/2018.
 */

public class AdaptadorArrayAdapter extends ArrayAdapter {
    Context myContext;
    ArrayList<Persona> miListaPersona;
    LayoutInflater inflador;
    public AdaptadorArrayAdapter(@NonNull Context context,ArrayList<Persona> listaPersonas) {
        super(context, R.layout.item_layout_persona,listaPersonas);
        this.myContext=context;
        this.miListaPersona=listaPersonas;
        this.inflador = LayoutInflater.from(myContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        TextView lblCedula,lblNombre,lblDireccion,lblTelefono;

        convertView = inflador.inflate(R.layout.item_layout_persona,null);
        lblCedula = convertView.findViewById(R.id.tv_cedula_item_persona);
        lblNombre = convertView.findViewById(R.id.tv_nombre_item_persona);
        lblDireccion= convertView.findViewById(R.id.tv_direccion_item_persona);
        lblTelefono = convertView.findViewById(R.id.tv_telefono_item_persona);

        lblCedula.setText(miListaPersona.get(position).getCedula());
        lblNombre.setText(miListaPersona.get(position).getNombre());
        lblDireccion.setText(miListaPersona.get(position).getDirecion());
        lblTelefono.setText(miListaPersona.get(position).getTelefono());

        return convertView;
    }
}
