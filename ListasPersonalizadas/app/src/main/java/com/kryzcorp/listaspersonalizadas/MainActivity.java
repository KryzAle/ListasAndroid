package com.kryzcorp.listaspersonalizadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.kryzcorp.listaspersonalizadas.Objetos.Mascota;
import com.kryzcorp.listaspersonalizadas.Vistas.AutoActivity;
import com.kryzcorp.listaspersonalizadas.Vistas.MascotaActivity;
import com.kryzcorp.listaspersonalizadas.Vistas.MensajeLlamadaActivity;
import com.kryzcorp.listaspersonalizadas.Vistas.PersonaActivity;

public class MainActivity extends AppCompatActivity {
    Button btnMascota,btnAuto,btnPersona,btnCallMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMascota = (Button) findViewById(R.id.btn_mascota);
        btnAuto = (Button) findViewById(R.id.btn_auto);
        btnPersona = (Button) findViewById(R.id.btn_persona);
        btnCallMe = (Button) findViewById(R.id.btn_call_me);

        btnPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarActivityPersona();
            }
        });
        btnMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarActivityMascota();
            }
        });
        btnAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarActivityAuto();
            }
        });
        btnCallMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarActivityMensajeLlamar();
            }
        });
    }
    public void lanzarActivityPersona(){
        Intent i = new Intent(this,PersonaActivity.class);
        startActivity(i);
    }public void lanzarActivityAuto(){
        Intent i = new Intent(this,AutoActivity.class);
        startActivity(i);
    }public void lanzarActivityMascota(){
        Intent i = new Intent(this,MascotaActivity.class);
        startActivity(i);
    }
    public void lanzarActivityMensajeLlamar(){
        Intent i = new Intent(this,MensajeLlamadaActivity.class);
        startActivity(i);
    }
}
