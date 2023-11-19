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
public class VisorFigurasModificado {
 private int guardadas=0;
 private Figura [] vector;

 public VisorFigurasModificado(){
      guardadas=0;
      vector=new Figura[5];
      for(int i=0; i<5;i++){
          vector[i]=null;
      }
 }

 public void guardar(Figura f){
      vector[guardadas]=f;
      guardadas++;
 }
 public boolean quedaEspacio(){
     boolean queda=false;
     for(int i=0; i<5; i++){
         if (vector[i]==null)
             queda=true;
     }
     return queda;
 }

 public void mostrar(){
     for(int i=0; i<5; i++)
         if(vector[i]!=null){
               System.out.println(vector[i].toString());
               
          
         }else
             System.out.println("Ya no hay una figura guardada en la posicion: "+i);
    }
 
 public int getGuardadas() {
     return guardadas;
 }

}




