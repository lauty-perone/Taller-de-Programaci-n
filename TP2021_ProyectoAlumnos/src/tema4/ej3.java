/*
3-A- Modifique la clase Libro (carpeta tema 4) para ahora considerar que el primer autor
es un objeto instancia de la clase Autor. Implemente la clase Autor, considerando que éstos
se caracterizan por nombre y biografía. El autor debe poder devolver/modificar el valor de
sus atributos.
B- Modifique el programa ppal. (carpeta tema 4) para instanciar un libro con su autor,
considerando las modificaciones realizadas en A). Los datos se ingresan por teclado. 
 */
package tema4;

/**
 *
 * @author pc
 */
import PaqueteLectura.Lector;

public class ej3 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese el titulo del libro,nombre y la biografia del autor, editorial,año de edicion, ISBN y precio");
        String titulo=Lector.leerString();
        String nombre=Lector.leerString();
        String biografia=Lector.leerString();
        String editorial=Lector.leerString();
        int añoEdicion=Lector.leerInt();
        String ISBN=Lector.leerString();
        double precio=Lector.leerDouble();
        Libro l=new Libro(titulo,editorial,añoEdicion,nombre,biografia,ISBN,precio);
        System.out.println(l.toString());
        
    }
    
}
