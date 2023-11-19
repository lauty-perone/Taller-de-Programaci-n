package ejer3;

public class Artista {

	private String nombre;
	private String obra;
	
	public Artista(String nombre, String obra) {
		this.nombre = nombre;
		this.obra = obra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}
	
    public String toString(int num) {
    	String aux = "Nombre del artista "+ num + " "+ this.nombre 
    			+ "\nNombre de su obra: "+ this.obra + "\n";
    	return aux;
    }
}
