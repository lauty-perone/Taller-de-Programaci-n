/*
4-A- Generar una clase para representar círculos. Los círculos se caracterizan por su radio
(double), el color de relleno (String) y el color de línea (String). El círculo debe saber:
▪ Devolver/modificar el valor de cada uno de sus atributos (get# y set#)
▪ Calcular el área y devolverla. (método calcularArea)
▪ Calcular el perímetro y devolverlo. (método calcularPerimetro)
NOTA: la constante PI es Math.PI
 B- Realizar un programa principal que instancie un círculo, le cargue información leída
de teclado e informe en consola el perímetro y el área.
*/
package tema3;

/**
 *
 * @author pc
 */

import PaqueteLectura.Lector;
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Escriba el radio, el color de relleno y el color de linea del circulo");
         double radio=Lector.leerDouble();
         String relleno=Lector.leerString();
         String linea=Lector.leerString();
         circulo c=new circulo(radio,relleno,linea);
         System.out.println("El area del circulo ingresado es: "+c.calcularArea()+" y su perimetro es: "+c.calcularPerimetro());
    }
}
