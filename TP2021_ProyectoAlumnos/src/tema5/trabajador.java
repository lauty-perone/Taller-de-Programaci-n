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
public class trabajador extends Persona {
     private String tarea;

    public trabajador(String unNombre, int unDNI, int unaEdad, String unaTarea){
        super(unNombre,unDNI,unaEdad);
        this.setTarea(unaTarea);
    }
     
    public String getTarea() {
        return tarea;
    }

    private void setTarea(String tarea) {
        this.tarea = tarea;
    }
     
     @Override
    public String toString(){
        String aux=super.toString()+ "Soy " + tarea +".";
        return aux;
    }



}
