package ciclosFor;

public class ejercicio3a {

	public static void main(String[] args) {
		// Definir si un número establecido es Número Perfecto ó no
		int num = 30, sumaDivisores = 0;
		
		for(int numGuia = 1; numGuia < num; numGuia++ )
		{
			if( num % numGuia == 0)
			{
				sumaDivisores = numGuia + sumaDivisores;
			}
		}
		if( sumaDivisores == num)
		{
			System.out.println(+num+" es Número Perfecto pues la suma de sus divisores es: "+sumaDivisores);

		}
		else System.out.println(+num+" no es Número Perfecto pues la suma de sus divisores es: "+sumaDivisores);
	}

}
