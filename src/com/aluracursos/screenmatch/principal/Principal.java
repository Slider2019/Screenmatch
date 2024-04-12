package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        /*
        Por otro lado, un objeto es una instancia de una clase, y a través de él podemos representar
         información en la aplicación. La clase solo sirve para estandarizar los objetos, pero no para
         representar un objeto en sí. Para crear un objeto en Java, debemos usar la palabra clave "new"
         seguida del nombre de la clase y paréntesis vacíos.
        */

        Pelicula miPelicula = new Pelicula("Corazon Valiente", 1999);
        miPelicula.setDuracionMinutos(178);
        miPelicula.setIncluidoEnElPlan(true);

        /*En este ejemplo, creamos un objeto a partir de la clase "com.aluracursos.screenmatch.modelos.Pelicula" y lo almacenamos en
        la variable "miPelicula" como una referencia. Como este objeto se creó como un objeto del tipo "com.aluracursos.screenmatch.modelos.Pelicula",
        tiene los atributos "nombre", "fechaDeLanzamiento" y "duracionMinutos. Es a través del objeto que
        podemos representar realmente una pelicula, es decir, llenar los atributos y llamar a los métodos.
        */

        miPelicula.muestraFichaTecnica(); //Metodo
        miPelicula.evaluacion(8.0);
        miPelicula.evaluacion(10.0);
        miPelicula.evaluacion(7.5);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculoMedia());

        Serie drHouse = new Serie("Doctor House", 2004);
        drHouse.setTemporadas(8);
        drHouse.setMinutosPorEpisodio(50);
        drHouse.setEpisodiosPorTemporada(16);
        drHouse.muestraFichaTecnica();
        System.out.println(drHouse.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1999);
        otraPelicula.setDuracionMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(drHouse);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Piloto");
        episodio.setSerie(drHouse);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeDiego = new Pelicula("El señor de los anillos", 2001);
        peliculaDeDiego.setDuracionMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeDiego);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        //En Java, los arrays son estructuras de datos que permiten almacenar una colección de
        // elementos del mismo tipo. Son ampliamente utilizados para la manipulación de datos en
        // proyectos de programación.
        //Para declarar un array en Java, es necesario definir su tipo y tamaño. Por ejemplo,
        // para crear un array de números enteros con tamaño 5, podemos escribir el siguiente código:

        //int[] numeros = new int[5];

        //Aquí estamos declarando una matriz llamada "números" de tipo "int" y con tamaño 5.
        // Es importante recordar que el índice de los elementos de un array comienza en 0 y va hasta el
        // tamaño del array menos 1.
        //
        //Después de declarar un array, podemos inicializarlo con valores. Por ejemplo, podemos llenar
        // el array "números" con los números del 1 al 5 de la siguiente forma:

        //for (int i = 0; i < numeros.length; i++) {
        //    numeros[i] = i + 1;
        //}

        //Aquí, recorremos el array de "números" usando un loop for y llenando cada posición con su índice respectivo más 1.
        //
        //También es posible crear arrays de objetos y no solo tipos primitivos. Por ejemplo:

        //Pelicula[] peliculas= new Pelicula[2];
        //
        //Pelicula pelicula1 = new Pelicula("Avatar", 2009);
        //Pelicula pelicula2 = new Pelicula("El señor de los anillos", 2001);
        //
        //peliculas[0] = pelicula1;
        //peliculas[1] = pelicula2;

        //Si bien los arrays son útiles, tienen algunas limitaciones que pueden causar problemas en los proyectos.
        // Algunos de estos problemas incluyen:
        //
        //Tamaño fijo: el tamaño de un array es fijo y no se puede cambiar una vez creado. Esto puede resultar
        // problemático en situaciones en las que el tamaño de los datos que se almacenarán es desconocido o variable.
        //Ausencia de métodos: los arrays no cuentan con métodos que permitan insertar, quitar o buscar elementos
        // de manera eficiente. Esto puede conducir a soluciones de código complicadas e ineficientes para tareas simples.
        //Precisamente por estos problemas y dificultades, no deberíamos utilizar arrays para representar una
        // colección de elementos, sino alguna clase Java, como ArrayList, que encapsula y abstrae un array,
        // facilitando su uso mediante métodos y dejando el código del proyecto más sencillo de entender y evolucionar.


        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.getFirst().getNombre());

        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula: " + listaDePeliculas.getFirst().toString());

    }
}