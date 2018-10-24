package com.kryzcorp.listaspersonalizadas.Vistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorArrayAdapter;
import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorItemPersona;
import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class PersonaActivity extends AppCompatActivity {
    ListView lstVistaPersona;
    ArrayList<Persona> listaPersonas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persona);

        lstVistaPersona = findViewById(R.id.lv_datos_persona);
        listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona("0603928854","Cristian","Latacunga","2323489"));
        listaPersonas.add(new Persona("0534541344","David","Quito","2323489"));
        listaPersonas.add(new Persona("0123423854","Santiago","Quito","2234789"));
        listaPersonas.add(new Persona("0603928854","Jorge","Cuenca","23456789"));
        listaPersonas.add(new Persona("0234928854","Maria","Loja","342456789"));

        //AdaptadorItemPersona ven = new AdaptadorItemPersona(this,listaPersonas);
        AdaptadorArrayAdapter ven = new AdaptadorArrayAdapter(this,listaPersonas);
        lstVistaPersona.setAdapter(ven);


    }
}