import PaqueteLectura.GeneradorAleatorio;

public abstract class Grupos {
    private Paciente[]pacientes;
    private int dimL; 
    
    public Grupos(){
        pacientes=new Paciente[10];
        for(int i=0; i<10; i++){
            pacientes[i]=null;
        }
        dimL=0;
    }

    public int getDimL() {
        return dimL;
    }
    
    public String agregarPaciente(Paciente P){
        pacientes[dimL]=P;
        dimL++;
        return "El número identificatorio del grupo del paciente agregado es: "+dimL;
    }
    public Paciente obtenerPaciente(int id){
        return pacientes[id];
    }
    public String representacion(){
        String aux="";
        for (int i=0; i<dimL; i++)
            aux=aux+ "\nID del paciente: "+(i+1)+"\n"+this.pacientes[i].toString();
        return aux;
    }
    public abstract void aplicarDosis(double dosis);
}
