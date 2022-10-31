package ciclosFor;

public class ejercicioMultiplos7 {

	public static void main(String[] args) {
		// Calcular los multiplos de 7 entre 1 y 1000
		int contador = 0;
		for(int i = 1; i <= 1000; i++)
		{
			if(i % 7 == 0)
			{
				contador++;
			}
		}
		System.out.println("Los multiplos de 7 entre 1 y 1000 son: "+contador);

	}

}
