package cicloWhile;

public class ejercicio1 {

	public static void main(String[] args) {
		// Invertir la palabra "Programación"
		
		String palabra = "Programación";
		
		int cont = palabra.length()-1;
		
		System.out.print("La palabra "+palabra+" invertida es: ");
		
		while(cont >= 0)
		{
			System.out.print(palabra.charAt(cont));
			cont--;
		}

	}

}
