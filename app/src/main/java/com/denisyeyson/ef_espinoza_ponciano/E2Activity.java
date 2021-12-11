package com.denisyeyson.ef_espinoza_ponciano;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class E2Activity extends AppCompatActivity {

    TextView nombres, apellidos,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2);

        nombres = findViewById(R.id.lblNombres);
        apellidos = findViewById(R.id.lblApellidos);
        correo = findViewById(R.id.lblCorreo);

        Bundle receptor = getIntent().getExtras();
        String nom = receptor.getString("NOMBRES");
        String ape = receptor.getString("APELLIDOS");
        String cor = receptor.getString("EMAIL");

        nombres.setText("Nombre: "+ nom);
        apellidos.setText("Apellido: "+ape);
        correo.setText("Correo: "+ cor);
    }
}