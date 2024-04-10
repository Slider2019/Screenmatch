public class Principal {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Corazon Valiente";
        miPelicula.fechaDeLanzamiento = 1999;
        miPelicula.duracionMinutos = 178;

        System.out.println("Mi Pelicula es: " + miPelicula.nombre);
        System.out.println("Fecha de lanzamiento: " + miPelicula.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + miPelicula.duracionMinutos);
        System.out.println("\n***************************");

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionMinutos = 180;

        System.out.println("Mi Pelicula es: " + otraPelicula.nombre);
        System.out.println("Fecha de lanzamiento: " + otraPelicula.fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + otraPelicula.duracionMinutos);

    }
}
