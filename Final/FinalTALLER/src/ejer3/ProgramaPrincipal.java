package ejer3;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Catalogo c = new Catalogo(15);
		
		Artista a1 = new Artista("Lautaro", "Caperucita Roja");
		Artista a2 = new Artista("Leandro" , "Harry Potter");
		
		c.agregarArtista(a1);
		c.agregarArtista(a2);
		
		System.out.println(c.toString());
		
	}

}
