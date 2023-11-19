/*3- A- Modele e implemente las clases para el siguiente problema. Una garita de seguridad
quiere identificar los distintos tipos de personas que entran a un barrio cerrado. Al barrio
pueden entrar personas, que se caracterizan por su nombre, DNI y edad. Además pueden
entrar trabajadores, estos son personas que se caracterizan además por la tarea que
realizan en el predio.
Implemente constructores, getters y setters para las clases. Además tanto las personas
como los trabajadores deben responder al mensaje toString(). A continuación se
ejemplifica la representación a retornar por cada uno:
- Personas: “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años”
- Trabajadores: “Mi nombre es Mauro, mi DNI es 11203737 y tengo 70 años. Soy Corta
césped.”
B- Genere un programa que instancie una persona y un trabajador con datos leídos de
teclado y muestre la representación de cada uno en consola.
NOTA: reutilice la clase Persona (tema 2)*/
package tema5;

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
        System.out.println("Escriba el nombre, DNI y edad de la persona");
        String nombre= Lector.leerString();
        int DNI= Lector.leerInt();
        int edad=Lector.leerInt();
        Persona p=new Persona(nombre,DNI,edad);
        System.out.println(p.toString());
        System.out.println("Escriba el nombre, DNI, edad y tarea que realiza el trabajador");
        nombre= Lector.leerString();
        DNI= Lector.leerInt();
        edad=Lector.leerInt();
        String tarea=Lector.leerString();
        trabajador t=new trabajador(nombre,DNI,edad,tarea);
        System.out.println(t.toString());
    }
    
}
