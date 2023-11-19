
package tema5;

public class entrenador extends empleado {
  
     private int cantCampeonatos;

    public entrenador(String unNombre, double UnSueldoBasico,int unCantCampeonatos) {
        super(unNombre, UnSueldoBasico);
        setCantCampeonatos(unCantCampeonatos);
    }
  
    public int getCantCampeonatos() {
        return cantCampeonatos;
    }

    public void setCantCampeonatos(int unCantCampeonatos) {
        this.cantCampeonatos = unCantCampeonatos;
    }
    
     @Override
   public double calcularSueldoACobrar (){
       double sueldo = 0;
       if((this.cantCampeonatos>=1) && (this.cantCampeonatos<=4))
          sueldo=super.getSueldoBasico()+5000;
          else 
          if ((this.cantCampeonatos>=5) && (cantCampeonatos<=10))
               sueldo=super.getSueldoBasico()+30000;
               else 
               if(this.cantCampeonatos>10)
                       sueldo=super.getSueldoBasico()+50000;
        return sueldo;
   }
}
      