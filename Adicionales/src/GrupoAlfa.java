
public class GrupoAlfa extends Grupos {

    public GrupoAlfa() { 
        super();
    }
        
    @Override
    public void aplicarDosis(double dosis){
        for(int i=0; i<super.getDimL(); i++){
            super.obtenerPaciente(i).setUltResulGlucosa(dosis);
        }
    }
    
}
