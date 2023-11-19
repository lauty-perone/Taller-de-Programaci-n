
package repaso;

public class parcial {

    
    public static void main(String[] args) {
        Hotel hotel=new Hotel(4,2);
        Cliente c1=new Cliente("Lautaro",43732185);
        System.out.println("El núm de habitacion del cliente es: "+ hotel.nuevoCliente(c1, 0));
        Cliente c2=new Cliente("Pedro",44251875);
        System.out.println("El núm de habitacion del cliente es: "+ hotel.nuevoCliente(c2, 0));
        Cliente c3=new Cliente("Jose",41252689);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c3, 1));
        Cliente c4=new Cliente("Fiona",398695457);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c4, 1)); 
        Cliente c5=new Cliente("Joaquin",37548692);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c5, 2)); 
        Cliente c6=new Cliente("Ulises",42512365);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c6, 2)); 
        Cliente c7=new Cliente("Roberto",45789632);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c7, 3)); 
        Cliente c8=new Cliente("Marta",27458698);
        System.out.println("El núm de habitacion del cliente es: "+hotel.nuevoCliente(c8, 3)); 
        
        System.out.println("El costo a cobrar por dia del hotel es de: "+hotel.calcularCostoDia());
        
        
    }
    
}
