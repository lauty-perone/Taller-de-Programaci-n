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
public class MainVisorFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      VisorFigurasModificado visor = new VisorFigurasModificado();
      Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
      visor.guardar(c1);
      Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
      visor.guardar(r);
      Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
      visor.guardar(c2);
      
      if(visor.quedaEspacio()==true)
                System.out.println("Queda espacio en el vector");
                else
                   System.out.println("No queda espacio en el vector");
      System.out.println("La cantidad de figuras guardadas es de: " +visor.getGuardadas());
      visor.mostrar();
 }
}

    

