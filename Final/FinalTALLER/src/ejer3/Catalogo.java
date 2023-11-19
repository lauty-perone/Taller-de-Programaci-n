package ejer3;

public class Catalogo {

	private Artista[] catalogo;
	private int dimL;
	
	public Catalogo(int N) {
		this.catalogo = new Artista[N];
		this.dimL = 0;
	}
	
	public void agregarArtista(Artista a) {
		this.catalogo[this.dimL] = a;
		this.dimL++;
	}
	
	public String toString() {
		String aux ="";
		for (int i =0; i<dimL; i++) {
			aux += this.catalogo[i].toString(i+1);
		}
		return aux;
	}
}
