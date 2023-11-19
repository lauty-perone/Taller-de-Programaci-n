/*
6- Se dispone de la clase Partido (ya implementada en la carpeta tema2). Un objeto
partido representa un encuentro entre dos equipos (local y visitante). Un objeto partido
puede crearse sin valores iniciales o enviando en el mensaje de creación el nombre del
equipo local, el nombre del visitante, la cantidad de goles del local y del visitante (en ese
orden). Un objeto partido sabe responder a los siguientes mensajes:
getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” pasado por parámetro (X)
setVisitante(X) modifica el nombre del equipo visitante al “String” pasado por parámetro (X)
setGolesLocal(X) modifica la cantidad de goles del equipo local “int” pasado por parámetro (X)
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante “int” pasado por parámetro (X)
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna un String
vacío).
hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en el
campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga informar:
- La cantidad de partidos que ganó River.
- El total de goles que realizó Boca jugando de local.
- El porcentaje de partidos finalizados con empate. */
package tema2;

import PaqueteLectura.Lector;

public class Partido {
    private String local;
    private String visitante;
    private int golesLocal; 
    private int golesVisitante;
    
    public Partido(){
    
    }

    public Partido(String unLocal, String unVisitante, int unGolLocal, int unGolVisitante){
        local = unLocal;
        visitante = unVisitante;
        golesLocal = unGolLocal;
        golesVisitante = unGolVisitante;
    }

    
    public String getLocal() {
        return local;
    }

    public String getVisitante() {
        return visitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setLocal(String unEquipo) {
        local = unEquipo;
    }

    public void setVisitante(String unEquipo) {
        visitante = unEquipo;
    }

    public void setGolesLocal(int unosGoles) {
        golesLocal = unosGoles;
    }

    public void setGolesVisitante(int unosGoles) {
        golesVisitante = unosGoles;
    }
    
    public boolean hayGanador(){
         return (golesLocal!=golesVisitante); 
    }
    
    public boolean hayEmpate(){
         return ((golesLocal==golesVisitante));
    }
    
    public String getGanador(){
         String ganador=new String();
         if (golesLocal>golesVisitante){
             ganador = local;
         }
         else {
             if (golesLocal<golesVisitante){
                 ganador = visitante;
             }
         }
         return ganador;
                 
    }	    
    public static void main(String[] args) {
        Partido[] vector=new Partido[20];
        System.out.println("Ingrese el nombre del equipo visistante");
        String visitante= Lector.leerString();
        int dimL=0;
        while(visitante!= "ZZZ" && dimL<20){
            Partido p=new Partido();
            System.out.println("Ingrese el nombre del equipo local");
            String local= Lector.leerString();
            System.out.println("Ingrese los goles que hizo"+local);
            int golesLocal= Lector.leerInt();
            System.out.println("Ingrese los goles que hizo"+ visitante);
            int golesVisitante= Lector.leerInt();
            p.visitante=visitante;
            p.local=local;
            p.golesLocal=golesLocal;
            p.golesVisitante=golesVisitante;
            vector[dimL]=p;
            dimL++; 
        }
        int cant=0; int total=0; int emp=0;
        for (int i=0; i<dimL; i++){
            if(vector[i].getGanador()=="River"){
                cant=cant+1;
            }
            if(vector[i].local=="Boca"){
                total=total+vector[i].getGolesLocal();
            }
            if(vector[i].hayEmpate()){
                emp=emp+1;
            }
        }
        double porc=(emp*100)/20;
        System.out.println("El porcentaje de partidos en empate es de: "+porc);
    } 
}
