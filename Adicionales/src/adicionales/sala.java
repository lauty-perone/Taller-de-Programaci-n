
package adicionales;

import PaqueteLectura.GeneradorAleatorio;

public class sala{
    private int cantAlumnos;
    private alumno[]vector;
    private int dimL;
    
    public sala(int unaCant){
        this.cantAlumnos=unaCant;
        this.dimL=0;
        for (int i=0; i<this.cantAlumnos;i++){
            vector[i]= null;
        }
    }
    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cant) {
        this.cantAlumnos = cant;
    }
    
    public void agregarAlumno(alumno a){
        vector[dimL]=a;
        dimL++;
    }
    public String temaT(int t){
        String aux="";
        for(int i=0; i<dimL; i++){
            if(vector[i].getTema()==t)
                aux= aux + vector[i].toString();
        }
        return aux;
    }
    public void cambiarTema(int cantSalas){
        int t=GeneradorAleatorio.generarInt(cantSalas);
        for(int i=0; i<dimL; i++){
            vector[i].setTema(t);
        }
    }
}


