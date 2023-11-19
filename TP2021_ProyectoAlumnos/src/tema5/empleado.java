
package tema5;

/**
 *
 * @author pc
 */
public abstract class empleado {
    private String nombre;
    private double sueldoBasico;

    public empleado(String unNombre, double UnSueldoBasico) {
        setNombre(unNombre);
        setSueldoBasico(UnSueldoBasico);
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    @Override
    public String toString(){
        String aux= "El nombre del empleado es: "+this.nombre+
                    " y su sueldo a cobrar es: "+this.calcularSueldoACobrar();
        return aux;    
    }
    public abstract double calcularSueldoACobrar ();
    
    
}
