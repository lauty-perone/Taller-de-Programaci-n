
package repaso3;

public class Electronico extends Libro {
    private String formato;
    private int tamaño;
    
    public Electronico(String titulo,double costo,String unFormato,int unTamaño){
        super(titulo,costo);
        this.formato=unFormato;
        this.tamaño=unTamaño;
    }
    
    @Override
    public double calcularPrecio(){
        double aux= super.getPrecio() + ((super.getPrecio()*21)/100) +2.5;
        return aux;
    }
}
