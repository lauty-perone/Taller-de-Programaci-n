
package repaso2;

/**
 *
 * @author lauty
 */
public class par1 {

    
    public static void main(String[] args) {
        Agenda a=new Agenda();
        Paciente p1=new Paciente("Lautaro",true,400 ); 
        a.agendarPaciente(p1, 1, 3);
        Paciente p2=new Paciente("Pedro",false,500); 
        a.agendarPaciente(p2, 2, 3);
        a.agendarPaciente(p2, 5, 2); 
        a.agendarPaciente(p2, 2, 4);
        
        Paciente p3=new Paciente("Raul",true,100); 
        a.agendarPaciente(p3, 3, 4);
        Paciente p4=new Paciente("Julieta",false,300 ); 
        a.agendarPaciente(p4, 1, 5);
        Paciente p5=new Paciente("Abril",false,500); 
        a.agendarPaciente(p5, 4, 4);
        a.liberarTurnos("Pedro");
        
        System.out.println(a.siTieneAgendadoEseDia(1, "Lautaro"));
        
    }
    
}
