/*
Representar dos tipos de sorteos solidarios: común y avanzado. Ambos sorteos mantienen el valor en pesos
del premio y guardan para cada bono (0..99) la información de la persona a la que fue asignado (nombre, dni
y colaboración en pesos). Sin embargo, difieren en cierta funcionalidad (se detalla más adelante).
Lea 1 y 2 atentamente y luego implemente.
1- Genere las clases necesarias. Provea constructores para iniciar los sorteos a partir del premio en pesos
(los bonos inicialmente no están asignados a nadie).
2- Implemente los métodos necesarios, en las clases que corresponda, para:
a. Agregar una persona al sorteo, devolviendo el nro. de bono que le tocó. El nro. de bono a otorgar se
obtiene generando nros. aleatoriamente hasta obtener uno no asignado. Asuma que hay un nro. de bono
disponible.
b. Obtener la persona que compró el nro. de bono B. Asuma que B es un nro. de bono válido. En caso de no
haberse asignado aún, retornar null.
c. Ejecutar el sorteo, devolviendo la persona ganadora, teniendo en cuenta que: en los sorteos comunes se
generan nros. aleatoriamente hasta obtener un nro. de bono asignado; en los sorteos avanzados la persona
ganadora será la que aportó mayor colaboración en pesos.
3- Realice un programa que instancie un sorteo común y un sorteo avanzado con premio 50.000$. Agregue
personas a cada sorteo. Ejecute ambos sorteos e imprima la información obtenida de la ejecución.
 */
package otro;

import PaqueteLectura.GeneradorAleatorio;

public class par2 {

    
    public static void main(String[] args) {
        SorteoComún SC=new SorteoComún(0);
        SorteoAvanzado SA=new SorteoAvanzado(50000);
        String nombre=GeneradorAleatorio.generarString(5);
        int dni=GeneradorAleatorio.generarInt(8);
        double colab=GeneradorAleatorio.generarDouble(4);
        Persona p=new Persona(nombre,dni,colab);
        System.out.println("El núm de bono de la persona ingresada es: "+SA.agregarPersona(p));
        for (int i=0;i<10; i++){
            nombre=GeneradorAleatorio.generarString(5);
            dni=GeneradorAleatorio.generarInt(8);
            colab=GeneradorAleatorio.generarDouble(4);
            p=new Persona(nombre,dni,colab);
            System.out.println("El núm de bono de la persona ingresada es: "+SA.agregarPersona(p));
        }
        for (int i=0;i<10; i++){
            SC.agregarPersona(p);
            nombre=GeneradorAleatorio.generarString(5);
            dni=GeneradorAleatorio.generarInt(8);
            colab=GeneradorAleatorio.generarDouble(4);
            p=new Persona(nombre,dni,colab);
            System.out.println("El núm de bono de la persona ingresada es: "+SA.agregarPersona(p));
        }
        
        System.out.println("Sorteo avanzado: ");
        System.out.println(SA.ejecutarSorteo());
        System.out.println("Sorteo común: ");
        System.out.println(SC.ejecutarSorteo());
            
    }
    
}
