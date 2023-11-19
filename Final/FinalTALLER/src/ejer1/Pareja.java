
package ejer1;

/**
 *
 * @author lauty
 */
public class Pareja {
    
    private Participante[] pareja;
    private String estiloBaile;
    
    public Pareja (Participante p1, Participante p2){
        this.pareja = new Participante[2];
        this.pareja[0] = p1;
        this.pareja[1] = p2;
    }

    public Participante[] getPareja() {
        return pareja;
    }

    public void setPareja(Participante[] pareja) {
        this.pareja = pareja;
    }

    public String getEstiloBaile() {
        return estiloBaile;
    }

    public void setEstiloBaile(String estiloBaile) {
        this.estiloBaile = estiloBaile;
    }
    
    public int diferenciaEdad (){
        if (this.getPareja()[0].getEdad()> this.getPareja()[1].getEdad())
                return (this.getPareja()[0].getEdad() - this.getPareja()[1].getEdad());
        else
                return (this.getPareja()[1].getEdad() - this.getPareja()[0].getEdad());

    }
}
