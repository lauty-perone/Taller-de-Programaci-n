
package otro;

public class SorteoAvanzado extends Sorteo{
    public SorteoAvanzado(int premio){
        super(premio);
    }
    
    @Override
    public String ejecutarSorteo(){
        double max=-1;
        int posMax = 0;
        for (int i=0; i<9; i++)
            if(super.retornarPersona(i).getColabPesos()>max){
                max=super.retornarPersona(i).getColabPesos();
                posMax=i;
            }
        return "El ganador del sorteo es: "+super.retornarPersona(posMax).toString();
        
    }
}
