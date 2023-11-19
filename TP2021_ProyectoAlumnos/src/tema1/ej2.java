/*2- Escriba un programa que imprima en consola el factorial de todos los números
entre 1 y 9. ¿Qué modificación debe hacer para imprimir el factorial de los
números impares solamente?*/

package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

public class ej2 {

   
    public static void main(String[] args) {
       int num = GeneradorAleatorio.generarInt(10);
       int total=1;
       if (num<=9 && num>=1){
            
            while(num>0){
                total=total*num;
                num=num-1;
            }
        }
       
       System.out.print("El total del numero ingresado es: " + total);
    }
    
}
