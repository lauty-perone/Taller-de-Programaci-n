/*
La balanza debe responder a los siguientes mensajes:
▪ iniciarCompra(): inicializa el monto y cantidad de ítems de la compra actual.
▪ registrarProducto(pesoEnKg, precioPorKg): recibe el peso en kg del ítem comprado y
su precio por kg, debiendo realizar las actualizaciones en el estado de la balanza.
▪ devolverMontoAPagar(): retorna el monto de la compra actual.
▪ devolverResumenDeCompra(): retorna un String del siguiente estilo “Total a pagar X
por la compra de Y productos” , donde X es el monto e Y es la cantidad de ítems de la
compra.
 */
package tema3;

/**
 *
 * @author pc
 */
public class balanza {
    private double monto;
    private int cantItems;
    private String resumen;
    
    public balanza(){

    }
    
    public double getMonto() {
        return monto;
    }

    public void iniciarCompra(){
        this.monto=0;
        this.cantItems=0;
        this.resumen="El resumen de cuenta es: ";
    }
        
    public void registrarProducto(double peso, double precio,String descripcion){ 
        monto=monto+(precio*peso);
        cantItems=cantItems+1;
        resumen= resumen +descripcion+"-"+ (precio*peso)+" pesos \n";
    }
    
    public double devolverMontoAPagar(){
        return this.monto;// retornar el valor del atributo monto
    }
    
    public String devolverResumenCompra(){
        String aux=resumen +" Total a pagar"+this.monto+ " por la compra de: "+cantItems+" productos";
        return aux;    
    }
}



