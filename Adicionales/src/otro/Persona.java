
package otro;

public class Persona {
    private String nombre;
    private int dni;
    private double colabPesos;

    public Persona(String unNombre, int unDni, double unaColabPesos) {
        this.nombre = unNombre;
        this.dni = unDni;
        this.colabPesos = unaColabPesos;
    }

    public double getColabPesos() {
        return colabPesos;
    }

    public void setColabPesos(double colabPesos) {
        this.colabPesos = colabPesos;
    }

    @Override
    public String toString() {
        return nombre+" y su DNI: "+dni;
    }
    
    
}
