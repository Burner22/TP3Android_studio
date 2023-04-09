package com.lospibescompany.trabajopractico3;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AndroidViewModel;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.lospibescompany.trabajopractico3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.ViewHolder> {
    private ActivityMainBinding binding;
    Context context;
    private List<Pelicula> pelis;
    private LayoutInflater inflater;

    public PeliculaAdapter(List<Pelicula> itemList, Context context){
        this.inflater= LayoutInflater.from(context);
        this.context=context;
        this.pelis=itemList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.peli_cardview, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Pelicula pelicula = pelis.get(position);
        holder.titulo.setText(pelicula.getTitulo());
        holder.descripcion.setText(pelicula.getDetalles());
        Glide.with(context).load(pelicula.getImagen()).into(holder.caratula);

        holder.btndetalles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetallePeliActivity.class);
                intent.putExtra("titulo", pelicula.getTitulo());
                intent.putExtra("descripcion", pelicula.getDetalles());
                intent.putExtra("actores", pelicula.getActores());
                intent.putExtra("director", pelicula.getDirectores());
                intent.putExtra("imagen", pelicula.getImagen());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pelis.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo;
        private TextView descripcion;
        private ImageView caratula;
        private Button btndetalles;
        private CardView cvPelicula;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            titulo = itemView.findViewById(R.id.titulo);
            descripcion = itemView.findViewById(R.id.descripcion);
            caratula = itemView.findViewById(R.id.caratula);
            btndetalles = itemView.findViewById(R.id.btndetalles);
            cvPelicula = itemView.findViewById(R.id.recyclerView);

        }
    }


}
