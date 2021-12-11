package com.denisyeyson.ef_espinoza_ponciano.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.denisyeyson.ef_espinoza_ponciano.R;
import com.denisyeyson.ef_espinoza_ponciano.entidad.Productos;

import java.util.List;

public class ListaProductosAdapter extends RecyclerView.Adapter<ListaProductosAdapter.ProductoViewHolder>{

    Context context;
    List<Productos> listaProductos;

    public ListaProductosAdapter(Context context,List<Productos> listaProductos) {
        this.context = context;
        this.listaProductos = listaProductos;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_modelo,null,false);
        return new ProductoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        holder.nombre.setText("nombre: "+listaProductos.get(position).getNombre());
        holder.marca.setText("marca: "+listaProductos.get(position).getMarca());
        holder.descripcion.setText("descripcion: "+listaProductos.get(position).getDescripcion());
        holder.cantidad.setText("cantidad: "+listaProductos.get(position).getCantidad());
        holder.precio.setText("precio: "+listaProductos.get(position).getPrecio());
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public class ProductoViewHolder extends RecyclerView.ViewHolder {
        TextView nombre,marca,descripcion,cantidad,precio;
        public ProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.txtViewNombre);
            marca = itemView.findViewById(R.id.txtViewMarca);
            descripcion = itemView.findViewById(R.id.txtViewDescripcion);
            cantidad = itemView.findViewById(R.id.txtViewCantidad);
            precio = itemView.findViewById(R.id.txtViewPrecio);
        }
    }
}
