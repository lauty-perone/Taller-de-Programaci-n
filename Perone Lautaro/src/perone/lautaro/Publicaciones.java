
package perone.lautaro;

public class Publicaciones extends Premiacion{
    
    public Publicaciones(int cant){
        super(cant);                                                            //invoco al constructor de la superclase ,enviandole la cantidad 
    }                                                                           //de postulados que deseo
    
    @Override
    public String otorgarPremio(int X){
        String aux="";
        for(int i=0; i<super.getDimL(); i++){                   
            if(super.getDocentes()[i].getCantP()>=X)                             //pregunto si tiene más años que el parámetro recibido X
                aux=aux+super.getDocentes()[i].getNombre()+"\n";                //Si es asi, lo agrego al string para retornar
        }                                                                       //Para poder acceder a las variables de la superclase 
        return aux;                                                             //lo hago con la sentencia super, por ej super.getDocentes para tener el vector
    }
}
