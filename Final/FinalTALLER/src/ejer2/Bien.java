
package ejer2;

/**
 *
 * @author lauty
 */
public class Bien {
    
    private String descripcion;
    private int cant;
    private double costo;

    public Bien(String descripcion, int cant, double costo) {
        this.descripcion = descripcion;
        this.cant = cant;
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    
    
    
}
