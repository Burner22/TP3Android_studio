package com.lospibescompany.trabajopractico3;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String detalles;
    private String actores;
    private int imagen;
    private String directores;

    // Constructor vacío
    public Pelicula() {}

    // Constructor con parámetros
    public Pelicula(String titulo, String detalles, String actores, String directores,int imagen) {
        this.titulo = titulo;
        this.detalles = detalles;
        this.actores = actores;
        this.directores = directores;
        this.imagen= imagen;
    }

    // Getter y Setter para titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter para detalles
    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    // Getter y Setter para actores
    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    // Getter y Setter para directores
    public String getDirectores() {
        return directores;
    }

    public void setDirectores(String directores) {
        this.directores = directores;
    }
}

