
package ejer2;

/**
 *
 * @author lauty
 */
public class MainSubsidio {

    
    public static void main(String[] args) {
        
    	Bien bien1 = new Bien ("Hermoso", 2, 1000);
    	Bien bien2 = new Bien ("Feo", 3, 500);
    	Bien bien3 = new Bien ("Fantástico", 5, 1500);
    	
    	Bienes bienes = new Bienes(10, "Lautaro", "Empleado", "03/10/2022");
    	
    	bienes.agregarBien(bien1);
    	bienes.agregarBien(bien2);
    	bienes.agregarBien(bien3);
    	
    	Estadia estadia = new Estadia("Miami", 5000.55, 10, 500, "Francisco", "Empleado", "03/10/2022");
    	
    	System.out.println(bienes.toString());
    	System.out.println("\n");
    	System.out.println(estadia.toString());
    }
    
}
