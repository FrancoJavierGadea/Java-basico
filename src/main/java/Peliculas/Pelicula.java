package Peliculas;

import java.util.ArrayList;
import java.util.Arrays;

public class Pelicula {

    String nombre;
    ArrayList<String> generos = new ArrayList<String>();
    int duracion;

    public Pelicula(String nombre, int duracion, String[] generos) {

        this.nombre = nombre;
        this.duracion = duracion;

        this.generos.addAll(
            Arrays.asList(generos)
        );
    }

    @Override
    public String toString() {
        
        return String.format("Nombre: %s \nDuracion: %s \nGeneros: %s", 
            this.nombre,
            this.duracion,
            this.generos
        );
    }
}