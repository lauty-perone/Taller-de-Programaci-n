
package adicionales;


public class corista extends per {
    private int tono;


    public corista(String unNombre, int unDni, int unaEdad, int unTono){
        super(unNombre,unDni,unaEdad);
        this.setTono(unTono);
    }
    
    public int getTono() {
        return tono;
    }

    public void setTono(int tono) {
        this.tono = tono;
    }
}
               
    
