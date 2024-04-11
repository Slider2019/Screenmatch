import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        //Por otro lado, un objeto es una instancia de una clase, y a través de él podemos representar
        // información en la aplicación. La clase solo sirve para estandarizar los objetos, pero no para
        // representar un objeto en sí. Para crear un objeto en Java, debemos usar la palabra clave "new"
        // seguida del nombre de la clase y paréntesis vacíos.

        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Corazon Valiente");
        miPelicula.setFechaDeLanzamiento(1999);
        miPelicula.setDuracionMinutos(178);
        miPelicula.setIncluidoEnElPlan(true);

        //En este ejemplo, creamos un objeto a partir de la clase "com.aluracursos.screenmatch.modelos.Pelicula" y lo almacenamos en
        // la variable "miPelicula" como una referencia. Como este objeto se creó como un objeto del tipo "com.aluracursos.screenmatch.modelos.Pelicula",
        // tiene los atributos "nombre", "fechaDeLanzamiento" y "duracionMinutos. Es a través del objeto que
        // podemos representar realmente una pelicula, es decir, llenar los atributos y llamar a los métodos.


        miPelicula.muestraFichaTecnica(); //Metodo
        miPelicula.evaluacion(8.0);
        miPelicula.evaluacion(10.0);
        miPelicula.evaluacion(7.5);
        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculoMedia());

        Serie drHouse = new Serie();
        drHouse.setNombre("Doctor House");
        drHouse.setFechaDeLanzamiento(2004);
        drHouse.setTemporadas(8);
        drHouse.setMinutosPorEpisodio(50);
        drHouse.setEpisodiosPorTemporada(16);
        drHouse.muestraFichaTecnica();
        System.out.println(drHouse.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1999);
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

    }
}
