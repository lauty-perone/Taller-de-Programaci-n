/*
3- A- Definir una clase para representar entrenadores de un club de fútbol. Un entrenador
se caracteriza por su nombre, sueldo básico y la cantidad de campeonatos ganados.
▪ Defina métodos para obtener/modificar el valor de cada atributo.
▪ Defina el método calcularSueldoACobrar que calcula y devuelve el sueldo a cobrar por
el entrenador. El sueldo se compone del sueldo básico, al cual se le adiciona un plus por
campeonatos ganados (5000$ si ha ganado entre 1 y 4 campeonatos; $30.000 si ha
ganado entre 5 y 10 campeonatos; 50.000$ si ha ganado más de 10 campeonatos).
B- Realizar un programa principal que instancie un entrenador, cargándole datos leídos
desde teclado. Pruebe el correcto funcionamiento de cada método implementado.
 */
package tema3;

/**
 *
 * @author pc
 */
import PaqueteLectura.Lector;
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba el nombre, sueldo basico y la cantidad de campeonatos ganados del entreanador");
        String unNombre=Lector.leerString();
        double unSueldo=Lector.leerDouble();
        int unCantCampeonatos=Lector.leerInt();
        entrenador e=new entrenador(unNombre, unSueldo, unCantCampeonatos);
        System.out.println("El nombre del entrenador es: "+e.getNombre()+"la cantidad de campeonatos que gano es de: "+e.getCantCampeonatos()+"y su sueldo a cobrar es de: "+e.sueldoCobrar());
        
        
    }
    
}
