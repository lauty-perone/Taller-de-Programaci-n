
package ejer1;

/**
 *
 * @author lauty
 */
public class MainMain {

    
    public static void main(String[] args) {
        
        Participante p1 = new Participante (43732185, "Lautaro", 40);
        Participante p2 = new Participante (44563221, "Lourdes", 25);
        Participante p3 = new Participante (45789562, "Martin", 20);
        Participante p4 = new Participante (56452123, "Martina", 26);
        
        Pareja pareja1 = new Pareja(p1,p2);
        Pareja pareja2 = new Pareja(p3,p4);
        
        Concurso concurso = new Concurso(2);
        concurso.agregarPareja(pareja1);
        concurso.agregarPareja(pareja2);
        
        System.out.println("La pareja con mas diferencia de edad es: " + concurso.parejaConMasDiferencia());
        
    }
    
}
