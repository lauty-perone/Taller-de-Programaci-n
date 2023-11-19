/*4- Escriba un programa que defina una matriz de enteros de tamaño 10x10.
Inicialice la matriz con números aleatorios entre 0 y 200.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de todos los elementos almacenados entre las
filas 2 y 9 y las columnas 0 y 3
- Generar un vector de 10 posiciones donde cada posición i contiene la suma
de los elementos de la columna i de la matriz.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.*/
package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
        

public class Ej04Matrices {

    public static void main(String[] args) {
     
        int[][] matriz = new int [10][10]; //1. definir la matriz de enteros de tamaño 10x10 e iniciarla con números aleatorios entre 0 y 200
        int f;
        int c;
        for(f=0; f<9; f++){
            for(c=0; f<9; c++){
                GeneradorAleatorio.iniciar();
                matriz[f][c]=GeneradorAleatorio.generarInt(200);
                System.out.println("El numero de la fila"+f+ "y de la columna" +c+"es: "+matriz[f][c]);
            }//2. mostrar el contenido de la matriz en consola
        }
        int suma=0;
        for (f=2; f<9; f++){
            for(c=0; c<3; c++)
                suma=suma+matriz[f][c];
            
                //3. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
            }
        int []vector= new int[10];
        int i;
        for(i=0; i<9; i++){
            int tot=0;
            for(f=0; f<10;f++)      //4. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz
                tot=tot+matriz[f][i];
            vector[i]=tot;
        }    
        
        System.out.println("Ingrese un numero");
        int num=Lector.leerInt();
        for(f=0; f<9; f++){
            for(c=0; c<9; c++){
                if(matriz[f][c]==num) System.out.println("Se encontroel numero ingresado");
                else 
                    System.out.println("No se encontro el elemento");
            }
        }
    }
}
        //5. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
