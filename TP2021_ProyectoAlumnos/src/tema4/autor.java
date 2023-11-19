/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author pc
 */
public class autor {
    private String nombre;
    private String biografia;
    
    public autor (String unNombre, String unaBiografia){
        this.biografia=unaBiografia;
        this.nombre=unNombre;
    }
    public autor(){
        
    }
    public String getNombre() {
        return nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    
}
