/*
A- Definir una clase para representar entrenadores de un club de fútbol. Un entrenador
se caracteriza por su nombre, sueldo básico y la cantidad de campeonatos ganados.
▪ Defina métodos para obtener/modificar el valor de cada atributo.
▪ Defina el método calcularSueldoACobrar que calcula y devuelve el sueldo a cobrar por
el entrenador. El sueldo se compone del sueldo básico, al cual se le adiciona un plus por
campeonatos ganados (5000$ si ha ganado entre 1 y 4 campeonatos; $30.000 si ha
ganado entre 5 y 10 campeonatos; 50.000$ si ha ganado más de 10 campeonatos).*/
package tema3;

/**
 *
 * @author pc
 */
public class entrenador {
     private String nombre;
     private double sueldo;
     private int cantCampeonatos;


    public entrenador(String unNombre, double unSueldo, int unCantCampeonatos){
          this.iniciar(unNombre,unSueldo,unCantCampeonatos);
    }
    
    public entrenador(){
        
    }
    
    private void iniciar(String unNombre,double unSueldo, int unCantCampeonatos){
        this.nombre=unNombre;
        this.sueldo=unSueldo;
        this.cantCampeonatos=unCantCampeonatos;
    }
    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public int getCantCampeonatos() {
        return cantCampeonatos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setCantCampeonatos(int cantCampeonatos) {
        this.cantCampeonatos = cantCampeonatos;
    }
    
   public double sueldoCobrar(){
       if((this.cantCampeonatos>=1) && (this.cantCampeonatos<=4))
          this.sueldo=this.sueldo+5000;
          else 
          if ((this.cantCampeonatos>=5) && (cantCampeonatos<=10))
               this.sueldo=this.sueldo+30000;
               else 
               if(this.cantCampeonatos>10)
                       this.sueldo=this.sueldo+50000;
        return sueldo;
   }
}
      