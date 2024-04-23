package Peliculas;

public class main {
    
    public static void main(String[] args) {

        VideoClub videoclub = new VideoClub("Blockbuster", new Pelicula[]{

            new Pelicula("Oppenheimer", 180, new String[]{
                "Biográfico",
                "Suspense",
                "Belico"
            }),

            new Pelicula("Godzilla y Kong: El nuevo imperio", 115, new String[]{
                "Ciencia ficción",
                "Acción"
            }),

            new Pelicula("KUNG FU PANDA 4", 94, new String[]{
                "Animación", 
                "Aventuras", 
                "Fantasía"
            })
        });

        System.out.println(videoclub);
    }
}
