/*1- Una galería de arte quiere reunir información de sus artistas en un catálogo. El catálogo almacena a lo sumo 15
artistas. De los artistas se registra nombre artístico y el nombre de su obra exhibida.
a) Genere las clases necesarias. Provea constructores para iniciar: el catálogo (sin artistas); los artistas a partir de
toda su información.
b) Implemente los métodos necesarios, en las clases que correspondan, para permitir:
- Agregar un artista al catálogo. Asuma que hay espacio.
- Obtener la representación string del catálogo (“Nombre artista 1, Nombre de su obra”) .. (“Nombre artista N,
Nombre de su obra”).
2- Implemente un programa que instancie un catálogo y agreguele dos artistas. A partir del catálogo: muestre su
representación string.*/
package nose;


public class Par {

 
    public static void main(String[] args) {
        Catalogo c=new Catalogo();
        Artista a1=new Artista("Lautaro", "Don Quijote de la Mancha");
        c.agregarArtista(a1);
        Artista a2=new Artista("Pedro", "Habia una vez");
        c.agregarArtista(a2);
        System.out.println(c.toString());
    }
    
}
