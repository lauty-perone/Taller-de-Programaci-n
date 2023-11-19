/*4- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona y pensar en la estructura de datos a utilizar. 
 */
package tema2;

/**
 *
 * @author Lautaro
 */
import PaqueteLectura.Lector;

public class ej4 {
    private String nombre;
    private int DNI;
    private int edad;
    private int getDNI;
    private int getEdad;
   

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        String aux; 
        aux = "El nombre de la persona a entrevistar es " + nombre;
        return aux;
    }
    
    public static void main(String[] args) {
        
        ej4 [][] matriz=new ej4 [31][40];
        int[]dimension=new int[40];
        int i;
        for (i=0; i<31; i++){
            int dimL=0;
            System.out.println("Ingrese el nombre de la persona");
            String nombre= Lector.leerString();
            while(nombre!= "ZZZ" && dimL<40){
                 System.out.println("Ingrese el DNI de la persona");
                 int DNI= Lector.leerInt();
                 System.out.println("Ingrese la edad de la persona");
                 int edad= Lector.leerInt();
                 matriz[i][dimL].nombre=nombre;
                 matriz[i][dimL].DNI=DNI;
                 matriz[i][dimL].edad=edad;
                 System.out.println("Ingrese el nombre de la persona");
                 nombre= Lector.leerString();
                 dimL++;
            }
            dimension[dimL]=dimL;
        }
        for(i=0; i<31; i++){
            int pos=0;
            for(int j=0; j<dimension[pos]; j++){
                System.out.println("Para el dia: "+i+" y el turno: "+ j+"el nombre de la persona que se entrevistara es: "+matriz[i][j]);
            }
            pos++;
        }
    }
}
