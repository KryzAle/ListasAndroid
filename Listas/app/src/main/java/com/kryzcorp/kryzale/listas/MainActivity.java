package com.kryzcorp.kryzale.listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lstDatos;
    Spinner cbpRegion,cbpProvincia;
    Object value;
    ArrayAdapter<String> adapterCantonesEsmeraldas;
    ArrayAdapter<String> adapterCantonesManabi;
    ArrayAdapter<String> adapterCantonesLosRios;
    ArrayAdapter<String> adapterCantonesSantoDomingo;
    ArrayAdapter<String> adapterCantonesSantaElena;
    ArrayAdapter<String> adapterCantonesGuayas;
    ArrayAdapter<String> adapterCantonesElOro;
    ArrayAdapter<String> adapterCantonesCarchi;
    ArrayAdapter<String> adapterCantonesImbabura;
    ArrayAdapter<String> adapterCantonesPichincha;
    ArrayAdapter<String> adapterCantonesCotopaxi;
    ArrayAdapter<String> adapterCantonesTungurahua;
    ArrayAdapter<String> adapterCantonesBolivar;
    ArrayAdapter<String> adapterCantonesChimborazo;
    ArrayAdapter<String> adapterCantonesCañar;
    ArrayAdapter<String> adapterCantonesAzuay;
    ArrayAdapter<String> adapterCantonesLoja;
    ArrayAdapter<String> adapterCantonesSucumbios;
    ArrayAdapter<String> adapterCantonesNapo;
    ArrayAdapter<String> adapterCantonesPastaza;
    ArrayAdapter<String> adapterCantonesOrellana;
    ArrayAdapter<String> adapterCantonesMoronaSantiago;
    ArrayAdapter<String> adapterCantonesZamoraChinchipe;
    ArrayAdapter<String> adapterCantonesGalapagos;

    ArrayAdapter<String> adapterRegiones;
    ArrayAdapter<String> adapterProvinciasCosta;
    ArrayAdapter<String> adapterProvinciasSierra;
    ArrayAdapter<String> adapterProvinciasOriente;
    ArrayAdapter<String> adapterProvinciasInsular;
    String[] cantonesEsmeraldas;
    String[] cantonesManabi;
    String[] cantonesLosRios;
    String[] cantonesSantoDomingo;
    String[] cantonesSantaElena;
    String[] cantonesGuayas;
    String[] cantonesElOro;
    String[] cantonesCarchi;
    String[] cantonesImbabura;
    String[] cantonesPichincha;
    String[] cantonesCotopaxi;
    String[] cantonesTungurahua;
    String[] cantonesBolivar;
    String[] cantonesChimborazo;
    String[] cantonesCañar;
    String[] cantonesAzuay;
    String[] cantonesLoja;
    String[] cantonesSucumbios;
    String[] cantonesNapo;
    String[] cantonesPastaza;
    String[] cantonesOrellana;
    String[] cantonesMoronaSantiago;
    String[] cantonesZamoraChinchipe;
    String[] cantonesGalapagos;

    String[] regiones;
    String[] provinciasCosta;
    String[] provinciasSierra;
    String[] provinciasOriente;
    String[] provinciasInsular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstDatos = findViewById(R.id.lstVista);
        cbpRegion = findViewById(R.id.sp_region);
        cbpProvincia=findViewById(R.id.sp_provincia);
        cantonesEsmeraldas = new String[] {"Esmeraldas","Atacames","Eloy Alfaro","Muisne"};
        cantonesManabi = new String[] {"Portoviejo","Bolivar","Chone","El carmen"};
        cantonesLosRios = new String[] {"Babahoyo","Baba","Buena Fe","Mocache","Montalvo"};
        cantonesSantoDomingo = new String[] {"Santo Domingo","La concordia"};
        cantonesSantaElena = new String[] {"Santa Elena","La Libertad","Salinas"};
        cantonesGuayas = new String[] {"Guayaquil","Balao","Balzar","Milagro"};
        cantonesElOro = new String[] {"Machala","Arenillas","Atahualpa","Balsas"};
        cantonesCarchi = new String[] {"Tulcan","Bolivar","Espejo","Mira"};
        cantonesImbabura = new String[] {"Ibarra","Cotacachi","Pimampiro","Urcuqui"};
        cantonesPichincha = new String[] {"Quito","Cayambe","Mejia","Pedro Moncayo"};
        cantonesCotopaxi = new String[] {"Latacunga","La Mana","Pujili","Sigchos"};
        cantonesTungurahua = new String[] {"Ambato","Baños","Cevallos","Mocha"};
        cantonesBolivar = new String[] {"Guaranda","Caluma","Chillanes","Chimbo"};
        cantonesChimborazo = new String[] {"Riobamba","Alausi","Colta","Cumanda"};
        cantonesCañar = new String[] {"Azogues","Biblian","Cañar","El tambo"};
        cantonesAzuay = new String[] {"Cuenca","Camilo Ponce","Chordeleg","Gualaceo"};
        cantonesLoja = new String[] {"Loja","Calvas","Catamayo","Olmedo"};
        cantonesSucumbios = new String[] {"Lago Agrio","Cascales","Cuyabeno","Putumayo"};
        cantonesNapo = new String[] {"Tena","Archidona","El chaco","Quijos"};
        cantonesPastaza = new String[] {"Pastaza","Arajuno","Mera","Santa Clara"};
        cantonesOrellana = new String[] {"Aguarico","Loreto"};
        cantonesMoronaSantiago = new String[] {"Morona","Gualaquiza","Logroño","Palora"};
        cantonesZamoraChinchipe = new String[] {"Zamora","Chinchipe","Palanda","Paquisha"};
        cantonesGalapagos = new String[] {"San Cristobal","Santa Cruz","Isabela"};

        regiones = new String[]{"Seleccione","Costa","Sierra","Oriente","Insular"};
        provinciasCosta = new String[]{"Seleccione","Esmeraldas","Manabi","Los Rios","Santo Domingo","Santa Elena","Guayas","El Oro"};
        provinciasSierra  = new String[]{"Seleccione","Carchi","Imbabura","Pichincha","Cotopaxi","Tungurahua","Bolivar","Chimborazo","Cañar","Azuay","Loja"};
        provinciasOriente = new String[]{"Seleccione","Sucumbios","Napo","Pastaza","Orellana","Morona Santiago","Zamora Chinchipe"};
        provinciasInsular = new String[]{"Seleccione","Galapagos"};



        adapterCantonesEsmeraldas = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesEsmeraldas);
        adapterCantonesManabi = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesManabi);
        adapterCantonesLosRios = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesLosRios);
        adapterCantonesSantoDomingo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesSantoDomingo);
        adapterCantonesSantaElena = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesSantaElena);
        adapterCantonesGuayas = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesGuayas);
        adapterCantonesElOro = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesElOro);
        adapterCantonesCarchi = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesCarchi);
        adapterCantonesImbabura = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesImbabura);
        adapterCantonesPichincha = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesPichincha);
        adapterCantonesCotopaxi = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesCotopaxi);
        adapterCantonesTungurahua = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesTungurahua);
        adapterCantonesBolivar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesBolivar);
        adapterCantonesChimborazo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesChimborazo);
        adapterCantonesCañar = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesCañar);
        adapterCantonesAzuay = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesAzuay);
        adapterCantonesLoja = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesLoja);
        adapterCantonesSucumbios = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesSucumbios);
        adapterCantonesNapo = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesNapo);
        adapterCantonesPastaza = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesPastaza);
        adapterCantonesOrellana = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesOrellana);
        adapterCantonesMoronaSantiago = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesMoronaSantiago);
        adapterCantonesZamoraChinchipe = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesZamoraChinchipe);
        adapterCantonesGalapagos = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, cantonesGalapagos);

        adapterRegiones =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, regiones);
        adapterProvinciasCosta =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, provinciasCosta);
        adapterProvinciasSierra =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, provinciasSierra);
        adapterProvinciasOriente =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, provinciasOriente);
        adapterProvinciasInsular =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, provinciasInsular);
        //lstDatos.setAdapter(adapterCantones);
        cbpRegion.setAdapter(adapterRegiones);

        lstDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), cantonesEsmeraldas[i],Toast.LENGTH_LONG).show();
            }
        });
        cbpRegion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(!regiones[i].equals("Seleccione")){
                    Toast.makeText(getApplicationContext(), regiones[i],Toast.LENGTH_LONG).show();
                    if(regiones[i].equals("Costa")){
                        cbpProvincia.setAdapter(adapterProvinciasCosta);
                    }if(regiones[i].equals("Sierra")){
                        cbpProvincia.setAdapter(adapterProvinciasSierra);
                    }if(regiones[i].equals("Oriente")){
                        cbpProvincia.setAdapter(adapterProvinciasOriente);
                    }if(regiones[i].equals("Insular")){
                        cbpProvincia.setAdapter(adapterProvinciasInsular);
                    }
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        cbpProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                value = adapterView.getItemAtPosition(i);
                switch (value.toString()) {
                    case "Esmeraldas":
                        lstDatos.setAdapter(adapterCantonesEsmeraldas);
                    break;
                    case "Manabi":
                        lstDatos.setAdapter(adapterCantonesManabi);
                        break;
                    case "Los Rios":
                        lstDatos.setAdapter(adapterCantonesLosRios);
                        break;
                    case "Santo Domingo":
                        lstDatos.setAdapter(adapterCantonesSantoDomingo);
                        break;
                    case "Santa Elena":
                        lstDatos.setAdapter(adapterCantonesSantaElena);
                        break;
                    case "Guayas":
                        lstDatos.setAdapter(adapterCantonesGuayas);
                        break;
                    case "El Oro":
                        lstDatos.setAdapter(adapterCantonesElOro);
                        break;
                    case "Carchi":
                        lstDatos.setAdapter(adapterCantonesCarchi);
                        break;
                    case "Imbabura":
                        lstDatos.setAdapter(adapterCantonesImbabura);
                        break;
                    case "Pichincha":
                        lstDatos.setAdapter(adapterCantonesPichincha);
                        break;
                    case "Cotopaxi":
                        lstDatos.setAdapter(adapterCantonesCotopaxi);
                        break;
                    case "Tungurahua":
                        lstDatos.setAdapter(adapterCantonesTungurahua);
                        break;
                    case "Bolivar":
                        lstDatos.setAdapter(adapterCantonesBolivar);
                        break;
                    case "Chimborazo":
                        lstDatos.setAdapter(adapterCantonesChimborazo);
                        break;
                    case "Cañar":
                        lstDatos.setAdapter(adapterCantonesCañar);
                        break;
                    case "Azuay":
                        lstDatos.setAdapter(adapterCantonesAzuay);
                        break;
                    case "Loja":
                        lstDatos.setAdapter(adapterCantonesLoja);
                        break;
                    case "Sucumbios":
                        lstDatos.setAdapter(adapterCantonesSucumbios);
                        break;
                    case "Napo":
                        lstDatos.setAdapter(adapterCantonesNapo);
                        break;
                    case "Pastaza":
                        lstDatos.setAdapter(adapterCantonesPastaza);
                        break;
                    case "Orellana":
                        lstDatos.setAdapter(adapterCantonesOrellana);
                        break;
                    case "Morona Santiago":
                        lstDatos.setAdapter(adapterCantonesMoronaSantiago);
                        break;
                    case "Zamora Chinchipe":
                        lstDatos.setAdapter(adapterCantonesZamoraChinchipe);
                        break;
                    case "Galapagos":
                        lstDatos.setAdapter(adapterCantonesGalapagos);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
