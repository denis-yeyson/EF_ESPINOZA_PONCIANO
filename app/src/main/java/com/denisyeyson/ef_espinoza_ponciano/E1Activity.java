package com.denisyeyson.ef_espinoza_ponciano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class E1Activity extends AppCompatActivity {
    TextView nombre,apellidos,email;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1);

        nombre = findViewById(R.id.txtNombres);
        apellidos = findViewById(R.id.txtApellidos);
        email = findViewById(R.id.txtEmail);
        enviar = findViewById(R.id.btnEnviar);

        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                String nomb = nombre.getText().toString();
                String apel = apellidos.getText().toString();
                String correo = email.getText().toString();

                Intent intent_explicito = new Intent(E1Activity.this, E2Activity.class);
                intent_explicito.putExtra("NOMBRES",nomb);
                intent_explicito.putExtra("APELLIDOS",apel);
                intent_explicito.putExtra("EMAIL",correo);
                startActivity(intent_explicito);
            }
        });
    }
}