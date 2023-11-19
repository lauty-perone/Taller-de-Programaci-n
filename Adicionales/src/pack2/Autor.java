
package pack2;

public class Autor {
    private String nombre;
    private String bio;
    
    public Autor(String unNombre, String unaBio){
        this.nombre=unNombre;
        this.bio=unaBio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
    
}
