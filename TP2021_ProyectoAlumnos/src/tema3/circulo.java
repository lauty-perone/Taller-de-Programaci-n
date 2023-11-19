/*
 4-A- Generar una clase para representar círculos. Los círculos se caracterizan por su radio
(double), el color de relleno (String) y el color de línea (String). El círculo debe saber:
▪ Devolver/modificar el valor de cada uno de sus atributos (get# y set#)
▪ Calcular el área y devolverla. (método calcularArea)
▪ Calcular el perímetro y devolverlo. (método calcularPerimetro)
NOTA: la constante PI es Math.PI
 */
package tema3;

/**
 *
 * @author pc
 */
public class circulo {
    private double radio;
    private String relleno;
    private String linea;
    
    public circulo(double unRadio, String unRelleno, String unaLinea){
        this.iniciar(unRadio,unRelleno,unaLinea);
    }
    public circulo(){
    
    }
     private void iniciar(double unRadio,String unRelleno,String unaLinea){
         this.radio=unRadio;
         this.relleno=unRelleno;
         this.linea=unaLinea;
     }
    
    
    public double getRadio() {
        return radio;
    }

    public String getRelleno() {
        return relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
    
    public double calcularArea(){
        double area= Math.PI * (radio*radio);
        return area;
    }
    
    public double calcularPerimetro(){
        double perimetro= 2*(Math.PI*radio);
        return perimetro;
    }

}
