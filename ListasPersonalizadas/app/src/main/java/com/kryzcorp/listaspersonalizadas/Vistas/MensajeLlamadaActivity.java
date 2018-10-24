package com.kryzcorp.listaspersonalizadas.Vistas;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kryzcorp.listaspersonalizadas.R;

/**
 * Created by KryzAle on 4/1/2018.
 */

public class MensajeLlamadaActivity extends AppCompatActivity {
    Button btnLlamar, btnEnviar;
    EditText txtNumero, txtMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje_llamar);
        btnLlamar = findViewById(R.id.btn_llamada);
        btnEnviar = findViewById(R.id.btn_mensaje);
        txtNumero = findViewById(R.id.txt_numero);
        txtMensaje = findViewById(R.id.txt_mensaje);


        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent llamar = new Intent(Intent.ACTION_CALL);
                llamar.setData(Uri.parse("tel:"+txtNumero.getText()));

                if (ActivityCompat.checkSelfPermission(getApplication(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    startActivity(llamar);
                    return;
                }

            }
        });
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri sms_uri = Uri.parse("smsto:"+txtNumero.getText());
                Intent enviar = new Intent(Intent.ACTION_SENDTO,sms_uri);
                enviar.putExtra("sms_body",txtMensaje.getText().toString());
                startActivity(enviar);
            }
        });
    }
}
