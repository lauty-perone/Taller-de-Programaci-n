
package nose;

public class Catalogo {
    private Artista[]vectorCatalogo;
    private int dimL;
    
    public Catalogo(){
        this.dimL=0;
        this.vectorCatalogo =new Artista[15];
        for(int i=0; i<15; i++)
            this.vectorCatalogo[i]=null;
        
    }
    public void agregarArtista(Artista a){
        this.vectorCatalogo[dimL]=a;
        dimL++;
    }
    
    @Override
    public String toString(){
        String aux="";
        for (int i=0; i<dimL; i++)
            aux=aux+this.vectorCatalogo[i].getNombre()+":artísta número "+(i+1)+" ,nombre de su obra: "+this.vectorCatalogo[i].getNombreObra()+"\n";
        return aux;
    }
}
