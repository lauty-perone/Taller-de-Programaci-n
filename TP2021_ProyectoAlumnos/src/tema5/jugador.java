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
public class jugador extends empleado {
     private int numPartidos;
     private int goles;
     
     public jugador(int UnNum, int unGol, String unNombre, double unSueldoBasico){
            super(unNombre,unSueldoBasico);
            setNumPartidos(UnNum);
            setGoles(unGol);
             
            }

    public int getNumPartidos() {
        return numPartidos;
    }

    public int getGoles() {
        return goles;
    }

    private void setNumPartidos(int numPartidos) {
        this.numPartidos = numPartidos;
    }

    private void setGoles(int goles) {
        this.goles = goles;
    }
    
     @Override
    public double calcularSueldoACobrar(){
        double sueldo=super.getSueldoBasico();
        if(this.goles/this.numPartidos>0.5)
            sueldo= super.getSueldoBasico()*2;
        return sueldo;
    }
    
}
