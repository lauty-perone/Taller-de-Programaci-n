/*1- A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
El triángulo debe saber:
▪ Devolver/modificar el valor de cada uno de sus atributos (métodos get# y set#)
▪ Calcular el área y devolverla (método calcularArea)
▪ Calcular el perímetro y devolverlo (método calcularPerimetro)
NOTA: Calcular el área con la fórmula Á𝑟𝑒𝑎 = √𝑠(𝑠 − 𝑎)(𝑠 − 𝑏)(𝑠 − 𝑐) , donde a,b y c son
los lados y 𝑠 =
𝑎+𝑏+𝑐
2
. La función raíz cuadrada es Math.sqrt(#)*/
package tema3;

/**
 *
 * @author pc
 */
public class triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private String relleno;
    private String linea;
    
    public triangulo(double lado1,double lado2,double lado3, String relleno, String linea){
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.relleno=relleno;
        this.linea=linea;
    } 
    
    public triangulo(){
        
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

    public String getRelleno() {
        return relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String calcularArea(double lado1,double lado2, double lado3){
        String aux="";
        double s= (lado1+lado2+lado3)/2; 
        double area=s*(s-lado1)*(s-lado2)*(s-lado3);
        double sqrt = Math.sqrt(area);
        aux="El area del triangulo es: "+sqrt;
        return aux;
     }
    public String calcularPerimetro(double lado1,double lado2, double lado3){
        String aux2="";
        double perimetro= lado1+lado2+lado3;
        aux2="El perimetro del triangulo es: "+perimetro;
        return aux2;
    }
}    

