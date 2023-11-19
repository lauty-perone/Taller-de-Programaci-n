import PaqueteLectura.*;

public class Punto4 {

    public static void main(String[] args) {

        GeneradorAleatorio.iniciar();
        Persona p; //Creo una variable de tipo Persona(objeto)
        Persona[][] matriz = new Persona[5][8]; //Creo una matriz que va a almacenar tipo Persona(objeto)
        int columna;
        String nombre;
        
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 8; j++) {
                matriz[i][j] = null;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("DIA " + (i+1) + " PARA ANOTAR");
            columna = 0;         
            System.out.print("INGRESE EL NOMBRE DE LA PERSONA: ");
            nombre = Lector.leerString();          
            while((!nombre.equals("ZZZ")) && (columna < 8)) {
                p = new Persona();
                p.setNombre(nombre);
                p.setEdad(GeneradorAleatorio.generarInt(101));
                p.setDni(GeneradorAleatorio.generarInt(10001));
                matriz[i][columna] = p;
                columna += 1;
                System.out.print("INGRESE EL NOMBRE DE LA PERSONA: " );
                nombre = Lector.leerString();                
            }
        }
        
        System.out.println("");
        for (int i = 0; i <5; i++) {
            for (int j = 0; j < 8; j++) {
                if ( matriz[i][j] != null) {
                    System.out.print("[" + matriz[i][j].getNombre() + ", " + matriz[i][j].getEdad() + ", " + matriz[i][j].getDni()+ "]");
                }
            }
            System.out.println();
        }
        
    }
}
