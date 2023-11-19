
package parcial;

public class AlumnoGrado extends Alumno{
    private String carrera;
    
    public AlumnoGrado(String nombre,int dni,String unaCarrera){
        super(nombre,dni,30);
        this.carrera=unaCarrera;
    }
    
    @Override
    public String toString(){
       return "Alumno de grado: "+super.getDni()+ super.getNombre()+"\nMaterias aprobadas: "+super.materiasAprobadas()+"\n" +super.graduacion()+"\nCarrera: "+carrera;
    }
}
