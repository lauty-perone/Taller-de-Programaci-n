
package ejer2;

/**
 *
 * @author lauty
 */
public class Estadia extends Subsidio{
      
    private String destino;
    private double costo;
    private int cantDias;
    private double montoDia;

    public Estadia(String destino, double costo, int cantDias, 
                double montoDia, String investigador, 
                String planTrabajo, String fecha) {
        
        super(investigador, planTrabajo, fecha);
        this.destino = destino;
        this.costo = costo;
        this.cantDias = cantDias;
        this.montoDia = montoDia;
    }
    
    @Override
    public double montoTotal() {
    	return this.costo + (this.cantDias * this.montoDia);
    }
    
    public String toString () {
    	String aux = "Tipo de subsidio: Estadia"+ "\n" + super.toString();
    	return aux + "\nLugar de destino: "+ this.destino + "\nDías de estadía: "+ this.cantDias;
    }
    
    
}
