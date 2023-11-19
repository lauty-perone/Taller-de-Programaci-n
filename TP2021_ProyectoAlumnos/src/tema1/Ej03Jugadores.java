/*3- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio*/
package tema1;
import PaqueteLectura.Lector;  //Paso 1: Importar la funcionalidad para lectura de datos


public class Ej03Jugadores {

  
    public static void main(String[] args) {
        double []v;//Paso 2: Declarar la variable vector de double 
        
        v= new double [5];//Paso 3: Crear el vector para 15 double 
        
        int i;//Paso 4: Declarar indice 
        double suma=0;        
        for (i=0; i< 5; i=i+1){                    //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
            System.out.println("Escriba la altura del jugador");
            double alt=Lector.leerDouble();
            suma=suma+alt;
        }
        double prom=suma/5;                        //Paso 7: Calcular el promedio de alturas, informarlo
        System.out.println("La altura promedio de los 15 jugadores es= " +prom);
        int cant=0; 
        for (i=0; i < 5; i++) {
            if (v[i] > prom)
                cant=cant+1;
            }
        
        System.out.println("La cantidad de jugadores que su altura esta por encima del promedio es: " +cant);
                                                     //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
     
                                                     //Paso 9: Informar la cantidad.
        }
    
    }
