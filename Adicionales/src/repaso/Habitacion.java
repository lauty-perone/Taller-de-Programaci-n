
package repaso;

public class Habitacion {
    private Cliente cliente;
    private double costo;
    private boolean ocupada;
    
    public Habitacion (int piso){
        ocupada=false;
        cliente=null;
        costo=800+(100*piso);
    }
    public void agregarCliente(Cliente unCliente){
        this.cliente=unCliente;
        this.ocupada=true;
    }

    public double getCosto() {
        return costo;
    }

    public boolean getOcupada(){
        return ocupada;
    }
    
}
