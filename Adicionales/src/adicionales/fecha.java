/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;

public class fecha {
    private String dia;   /*dia,mes y año*/
    private int cantSalas;
    private sala[]vectorSalas;
    private int dimL;
    
    public fecha(String unDia, int unaCant){
        this.dia=unDia;
        this.cantSalas=unaCant;
        this.vectorSalas= new sala[this.cantSalas];
        for(int i=0; i<cantSalas; i++){
            vectorSalas=null;
        }
        this.dimL=0;
    }

    public void setCantSalas(int cantSalas) {
        this.cantSalas = cantSalas;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public void setDimL(int dimL) {
        this.dimL = dimL;
    }

    public int getCantSalas() {
        return cantSalas;
    }

    public int getDimL() {
        return dimL;
    }
    
    public void salaX(int x,alumno a){
        this.vectorSalas[x].agregarAlumno(a);
    }
    
    public void cambiarTema(int x){
        vectorSalas[x].cambiarTema(cantSalas);
    }
    public String devolverAlumnos(int x, int t){
        String aux="";
        aux=vectorSalas[x].temaT(t);
        return aux;
        }        
}

