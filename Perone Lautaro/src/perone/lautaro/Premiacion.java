
package perone.lautaro;

public abstract class Premiacion {                                              //creo una superclase con carácteristicas similares de las subclases
    private Postulado[]docentes;
    private int dimL;
    
    public Premiacion(int N){
        docentes=new Postulado[N];                                              //creo el vector con la cantidad que deseo
        for(int i=0; i<N; i++)
            docentes[i]=null;                                                   //lo inicializo en null porque me dice que inicialmente no hay postulados
        this.dimL=0;                                                            //tengo una variable dimL porque me dice que a lo sumo puedo llegar a llenar el vector, 
    }                                                                           //hasta la cant que ingrese anteriormente

    public Postulado[] getDocentes() {                                          
        return docentes;
    }

    public int getDimL() {
        return dimL;                                                            //hago getters de la superclase para poder usarlo en las subclases 
    }                                                                           //para utilizarlo en el método de otorgarPremio.
    
    
    public void agregarPostulante(Postulado p){
        docentes[dimL]=p;
        this.dimL++;
    }
    
    public abstract String otorgarPremio(int X);                                //invoco un método abstracto que es implementado por las subclases
}
