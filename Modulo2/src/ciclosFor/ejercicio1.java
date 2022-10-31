package ciclosFor;

public class ejercicio1 {

	public static void main(String[] args) {
		// Factorial de un número previo
		int num = 5, resultado = 1;
		for(int facto  = 1; facto <= num; facto++)
		{
			resultado =  facto * resultado;
		}
		System.out.println("El factorial de "+num+" es: "+resultado);
	}

}
