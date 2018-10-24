package com.kryzcorp.listaspersonalizadas.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kryzcorp.listaspersonalizadas.Objetos.Auto;
import com.kryzcorp.listaspersonalizadas.Objetos.Mascota;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class AdaptadorItemMascota extends BaseAdapter {
    Context myContext;
    ArrayList<Mascota> listaMascota;
    LayoutInflater inflador;

    public AdaptadorItemMascota(Context myContext, ArrayList<Mascota> listaMascota) {
        this.myContext = myContext;
        this.listaMascota = listaMascota;
        inflador = LayoutInflater.from(myContext);
    }

    @Override
    public int getCount() {
        return listaMascota.size();
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
        view = inflador.inflate(R.layout.item_layout_mascota,null);
        TextView lblNombre = view.findViewById(R.id.tv_nombre_item_mascota);
        TextView lblEdad = view.findViewById(R.id.tv_edad_item_mascota);
        TextView lblRaza = view.findViewById(R.id.tv_raza_item_mascota);
        TextView lblDuenio = view.findViewById(R.id.tv_duenio_item_mascota);
        lblNombre.setText(listaMascota.get(i).getNombre());
        lblEdad.setText(listaMascota.get(i).getEdad());
        lblRaza.setText(listaMascota.get(i).getRaza());
        lblDuenio.setText(listaMascota.get(i).getDuenio());
        return view;
    }
}
