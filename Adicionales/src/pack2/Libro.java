
package pack2;

public class Libro {
    private String titulo;
    private double peso;
    private int cantPaginas;
    private Autor autor;
    
    public Libro(String unTitulo,double unPeso, int pag, String nombre, String bio){
        this.titulo=unTitulo;
        this.peso=unPeso;
        this.cantPaginas=pag;
        this.autor.setNombre(nombre);
        this.autor.setBio(bio);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "El titulo del libro es: "+titulo+"\nEl peso es: "+peso+"\nLa cantidad de páginas: "+cantPaginas+"\nEl nombre del autor: "+autor.getNombre()+"Y su biografia: "+autor.getBio();
    }
    
    
}
