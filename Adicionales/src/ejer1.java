/*Ejercicio 1. Un Laboratorio realiza experimentos para evaluar la eficacia de un nuevo fármaco para
la diabetes y para ello conformó dos grupos de pacientes: Grupo Alfa y Grupo Beta.
Ambos grupos registran la información de a lo sumo 10 pacientes (identificados de 1 a 10). De cada
paciente se guarda: nombre, último resultado de glucosa (double) y última dosis recibida de fármaco
(double). Sin embargo, los grupos difieren en la forma de aplicar el fármaco a los pacientes (esto se
detalla más adelante)
1) Genere las clases necesarias, cada una con los constructores, estado, getters y setters
adecuados. Tenga en cuenta que los grupos inicialmente no tienen pacientes.
2) Agregue a la clases que corresponda los métodos necesarios para:
a) Agregar un paciente P al grupo y retornar su número identificatorio en el grupo (ID).
b) Obtener un paciente del grupo dado un ID válido (1 a 10).
c) Aplicar una dosis a un paciente. Se recibe una dosis D (double) y se debe modificar su
última dosis recibida a D y disminuir la glucosa en un valor aleatorio entre 0 y 1.
d) Aplicar una dosis D (double) de fármaco a los pacientes del grupo, teniendo en cuenta
que: en el Grupo Alfa se le aplica la dosis D a todos los pacientes; en el Grupo Beta se
le aplica la dosis D a los pacientes cuya glucosa supera el valor 2.5.
e) Obtener la representación string del grupo, la cual se compone por el ID,. nombre,
última glucosa y última dosis de todos los pacientes del grupo
3) Realice un programa que instancie un Grupo Alfa y un Grupo Beta. Llene cada grupo con
pacientes (el primero con 3 y el segundo con 4). Aplique una dosis D de fármaco (leída por
teclado) a los pacientes de cada grupo. Imprima la representación string de cada grupo.*/

import PaqueteLectura.Lector;

public class ejer1 {

   
    public static void main(String[] args) {
       GrupoAlfa Alfa=new GrupoAlfa();
       GrupoBeta Beta=new GrupoBeta();
       Paciente p1= new Paciente("Lautaro",2,1);
       Alfa.agregarPaciente(p1);
       Paciente p2= new Paciente("Pedro",1,2.5);
       Alfa.agregarPaciente(p2);
       Paciente p3= new Paciente("Jaime",2.5,1.3);
       Alfa.agregarPaciente(p3);
       
       Paciente p4=new Paciente("Jose", 3,1.1);
       Beta.agregarPaciente(p4);
       Paciente p5=new Paciente("Lucila", 2,2);
       Beta.agregarPaciente(p5);
       Paciente p6=new Paciente("Martin", 1,2.2);
       Beta.agregarPaciente(p6);
       Paciente p7=new Paciente("Lucila", 2,3.2);
       Beta.agregarPaciente(p7);
       
       System.out.println("Escriba una dosis");
       double dosis=Lector.leerDouble();
       Alfa.aplicarDosis(dosis);
       Beta.aplicarDosis(dosis);
       
       System.out.println(Alfa.representacion());
       System.out.println(Beta.representacion());
              
       
    }
    
}
