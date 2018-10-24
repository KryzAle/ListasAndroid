package com.kryzcorp.listaspersonalizadas.Vistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorItemMascota;
import com.kryzcorp.listaspersonalizadas.Adaptadores.AdaptadorItemPersona;
import com.kryzcorp.listaspersonalizadas.Objetos.Mascota;
import com.kryzcorp.listaspersonalizadas.Objetos.Persona;
import com.kryzcorp.listaspersonalizadas.R;

import java.util.ArrayList;

/**
 * Created by KryzAle on 16/12/2017.
 */

public class MascotaActivity extends AppCompatActivity {
    ListView lstVistaMascota;
    ArrayList<Mascota> listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota);

        lstVistaMascota = findViewById(R.id.lv_datos_mascota);
        listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("Goku","Poodle",5,"2323489"));
        listaMascotas.add(new Mascota("Gohan","Pitbull",8,"2323489"));
        listaMascotas.add(new Mascota("Krilin","Pastor Aleman",3,"2234789"));
        listaMascotas.add(new Mascota("Yamcha","Pastor Ingles",4,"23456789"));
        listaMascotas.add(new Mascota("Chaos","Corriente",2,"342456789"));

        AdaptadorItemMascota ven = new AdaptadorItemMascota(this,listaMascotas);
        lstVistaMascota.setAdapter(ven);


    }
}
