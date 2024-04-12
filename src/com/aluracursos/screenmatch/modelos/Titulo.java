package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre; //Cadena de texto
    private int fechaDeLanzamiento; //valor entero
    private int duracionMinutos; //Valor entero
    private boolean incluidoEnElPlan; //true ó false
    private double sumaEvaluaciones; //Aqui el "double" se usa para numeros decimales
    private int totalEvaluaciones; //Valor entero marcado como privado

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }
    //En Java, los modificadores de acceso son palabras clave que definen el nivel de visibilidad
    // de las clases, atributos y métodos, y ayudan a garantizar la seguridad y el encapsulamiento del código.
    //Existen cuatro tipos de modificadores de acceso en Java: public, protected, private y default
    // (también conocido como package-private).


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //"this", traducido al español como "esto/este/esta", se utiliza para hacer referencia a los atributos
    // de la clase, especialmente en métodos que tienen parámetros con el mismo nombre que el atributo de
    // la clase en la que estamos trabajando. Entonces, podemos concluir que "this" se refiere al objeto actual
    // y no al parámetro del método. Es común usar "this" para eliminar la confusión entre los atributos y los
    // parámetros, y este concepto no es exclusivo de Java, ya que otros lenguajes de programación orientados a
    // objetos también tienen esta característica.

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones(){//Encapsulamiento
        return totalEvaluaciones;
    }


    public void muestraFichaTecnica(){ //Aqui el "void" es el método
        System.out.println("El nombre de la com.aluracursos.screenmatch.modelos.Pelicula es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionMinutos());
    }

    public void evaluacion(double nota){
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculoMedia(){
        return sumaEvaluaciones / totalEvaluaciones;
    }
}
