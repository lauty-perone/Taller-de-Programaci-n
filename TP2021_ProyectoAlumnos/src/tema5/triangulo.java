
package tema5;

/**
 *
 * @author pc
 */
public class triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
  
    
    public triangulo(double unLado1,double unLado2,double unLado3, String unCR, String unCL){
        super(unCR,unCL);
        this.lado1=unLado1;
        this.lado2=unLado2;
        this.lado3=unLado3;
    }
    
    
    
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

 

    public void setLado1(double unLado1) {
        this.lado1 = unLado1;
    }

    public void setLado2(double unLado2) {
        this.lado2 = unLado2;
    }

    public void setLado3(double unLado3) {
        this.lado3 = unLado3;
    }
    
    @Override
    public double calcularArea(){
        
        double s= (lado1+lado2+lado3)/2; 
        double area=s*(s-lado1)*(s-lado2)*(s-lado3);
        double sqrt = Math.sqrt(area);
        return sqrt;
     }
    @Override
    public double calcularPerimetro(){
        
        double perimetro= lado1+lado2+lado3;
        return perimetro;
    }
     @Override
    public String toString(){
       String aux = super.toString() + 
                    " Lado1: " + getLado1()+
                    "Lado2: "+ getLado2()+
                    "Lado3: "+ getLado3();
       return aux;
    }
}    

