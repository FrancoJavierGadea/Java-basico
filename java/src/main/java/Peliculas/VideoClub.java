package Peliculas;

import java.util.ArrayList;
import java.util.Arrays;

public class VideoClub {
    
    String nombre;
    ArrayList<Pelicula> peliculas = new ArrayList<>();

    public VideoClub(String nombre, Pelicula[] peliculas) {

        this.nombre = nombre;
        
        this.peliculas.addAll(
            Arrays.asList(peliculas)
        );
    }

    @Override
    public String toString() {

        String result = String.format("Nombre: %s \n-------------------\n", this.nombre);

        for (int i = 0; i < this.peliculas.size(); i++) {

            Pelicula pelicula = this.peliculas.get(i);

            result += pelicula.toString() + "\n\n";
        }
        
        return result.trim();
    }
}
