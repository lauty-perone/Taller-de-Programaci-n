
package repaso2;

public class Paciente {
    private final String nombre;
    private boolean obraSocial;
    private double costoSesion;
    
    public Paciente(String unNombre, boolean obra, double costo){
        this.nombre=unNombre;
        this.obraSocial=obra;
        this.costoSesion=costo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
