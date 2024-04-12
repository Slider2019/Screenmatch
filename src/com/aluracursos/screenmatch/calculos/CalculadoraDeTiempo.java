package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionMinutos();
    }

    public void incluido(Titulo titulo){
        System.out.println("Agregando duracion en minutos de " + titulo);
        this.tiempoTotal += titulo.getDuracionMinutos();
    }
}

