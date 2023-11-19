package parcial;

public class AlumnoDoctorado extends Alumno {
    private String titulo;
    private String universidad;
    
    public AlumnoDoctorado(String nombre, int dni, String unTitulo, String unaUniversidad){
        super(nombre,dni,8);
        this.titulo=unTitulo;
        this.universidad=unaUniversidad;
    }
    
    @Override
    public String toString(){
       return "Alumno de grado: "+super.getDni()+ super.getNombre()+"\nMaterias aprobadas: "+super.materiasAprobadas()+"\n" +super.graduacion()
               +"\nTitulo: "+titulo + "\nUniversidad de origen: "+universidad;
    }
}
