
package otro;
import PaqueteLectura.GeneradorAleatorio;

public class SorteoComún extends Sorteo {
   
    public SorteoComún(int premio){
        super(premio);
    }
    
    
    @Override
    public String ejecutarSorteo(){
       String aux;
       int numGanador=GeneradorAleatorio.generarInt(9);
       aux="El ganador del sorteo es: "+super.retornarPersona(numGanador).toString();
       return aux;
    }
}
