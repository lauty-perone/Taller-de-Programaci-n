
public class GrupoBeta extends Grupos {
   
   public GrupoBeta(){
       super();
   }
   
   @Override
    public void aplicarDosis(double dosis){
        for(int i=0; i<super.getDimL(); i++){
          if(super.obtenerPaciente(i).getUltResulGlucosa()>2.5)  
                super.obtenerPaciente(i).setUltDosisFarmaco(dosis);
        }
    }
   
}
