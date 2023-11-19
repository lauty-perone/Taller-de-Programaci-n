/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

/**
 *
 * @author pc
 */
public class per {
    private String nombre;
    private int dni;
    private int edad;
    
    public per (String unNombre, int unDni, int unaEdad){
         this.setNombre(unNombre);
         this.setDni(unDni);
         this.setEdad(unaEdad);
    }
                 
                 
    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
}
