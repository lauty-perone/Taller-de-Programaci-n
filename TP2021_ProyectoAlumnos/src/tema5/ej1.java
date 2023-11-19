/*
- Escriba un programa que instancie un triángulo, un círculo y un cuadrado, con
información leída desde teclado. Luego muestre en consola el área y perímetro de cada
uno y su representación en String
 */
package tema5;

/**
 *
 * @author pc
 */

import PaqueteLectura.Lector;

public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba los lados,su color de relleno y su color de linea del triangulo");
        double lado1=Lector.leerDouble();     
        double lado2=Lector.leerDouble();
        double lado3=Lector.leerDouble(); 
        String relleno=Lector.leerString();
        String linea= Lector.leerString(); 
        triangulo t=new triangulo(lado1,lado2,lado3,relleno,linea);
        System.out.println(t.toString());
        System.out.println("Escriba el lado, relleno y color de linea del cuadrado");
        lado1=Lector.leerDouble();
        relleno=Lector.leerString();
        linea=Lector.leerString();
        Cuadrado c=new Cuadrado(lado1,relleno,linea);
        System.out.println(c.toString());
        System.out.println("Escriba el radio,relleno y color de linea del circulo");
        double radio=Lector.leerDouble();
        relleno=Lector.leerString();
        linea=Lector.leerString();
        circulo cir=new circulo(radio,relleno,linea);
        System.out.println(cir.toString());
    }
    
}
