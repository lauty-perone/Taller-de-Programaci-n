/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adicionales;


import PaqueteLectura.Lector;
public class parcial1 {

    public static void main(String[] args) {
        
        System.out.println("Escriba la cantidad de salas que posee la fecha");
        int M= Lector.leerInt();
        System.out.println("Escriba el dia del parcial");
        String dia=Lector.leerString();
        fecha f=new fecha(dia,M);
        for(int j=0; j<M;j++){
            System.out.println("Escriba la sala que desea ingresar al alumno");
            int x=Lector.leerInt();
            for (int i=0; i<3;i++){
                System.out.println("Escriba el nombre, dni del alumno");  /*leo 4 alumnos por sala*/
                String nombre=Lector.leerString();
                int dni=Lector.leerInt();
                alumno a=new alumno(nombre,dni);
                f.salaX(x, a);
                f.cambiarTema(x);
            }
            System.out.println("Escriba un nunmero de tema entre 1 y la cantidad de salas para imprimir los datos del alumno");
            int t=Lector.leerInt();
            f.devolverAlumnos(x, t);
        }
       
            
        }
    }


