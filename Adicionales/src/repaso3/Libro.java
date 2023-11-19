
package repaso3;

public abstract class Libro {
    private String titulo;
    private double precio;
    private String[]autores;
    private int dimL;
    
    public Libro(String tit,double costo){
        this.titulo=tit;
        this.precio=costo;
        this.dimL=0;
        autores=new String[8];
        for(int i=0; i<8; i++)
            autores[i]="";
    } 
    
    public void agregarAutor(String nombre){
        autores[dimL]=nombre;
        dimL++;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract double calcularPrecio();
    
    @Override
    public String toString(){
        String aux="El título del libro es: "+this.titulo+ "\nEl precio final es: "+this.calcularPrecio()+ 
                "\nY el nombre de su primer autor es: "+autores[0];
        return aux;
    }
}
