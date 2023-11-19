/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

/**
 *
 * @author lauty
 */
public class Concurso {
    
    private Pareja[] parejas;
    private int dimL;
    
    public Concurso(int N){
        this.parejas = new Pareja[N];
        this.dimL = 0;
        for (int i=0; i<N; i++)
            parejas[i] = null;
    }

    public Pareja[] getParejas() {
        return parejas;
    }

    public void setParejas(Pareja[] parejas) {
        this.parejas = parejas;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL(int dimL) {
        this.dimL = dimL;
    }
    
    public void agregarPareja(Pareja pareja){
        this.parejas [dimL] = pareja;
        dimL++;
    }
    
    public Pareja parejaConMasDiferencia (){
        Pareja max = null;
        int difMax = 0;
        for (int i=0; i<this.getDimL(); i++){
            if(this.getParejas()[i].diferenciaEdad() > difMax){
                max = this.getParejas()[i];
                difMax = this.getParejas()[i].diferenciaEdad();
            }
        }
        return max;
    }
}
