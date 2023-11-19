
package repaso2;
public class Agenda {
    private Paciente [][]agenda;
    
    public Agenda(){
        agenda=new Paciente[5][6];
        for(int i=0; i<5; i++)
            for(int j=0; j<6; j++)
               agenda[i][j]=null; 
    }
    
    public void agendarPaciente(Paciente P,int D, int T){
        agenda[D-1][T-1]=P;
    }
    
    public void liberarTurnos(String nombre){
        for(int i=0; i<5; i++)
            for(int j=0; j<6; j++){
                if(agenda[i][j].getNombre().equals(nombre))
                    agenda[i][j]=null;
            }
    }
    
    public String siTieneAgendadoEseDia(int D, String unNombre){
        String aux="";
        boolean tiene=false;
        int tur = 0;
        int i=0;
        while ((!tiene)&&(tur<6)){
            if(agenda[D-1][tur].getNombre().equals(unNombre))
                tiene=true;
            tur++;
            
        }        
        if(tiene)
            aux="El paciente " +unNombre+" tiene el turno número"+ tur+ "agendado ese dia";
        else
            aux="El paciente "+unNombre+" NO tiene un turno agendado ese dia";
        return aux;
    }
}
