package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Corazon Valiente", 1999);
        miPelicula.evaluacion(10);
        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.evaluacion(9);
        var peliculaDeDiego = new Pelicula("El señor de los anillos", 2001);
        peliculaDeDiego.evaluacion(8);
        Serie drHouse = new Serie("Doctor House", 2004);

        List<Titulo> lista = new LinkedList<>();
        lista.add(peliculaDeDiego);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(drHouse);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Tom Cruise");//Con CTRL+D se puede copiar una línea y la lleva a la parte inferior
        listaDeArtistas.add("Antonio Banderas");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));


    }

}
