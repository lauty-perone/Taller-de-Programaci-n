
package adicionales;

/**
 *
 * @author pc
 */
public class alumno {
    private String nombre;
    private int dni;
    private int tema;

    public alumno(String unNombre, int unDni){
        this.nombre=unNombre;
        this.dni=unDni;
        this.tema=-1;
    }
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTema() {
        return tema;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }
    
    @Override
    public String toString(){
       String aux="El nombre del alumno es: "+nombre+" y su dni es: "+ dni;
       return aux;
    }
    
}
