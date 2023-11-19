
package adicionales;


public class coro {
    private String nombre; 
    private director dir;
    private corista alumno;
    
    public coro(String unNombre,director unDir, corista unAlumno){
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDir(director dir) {
        this.dir = dir;
    }

    public void setAlumno(corista alumno) {
        this.alumno = alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public director getDir() {
        return dir;
    }

    public corista getAlumno() {
        return alumno;
    }

    

}
