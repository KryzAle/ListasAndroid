package com.kryzcorp.listaspersonalizadas.Vistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorItemAuto;
import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorItemPersona;
import com.kryzcorp.listaspersonalizadas.Objetos.Auto;
import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class AutoActivity extends AppCompatActivity {
    ListView lstVistaAutos;
    ArrayList<Auto> listaAutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);

        lstVistaAutos = findViewById(R.id.lv_datos_auto);
        listaAutos = new ArrayList<Auto>();
        listaAutos.add(new Auto("Lotus","2005","2005","Cristian"));
        listaAutos.add(new Auto("Mazda","2014","1995","David"));
        listaAutos.add(new Auto("Suzuki","2013","2013","Santiago"));
        listaAutos.add(new Auto("Chevrolet","2012","2012","Jorge"));
        listaAutos.add(new Auto("Nissan","2001","2001","Maria"));

        AdaptadorItemAuto ven = new AdaptadorItemAuto(this, listaAutos);
        lstVistaAutos.setAdapter(ven);


    }
}
