package ciclosFor;

public class ejercicio1a {

	public static void main(String[] args) {
		// Solución a Factorial de un número previo
		int numero = 5, factorial = 1;
		for(int i  = numero; i > 0; i--, numero--)
		{
			factorial = factorial * numero;
		}
		System.out.println("El factorial de "+numero+" es: "+factorial); // "El factorial de "+numero+" es: " Mostraria 0 en +numero

	}

}
