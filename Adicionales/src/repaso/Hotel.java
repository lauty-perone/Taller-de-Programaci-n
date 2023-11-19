
package repaso;

public class Hotel {
    private Habitacion[][]hotel;
    private int cantH;
    private int cantP;
    
    public Hotel (int unPiso, int cantHabit){
        hotel=new Habitacion[unPiso][cantHabit];
        this.cantH=cantHabit;
        this.cantP=unPiso;
        for(int i=0; i<unPiso; i++)
           for(int j=0; j<cantHabit; j++){
               hotel[i][j]=new Habitacion(unPiso);
               
           }
    }
    
    public int nuevoCliente(Cliente cliente, int X){
        int pos=0;
        int aux=0;
        while(hotel[X][pos].getOcupada())
        pos=pos+1;
        if(!hotel[X][pos].getOcupada()){
              hotel[X][pos].agregarCliente(cliente);
              aux=pos;      
        
        }
        return aux+1;
    }
    public double calcularCostoDia(){
        double total=0;
        for(int i=0; i<cantP; i++)
            for(int j=0; j<this.cantH;j++){
                   total=total+hotel[i][j].getCosto();
            }
        return total;
    }
}
