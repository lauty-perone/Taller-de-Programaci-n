
package otro;

import PaqueteLectura.GeneradorAleatorio;

public abstract class Sorteo {
    private int valorPremio;
    private Persona[]vectorBonos;
    
    public Sorteo(int premio){
        this.valorPremio=premio;
        this.vectorBonos=new Persona[9];
        for(int i=0; i<9; i++)
            this.vectorBonos[i]=null;
    }
    
    public int agregarPersona(Persona p){
        int bono=GeneradorAleatorio.generarInt(9);
        while(this.vectorBonos[bono]!=null)
            bono=GeneradorAleatorio.generarInt(9);
        if(this.vectorBonos[bono]==null) 
           this.vectorBonos[bono]=p;
        return bono;
    }
    
    public Persona retornarPersona(int B){
       if(this.vectorBonos[B]!=null)
           return this.vectorBonos[B];
       else
           return null;
    }
    
    public abstract String ejecutarSorteo();
}
