/*Representar alumnos de una facultad. De cualquier alumno se conoce: DNI, nombre y guarda para cada una de las N
materias de la carrera: nota y fecha de aprobación. Las materias tienen código de 1 a N. Además de los alumnos de
grado se tiene la carrera, mientras que de los alumnos de doctorado el título universitario y universidad de origen.
1- Genere las clases necesarias. Provea constructores para iniciar las materias aprobadas y los alumnos a partir de la
información necesaria. Tenga en cuenta que: los alumnos de grado cursan 30 materias y los de doctorado 8; e
inicialmente el alumno no debe registrar aprobada ninguna materia.
2- Implemente los métodos necesarios, en las clases que corresponda, para:
a) Dado un código de materia y sus datos de aprobación, registrar al alumno la aprobación de dicha materia.
b) Determinar si el alumno está graduado, teniendo en cuenta que para ello deben tener las N materias aprobadas y
promedio al menos 4.
c) Obtener un String que represente al alumno siguiendo el ejemplo:
Ej. alumnos de grado “DNI; Nombre; Materias aprobadas: código, nota y fecha de c/u; Está graduado:…; Carrera”
Ej. alumnos de doctorado “DNI; Nombre; Materias aprobadas: código, nota y fecha de c/u; Está graduado:…; Título, Universidad
de Origen”
3- Realice un programa que instancie un alumno de cada tipo. Cargue información de materias aprobadas a cada
uno. Informe en consola el resultado del inciso c)*/
package parcial;

/**
 *
 * @author lauty
 */
import PaqueteLectura.GeneradorAleatorio;

public class parcial1 {

    
    public static void main(String[] args) {
        AlumnoGrado a1=new AlumnoGrado("Lautaro",43732185,"Programación");
        for(int i=0; i<30; i++){
            int nota=GeneradorAleatorio.generarInt(10);
            String fecha=GeneradorAleatorio.generarString(10);
            a1.registrarMateria(i, nota, fecha);
        }
        
        AlumnoDoctorado a2=new AlumnoDoctorado("Francisco",44256789,"Abogacia","UNLP");
        for (int j=0; j<8; j++){
            int nota=GeneradorAleatorio.generarInt(10);
            String fecha=GeneradorAleatorio.generarString(10);
            a2.registrarMateria(j, nota, fecha);
        }
        
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
    
}
