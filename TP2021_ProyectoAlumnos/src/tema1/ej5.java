/*5- Un edificio de oficinas está conformado por 8 pisos y 4 oficinas por piso. Realice
un programa que permita informar la cantidad de personas que concurrieron a
cada oficina de cada piso. Para esto, simule la llegada de personas al edificio de la
siguiente manera: a cada persona se le pide el nro. de piso y nro. de oficina a la cual
quiere concurrir. La llegada de personas finaliza al indicar un nro. de piso 9. Al
finalizar la llegada de personas, informe lo pedido. */
package tema1;
import PaqueteLectura.Lector;
public class ej5 {


    public static void main(String[] args) {
        int[][] matriz=new int[4][8];
       int piso;
       int oficina;
       for(oficina=0;oficina <3; oficina++){
           for(piso=0;piso<0; piso++){
               matriz[oficina][piso]=0;
            }
        }
       System.out.println("Ingrese el piso y la oficina");
       piso=Lector.leerInt();
       while(piso!=9){
            System.out.println("Ingrese el piso y la oficina");
            piso=Lector.leerInt();
            oficina=Lector.leerInt();
            matriz[oficina][piso]=matriz[oficina][piso]+1;
        }
        for(oficina=0;oficina <3; oficina++){
           for(piso=0;piso<0; piso++){
               System.out.println("A la oficina numero: "+oficina+"del piso numero: "+piso+"accedieron un total de: "+matriz[oficina][piso]);
               
            }
        }
    }
}
