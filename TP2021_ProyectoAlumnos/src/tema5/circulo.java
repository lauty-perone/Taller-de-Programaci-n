/*
 4-A- Generar una clase para representar círculos. Los círculos se caracterizan por su radio
(double), el color de relleno (String) y el color de línea (String). El círculo debe saber:
▪ Devolver/modificar el valor de cada uno de sus atributos (get# y set#)
▪ Calcular el área y devolverla. (método calcularArea)
▪ Calcular el perímetro y devolverlo. (método calcularPerimetro)
NOTA: la constante PI es Math.PI
 */
package tema5;

import tema3.*;

/**
 *
 * @author pc
 */
public class circulo extends Figura {
    private double radio;
    
    
    public circulo(double unRadio, String unCR, String unCL){
         super(unCR,unCL);
         radio=unRadio;
    }
    
    
    
    public double getRadio() {
        return radio;
    }


    public void setRadio(double unRadio) {
        radio = unRadio;
    }
    
    @Override
    public double calcularArea(){
        double area= Math.PI * (radio*radio);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro= 2*(Math.PI*radio);
        return perimetro;
    }
     @Override
    public String toString(){
       String aux = super.toString() + 
                    " Radio: " + getRadio();
       return aux;
    }

}
