/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author pc
 */
public class Persona {
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        this.setDNI(unDNI);
        this.setEdad(unaEdad);
        this.setNombre(unNombre);
    }
    
    public Persona(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    private void setDNI(int unDNI) {
        DNI = unDNI;
    }

    private void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    private void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    @Override
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años. " ;
        return aux;
    }
    
    
    }
