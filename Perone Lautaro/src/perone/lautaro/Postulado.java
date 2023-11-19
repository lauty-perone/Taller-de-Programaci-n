
package perone.lautaro;

public class Postulado {
    private String nombre;
    private int cantP;
    private int años;
    
    public Postulado(String unNombre, int cantPubli, int edad){
        this.nombre=unNombre;
        this.cantP=cantPubli;
        this.años=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantP() {                        //retorno los métodos necesarios para poder llevar a cabo la resolución del problema
        return cantP;                
    }

    public int getAños() {
        return años;
    }
    
    
}
