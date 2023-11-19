
public class Paciente {
    private String nombre;
    private double ultResulGlucosa;
    private double ultDosisFarmaco;

    public Paciente(String UnNombre, double UnUltResulGlucosa, double UnUltDosisFarmaco) {
        this.nombre = UnNombre;
        this.ultResulGlucosa = UnUltResulGlucosa;
        this.ultDosisFarmaco = UnUltDosisFarmaco;
    }

    public String getNombre() {
        return nombre;
    }

    public double getUltResulGlucosa() {
        return ultResulGlucosa;
    }


    public double getUltDosisFarmaco() {
        return ultDosisFarmaco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUltResulGlucosa(double ultResulGlucosa) {
        this.ultResulGlucosa = ultResulGlucosa;
    }

    public void setUltDosisFarmaco(double ultDosisFarmaco) {
        this.ultDosisFarmaco = ultDosisFarmaco;
    }
    @Override
    public String toString() {
        return "Nombre de paciente: "+nombre+"\nÚltimo resultado de glucosa: "+this.ultResulGlucosa+"\nÚltima dosis recibida de fármcaco: "+this.ultDosisFarmaco;
    }
    
    
}
