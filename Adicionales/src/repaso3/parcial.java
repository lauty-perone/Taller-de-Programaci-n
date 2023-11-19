
package repaso3;

/**
 *
 * @author lauty
 */
public class parcial {

    public static void main(String[] args) {
        Electronico e=new Electronico("Habia una vez",200,"PDF",5);
        e.agregarAutor("Raúl");
        e.agregarAutor("Lautaro");
        e.agregarAutor("Fran");
        
        Impreso imp=new Impreso("La bella y la bestia", 2000, true );
        imp.agregarAutor("Stephen King");
        imp.agregarAutor("Di Caprio");
        
        System.out.println(e.toString());
        System.out.println(imp.toString());
        
        
    }
    
}
