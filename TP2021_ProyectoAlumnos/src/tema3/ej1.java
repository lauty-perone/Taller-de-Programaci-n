
package tema3;

/**
 *
 * @author pc
 */
import PaqueteLectura.Lector;

public class ej1 {

    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el lado 1 del triangulo");
        double lado1=Lector.leerDouble();
        System.out.println("Ingrese el lado 2 del triangulo");
        double lado2=Lector.leerDouble();
        System.out.println("Ingrese el lado 3 del triangulo");
        double lado3=Lector.leerDouble();
        System.out.println("Ingrese el color de relleno del triangulo");
        String relleno=Lector.leerString();
        System.out.println("Ingrese el color de la linea del triangulo");
        String linea= Lector.leerString();
        triangulo t= new triangulo(lado1,lado2,lado3,relleno,linea);
        System.out.println(t.calcularArea(lado1, lado2, lado3));
        System.out.println(t.calcularPerimetro(lado1, lado2, lado3));
    }
    
}
