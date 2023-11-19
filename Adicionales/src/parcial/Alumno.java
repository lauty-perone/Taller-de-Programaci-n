
package parcial;

public abstract class Alumno {
    private String nombre;
    private int dni;
    private Materia[] materias;
    private int dimF;

    public Alumno(String unNombre, int unDni,int cantM) {
        materias=new Materia[cantM];
        this.nombre = unNombre;
        this.dni = unDni;
        this.dimF=cantM;
        for(int i=0;i<cantM; i++){
            materias[i]=new Materia();
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public int getDimF() {
        return dimF;
    }
    
    public void registrarMateria(int cod, int nota,String fecha){
        materias[cod].setNota(nota);
        materias[cod].setFechaAprob(fecha);
    }
    
    public String graduacion(){
        String aux="";
        int total=0;
        int cant=0;
        for(int i=0; i<this.dimF; i++){
            total=total+materias[i].getNota();
            if(materias[i].getNota()>=4)
                cant=cant+1;
        }
        double prom=total/this.dimF;
        if((prom>=4)&&(cant==dimF))
             aux="Está graduado";
             else
                aux="No está graduado";
                
        return aux;
    }
    public String materiasAprobadas(){
        String aux="";
        for(int i=0; i<dimF; i++){
            if(materias[i].getNota()>=4)
                aux=aux+" Codigo: "+i+ "Nota: "+materias[i].getNota()+ "Fecha: "+materias[i].getFechaAprob()+"\n";
        }
        return aux;
    }
    
    @Override
    public abstract String toString();
    
    
}
