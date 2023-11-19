/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;


public class Producto {
    
    private double pesoEnKg;  
    private double precio;
    private String descripcion;

    public Producto(){

    }
    
    public Producto(double unPeso,double unPrecio,String unaDescripcion){
        pesoEnKg = unPeso;
        precio= unPrecio;
        descripcion= unaDescripcion;
    }
    
    public double getPesoEnKg() {
        return pesoEnKg;
    }

     public void setPesoEnKg(double unPeso) {
        pesoEnKg = unPeso;
    }

     public double getPrecio() {
        return precio;
    }

    public void setPrecio(double unPrecio) {
        precio = unPrecio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

    
}
