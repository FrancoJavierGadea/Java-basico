package syntax.objects;

public class main {
    

    public static void main(String[] args) {
        
        Object obj = new Object(){

            String nombre = "Majo";

            @Override
            public String toString() {
                
                return String.format("Nombre: %s", this.nombre);
            }
        };

        

        //System.out.println(obj.nombre);
    }
}
