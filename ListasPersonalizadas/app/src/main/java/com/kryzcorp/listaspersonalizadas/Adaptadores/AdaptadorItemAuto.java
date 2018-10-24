package com.kryzcorp.listaspersonalizadas.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kryzcorp.listaspersonalizadas.Objetos.Auto;
import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class AdaptadorItemAuto extends BaseAdapter {
    Context myContext;
    ArrayList<Auto> listaAuto;
    LayoutInflater inflador;

    public AdaptadorItemAuto(Context myContext, ArrayList<Auto> listaAuto) {
        this.myContext = myContext;
        this.listaAuto = listaAuto;
        inflador = LayoutInflater.from(myContext);
    }

    @Override
    public int getCount() {
        return listaAuto.size();
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
        view = inflador.inflate(R.layout.item_layout_auto,null);
        TextView lblMarca = view.findViewById(R.id.tv_marca_item_auto);
        TextView lblModelo = view.findViewById(R.id.tv_modelo_item_auto);
        TextView lblAnio = view.findViewById(R.id.tv_anio_item_auto);
        TextView lblDuenio = view.findViewById(R.id.tv_duenio_item_auto);
        lblMarca.setText(listaAuto.get(i).getMarca());
        lblModelo.setText(listaAuto.get(i).getModelo());
        lblAnio.setText(listaAuto.get(i).getAnio());
        lblDuenio.setText(listaAuto.get(i).getDueño());
        return view;
    }
}
