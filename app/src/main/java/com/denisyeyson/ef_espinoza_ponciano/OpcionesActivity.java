package com.denisyeyson.ef_espinoza_ponciano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcionesActivity extends AppCompatActivity {

    Button btnCrud,btnI1,btnI2,btnI3,btnE1,btnE2,btnE3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        btnCrud = findViewById(R.id.buttonCrud);
        btnI1 = findViewById(R.id.buttonI1);
        btnI2 = findViewById(R.id.buttonI2);
        btnI3 = findViewById(R.id.buttonI3);
        btnE1 = findViewById(R.id.buttonE1);
        btnE2 = findViewById(R.id.buttonE2);
        btnE3 = findViewById(R.id.buttonE3);

        btnCrud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_explicito = new Intent(OpcionesActivity.this, RegistroActivity.class);
                startActivity(intent_explicito);
            }
        });

        btnI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=tgZJvW32K-Y"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });
        btnI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:<11.8726542>,<-77.0219015>?q=<11.8726542>,<-77.0219015>(15z)"));
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=tgZJvW32K-Y"));
                try {
                    startActivity(appIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });
        btnI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_implicito = new Intent(Intent.ACTION_CALL);
                intent_implicito.setData(Uri.parse("tel:123456789"));
                startActivity(intent_implicito);
            }
        });
        btnE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_explicito = new Intent(OpcionesActivity.this, E1Activity.class);
                startActivity(intent_explicito);
            }
        });
        btnE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_explicito = new Intent(OpcionesActivity.this, TerminosActivity.class);
                startActivity(intent_explicito);
            }
        });
        btnE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_explicito = new Intent(OpcionesActivity.this, E3Activity.class);
                startActivity(intent_explicito);
            }
        });
    }
}