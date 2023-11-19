
package pack2;

public class Estanteria {
    private Libro[][] estanteria;
    private int filas;
    private int columnas;
    
    public Estanteria(int M,int N){
        this.iniciarEstanteria(M, N);
    } 
    
    public Estanteria(){
        this.iniciarEstanteria(10, 5);
    }
    
    public void iniciarEstanteria(int M,int N){
        estanteria= new Libro[M][N];
        this.filas=M;
        this.columnas=N;
        for(int i=0; i<M; i++)
            for(int j=0; j<N; j++)
                estanteria[i][j]=null;
    }
    
    public void almacenarLibro(Libro libro,int fila, int colum){
        this.estanteria[fila][colum]=libro;  
    }
    
    public void sacarLibro(String titulo){
        for(int i=0; i<filas; i++)
            for(int j=0; j<columnas; j++)
                if(estanteria[i][j]!=null)
                    if(estanteria[i][j].getTitulo().equals(titulo))
                        estanteria[i][j]=null;
                
    }
    
    public Libro calcularLibroMasGrande(){
       int max=-1;
       int f;
       int c; 
       Libro libro = null;
        for(int i=0; i<filas; i++)
            for(int j=0; j<columnas; j++) 
                if(estanteria[i][j].getCantPaginas()>max){
                    max=estanteria[i][j].getCantPaginas();
                    libro=estanteria[i][j];
                }
        return libro;
    }
    
    public int calcularEstanteMasPesado(){
        double max=-1;
        double tot=0;
        int estanteMax = 0;
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++)
                 if(estanteria[i][j]!=null)
                     tot=tot+estanteria[i][j].getPeso();
        
            if(tot>max){
                max=tot;
                estanteMax=i;
            }
        }
        return estanteMax;
    }
    
}
