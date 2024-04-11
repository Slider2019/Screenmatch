package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    @Override
    public int getClasificacion() {
        return (int) (calculoMedia() / 2);
    }
//Aqui estoy definiendo la clase y se extiende "extends" a titulo. Es decir,
    //todo lo que esta en titulo se extiende a la clase pelicula.

    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
