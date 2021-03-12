package com.example.pruebaspotify.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebaspotify.Pojo.CategoriaVO;
import com.example.pruebaspotify.R;

import java.util.ArrayList;

public class Adapter_categoria extends RecyclerView.Adapter<Adapter_categoria.ViewHolderCategoria> implements View.OnClickListener {

    ArrayList<CategoriaVO> listCategoria;
    private View.OnClickListener listener;
    private Context context;

    public Adapter_categoria(ArrayList<CategoriaVO> listCategoria, Context context) {
        this.listCategoria = listCategoria;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter_categoria.ViewHolderCategoria onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categoria, null, false);
        view.setOnClickListener(this);
        view.setLayoutParams(new RecyclerView.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT, RecyclerView.LayoutParams.WRAP_CONTENT));
        return new Adapter_categoria.ViewHolderCategoria(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_categoria.ViewHolderCategoria holder, int position) {
        holder.titulo.setText(listCategoria.get(position).getTitulo());
        holder.descripcion.setText(listCategoria.get(position).getDescripcion());
        holder.tituloPrecio.setText(listCategoria.get(position).getTituloPrecio());
        holder.precio.setText(listCategoria.get(position).getPrecio());
        //holder.imagen.setImageResource(listCategoria.get(position).getT);
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (this.listener != null) {
            listener.onClick(v);
        }
    }

    @Override
    public int getItemCount() {
        return this.listCategoria.size();
    }

    public class ViewHolderCategoria extends RecyclerView.ViewHolder {

        TextView titulo, descripcion, tituloPrecio, precio;
        ImageView imagen;

        public ViewHolderCategoria(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.descripcion);
            tituloPrecio = itemView.findViewById(R.id.tituloPrecio);
            precio = itemView.findViewById(R.id.precios);
        }
    }
}
