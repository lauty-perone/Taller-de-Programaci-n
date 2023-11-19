
package ejer2;

/**
 *
 * @author lauty
 */
public class Bienes extends Subsidio {
    
    private Bien[] bienes;
    private int dimL;

    public Bienes(int N, String investigador, String planTrabajo, String fecha) {
        super(investigador, planTrabajo, fecha);
        this.bienes = new Bien[N];
        this.dimL = 0 ;
        for (int i = 0; i<N; i++){
            this.bienes[i] = null;
        }
    }
    
    public void agregarBien(Bien bien){
        this.bienes[dimL] = bien;
        dimL++;
    }
    
    @Override
    public double  montoTotal() {
    	double total = 0;
    	for (int i= 0; i<dimL; i++) {
    		total += this.bienes[i].getCosto() * this.bienes[i].getCant(); 
    	}
    	return total;
    }
    
    public String toString () {
    	String aux = "Tipo de subsidio: Bienes"+ "\n" +super.toString() + "\nDescripción de los bienes solicitados:";
    	for (int i= 0; i<dimL ; i++) {
    		aux += "\nDescripción bien " + i +": " + this.bienes[i].getDescripcion();
    	}
    	return aux;
    }
}
