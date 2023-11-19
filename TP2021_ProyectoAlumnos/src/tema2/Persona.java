/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;


public class Persona {
    private String nombre;
    private int DNI;
    private int edad; 
    private int getDNI;
    private int getEdad;
    
    public Persona(String unNombre, int unDNI, int unaEdad){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
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

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
        String aux; 
        aux = "Mi nombre es " + nombre + ", mi DNI es " + DNI + " y tengo " + edad + " años.";
        return aux;
    }
    
     public static void main(String[] args) {
        Persona[] vector=new Persona[10];
        int i;
        Persona p=new Persona();
        for(i=0;i<10; i++){
              
              System.out.println("Ingrese el nombre de la persona");
              String nombre= Lector.leerString();
              System.out.println("Ingrese el DNI de la persona");
              int DNI= Lector.leerInt();
              System.out.println("Ingrese la edad de la persona");
              int edad= Lector.leerInt();
              p.setNombre(nombre);
              p.setDNI(DNI);
              p.setEdad(edad);
        }
        int cant=0;int min=99999999;
        for(i=0; i<10; i++){
            if(vector[i].getEdad>65){
                cant=cant+1;
            }
            if(vector[i].getDNI<min){
                min=vector[i].getDNI();
          

                
            }
        }
        for(i=0; i<10; i++){
            if(vector[i].getDNI==min){
               System.out.println(p.toString());
            } 
        }
     }
}
