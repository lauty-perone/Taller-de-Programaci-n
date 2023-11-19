/*Ejercicio 2. Queremos representar estanterías de libros. Una estantería mantiene sus libros
organizados en N estantes cada uno con lugar para M libros. Un libro posee título, peso, cantidad de
páginas y su autor (del que se registra nombre y biografía).
a) Implemente las clases de su modelo, con sus atributos y getters/setters adecuados.
b) Provea constructores para iniciar autores y los libros a partir de toda su información.
c) Provea un constructor para iniciar la estantería para N estantes y lugar para M libros por estante
(inicialmente no debe tener libros cargados).
d) Provea un constructor para iniciar la estantería para 5 estantes y lugar para 10 libros por estante
(inicialmente no debe tener libros cargados).
e) Implemente los siguientes métodos:
- almacenarLibro: recibe un libro, un nro. de estante y nro. de lugar válidos y guarda al libro en la
estantería. Asuma que dicho lugar está disponible.
- sacarLibro: recibe el título de un libro, y saca y devuelve el libro con ese título, quedando su lugar
disponible. Tenga en cuenta que el libro puede no existir.
- calcularLibroMasGrande: calcula y devuelve el libro con más páginas de la estantería.
- calcularEstanteMasPesado: calcula y devuelve el número del estante más pesado (teniendo en
cuenta el peso de sus libros).
d) Realice un programa que instancie una estantería para 5 estantes y 3 libros por estante. Almacene
7 libros en la estantería. A partir de la estantería: saque el libro “2001 Odisea del Espacio” e informe
su representación String; luego, informe
- el título del libro más grande
- el número del estante más pesado.*/

package pack2;

import PaqueteLectura.Lector;
public class ejer2 {

   
    public static void main(String[] args) {
        Estanteria e=new Estanteria(5,3);
        
        Libro l1=new Libro("2001 Odisea del Espacio",0.5,200,"Pedro","Genio");
        e.almacenarLibro(l1, 1, 3);
        Libro l2=new Libro("Futbol libre",2,1000,"Roman","Futbol");
        e.almacenarLibro(l2, 0, 2);
        Libro l3=new Libro("La legua",1,500,"Lautaro","Hola");
        e.almacenarLibro(l3, 2, 3);
        Libro l4=new Libro("Sol y luna",3,2000,"Sol","Todo");
        e.almacenarLibro(l4, 4, 4);
        Libro l5=new Libro("Corazon espinado",2,1500,"Flor","Si");
        e.almacenarLibro(l5, 3, 3);
        Libro l6=new Libro("La historia de un viejo",1,500,"Javier","Viejo");
        e.almacenarLibro(l6, 0, 0);
        Libro l7=new Libro("Habia una vez",0.3,100,"Raul","Abuelo");
        e.almacenarLibro(l7, 3, 2);
        
        System.out.println("Escriba el titulo del libro que desea sacar de la estanteria");
        String titulo=Lector.leerString();
       
        System.out.println("El tituolo del libro con mas paginas es: "+e.calcularLibroMasGrande());
        System.out.println("El numero del estante mas pesado es: "+e.calcularEstanteMasPesado());
        
    }
    
}
