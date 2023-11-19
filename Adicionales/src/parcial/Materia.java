
package parcial;

public class Materia {
   private int nota;
   private String fechaAprob;

    public Materia() {
        this.nota = 0;
        this.fechaAprob = "";
    }

    public int getNota() {
        return nota;
    }

    public String getFechaAprob() {
        return fechaAprob;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setFechaAprob(String fechaAprob) {
        this.fechaAprob = fechaAprob;
    }
    
    
     
}
