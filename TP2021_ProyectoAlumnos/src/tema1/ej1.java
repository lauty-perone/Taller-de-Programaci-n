
package tema1;

import PaqueteLectura.Lector;

public class ej1 {

    public static void main(String[] args) {
               
       int num =Lector.leerInt();
       int contador=1;
       while(num>0){
              contador=contador* num;
              num=num-1;
       }
       System.out.println("El factorial del numero ingresado es= " +contador);
    }
}