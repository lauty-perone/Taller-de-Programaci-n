
package repaso3;


public class Impreso extends Libro {
    private boolean tapa;
    
    public Impreso(String titulo, double costo, boolean unaTapa){
        super(titulo,costo);
        this.tapa=unaTapa;
    }
    @Override
    public double calcularPrecio(){
        double aux= super.getPrecio()+(super.getPrecio()*21)/100;
        return aux;
    }
}
