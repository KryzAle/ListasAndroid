package com.kryzcorp.listaspersonalizadas.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by Alexis on 14/12/2017.
 */

public class AdaptadorItemPersona extends BaseAdapter{
    Context myContext;
    ArrayList<Persona> listaPersonas;
    LayoutInflater inflador;

    public AdaptadorItemPersona(Context myContext, ArrayList<Persona> listaPersonas) {
        this.myContext = myContext;
        this.listaPersonas = listaPersonas;
        inflador = LayoutInflater.from(myContext);
    }


    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflador.inflate(R.layout.item_layout_persona,null);
        TextView lblCed = view.findViewById(R.id.tv_cedula_item_persona);
        TextView lblNom = view.findViewById(R.id.tv_nombre_item_persona);
        TextView lblDir = view.findViewById(R.id.tv_direccion_item_persona);
        TextView lblTel = view.findViewById(R.id.tv_telefono_item_persona);
        lblCed.setText(listaPersonas.get(i).getCedula());
        lblNom.setText(listaPersonas.get(i).getNombre());
        lblDir.setText(listaPersonas.get(i).getDirecion());
        lblTel.setText(listaPersonas.get(i).getTelefono());
        return view;
    }
}
