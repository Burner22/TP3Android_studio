package com.lospibescompany.trabajopractico3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.lospibescompany.trabajopractico3.databinding.ActivityDetallepeliBinding;

public class DetallePeliActivity extends AppCompatActivity {

    private @NonNull ActivityDetallepeliBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetallepeliBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();

    }

    public void init(){
        Intent intent = getIntent();
        String titulo = intent.getStringExtra("titulo");
        String detalles = intent.getStringExtra("descripcion");
        String actores = intent.getStringExtra("actores");
        String directores = intent.getStringExtra("director");
        int caratula = intent.getIntExtra("imagen",0);

        binding.tituloact2.setText(titulo);
        binding.descripcionact2.setText("Descripcion: "+detalles);
        binding.actores.setText("Actores: "+actores);
        binding.directores.setText("Directores: "+directores);
        Glide.with(this).load(caratula).into(binding.imageact2);

    }


}