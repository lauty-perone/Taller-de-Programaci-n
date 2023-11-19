/*
Definir una clase para representar micros. Un micro conoce su patente, destino, hora
salida, el estado de sus 20 asientos (es decir si está o no ocupado) y la cantidad de asientos
ocupados al momento. Lea detenidamente a) y b) y luego implemente.
a) Implemente un constructor que permita iniciar el micro con una patente, un destino y
una hora de salida (recibidas por parámetro) y sin pasajeros.
b) Implemente métodos para:
i. devolver/modificar patente, destino y hora de salida
ii. devolver la cantidad de asientos ocupados
iii. devolver si el micro está lleno
iv. validar un número de asiento recibido como parámetro (es decir, devolver si está
en rango o no)
v. devolver el estado de un nro. de asiento válido recibido como parámetro
vi. ocupar un nro. de asiento válido recibido como parámetro
vii. liberar un nro. de asiento válido recibido como parámetro
viii. devolver el nro. del primer asiento libre
 */
package tema4;

/**
 *
 * @author pc
 */
public class micro {
    private String patente;
    private String destino;
    private String salida;
    private boolean [] asientos;
    private int cantOcupados;
    
    public micro(String unaPatente, String unDestino,String unaSalida){
        this.patente=unaPatente;
        this.destino=unDestino;
        this.salida=unaSalida;
        this.cantOcupados=0;
        for (int i=0;i<20; i++){
            asientos[i]=false;
        }
    }

    public String getPatente() {
        return patente;
    }

    public String getDestino() {
        return destino;
    }

    public String getSalida() {
        return salida;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    public int asientosOcupados(){
       return cantOcupados; 
    }
    public boolean capacidad(){
        boolean capacidad=false;
        int cant=0;
        for(int i=0; i<20; i++){
            if(asientos[i]==true)cant=cant+1;
        }
        if(cant==20)capacidad=true;
        return capacidad;
    }
    public boolean validadAsiento(int asiento){
        boolean validar=false;
        if((asiento>=0)&&(asiento<=20))validar=true;
        return validar;
    }
    private boolean estadoAsiento(int asiento){
        boolean estado=false;
        if(asientos[asiento]==false)estado=true;
        return estado;    
       
    }
    public boolean ocuparAsiento(int asiento){
        boolean aux=false;
        if(this.estadoAsiento(asiento)==true){
              asientos[asiento]=true;
              this.cantOcupados=this.cantOcupados+1;
              aux=true;
        }
        return aux;
    }
    public String liberarAsiento(int asiento){
         String liberar="";
         if(this.estadoAsiento(asiento)==true)liberar="El asiento se encuentra vacio";
              else 
                {
                asientos[asiento]=false;
                this.cantOcupados=this.cantOcupados-1;
                liberar="Se ha liberado el asiento numero: "+asiento;
                }
         return liberar;
    }
    public int primerAsientoLibre(){
        int num = 0;
        for (int i=0; i<20; i++)
            if (asientos[i]==true)
                num=i;
        return num;
    }
}
