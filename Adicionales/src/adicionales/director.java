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
public class director extends per{
    
    private int antiguedad;

    public director(String unNombre, int unaEdad,int unDni, int unaAnt) {
        super(unNombre,unaEdad,unDni);
        this.antiguedad = unaAnt;
    }
    
  

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public int getAntiguedad() {
        return antiguedad;
    }


}
