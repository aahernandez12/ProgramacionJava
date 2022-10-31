package cicloWhile;

public class ejercicio1a {

	public static void main(String[] args) {
		// Solución invertir la palabra "Programación
		
		String palabra = "Programación";
		String invertida = "";
		
		int aux = palabra.length()-1;
		
		while(aux >= 0)
		{
			invertida = invertida + palabra.charAt(aux);
			aux--;
		}
		System.out.println("La palabra "+palabra+" invertida es :");
		System.out.println(invertida);
	}

}
