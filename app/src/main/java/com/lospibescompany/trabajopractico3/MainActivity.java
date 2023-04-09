package com.lospibescompany.trabajopractico3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Pelicula> peliculaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        peliculaList = new ArrayList<>();
        peliculaList.add(new Pelicula("Matrix","Un hacker descubre que la realidad en la que vive es una simulación creada por máquinas, y se une a una rebelión para combatirlas.", "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss", "Hermanas Wachowski", R.drawable.matrix));
        peliculaList.add(new Pelicula("El Señor de los Anillos","Un joven hobbit recibe un anillo mágico que podría ser la clave para salvar a su mundo del malvado Sauron.", "Elijah Wood, Ian McKellen, Viggo Mortensen", "Peter Jackson", R.drawable.hobbit));
        peliculaList.add(new Pelicula("Titanic", "Una joven aristócrata y un artista pobre se enamoran a bordo del Titanic durante su viaje inaugural en 1912.", "Leonardo DiCaprio, Kate Winslet, Billy Zane", "James Cameron", R.drawable.titanic));

        PeliculaAdapter peliculaAdapter = new PeliculaAdapter(peliculaList, this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(false); //recyclew view responsive = false, no responsive = true
        recyclerView.setLayoutManager(new LinearLayoutManager(this));//establecer diseño o disposicion de elementos
        recyclerView.setAdapter(peliculaAdapter); //Aqui va el adapter del recyclerview

    }
}