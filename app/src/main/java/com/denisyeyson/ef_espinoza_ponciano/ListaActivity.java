package com.denisyeyson.ef_espinoza_ponciano;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.denisyeyson.ef_espinoza_ponciano.adaptador.ListaProductosAdapter;
import com.denisyeyson.ef_espinoza_ponciano.entidad.Productos;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    DatabaseReference base_de_datos;
    List<Productos> listaProductos= new ArrayList<>();
    RecyclerView rvProductos;
    ListaProductosAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        base_de_datos = FirebaseDatabase.getInstance().getReference();
        rvProductos = findViewById(R.id.rvProductos);
        rvProductos.setLayoutManager(new GridLayoutManager(this,1));
        obtenerProductos();
    }

    public void obtenerProductos(){
        listaProductos.clear();

        base_de_datos.child("Producto").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot objeto: snapshot.getChildren()){
                    listaProductos.add(objeto.getValue(Productos.class));
                }
                adaptador = new ListaProductosAdapter(ListaActivity.this,listaProductos);
                rvProductos.setAdapter(adaptador);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}