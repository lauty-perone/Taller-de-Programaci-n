/*6- Escriba un programa que simule el ingreso de personas a un banco. Cada
persona que ingresa indica la operación que desea realizar (0: “cobro de cheque” 1:
“depósito/ extracción en cuenta” 2: “pago de impuestos o servicios” 3: “cobro de
jubilación” 4: “cobro de planes”). La recepción de personas culmina cuando un
empleado ingresa la operación 5 (cierre del banco). Informar la cantidad de
personas atendidas por cada operación y la operación más solicitada. */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
public class ej6 {

   
    public static void main(String[] args) {
        int vector[]=new int [5];
        int i;
        for(i=0; i<5; i++){
            vector[i]=0;
        }
        GeneradorAleatorio.iniciar();
        System.out.println("Ingrese la operacion que desea realizar");
        int operacion=GeneradorAleatorio.generarInt(5);
        while(operacion!=5){
            vector[operacion]=vector[operacion]+1;
            System.out.println("Ingrese la operacion que desea realizar");
            operacion=GeneradorAleatorio.generarInt(5);
        }
        int max=0;
        int maxSoli = 0;
        for(i=0; i<5; i++){
            System.out.println("La cantida de personas que accedieron a la operacion: "+i+"fueron: "+vector[i]);
            if(vector[i]>max){
                max=vector[i];
                maxSoli=i;
            }
        }
        System.out.println("La operacion mas solicitada fue la numero: "+maxSoli);
    }
    
}
