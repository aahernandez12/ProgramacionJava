package vectores;
import java.util.Scanner;

public class sumaParesImpares {

	public static void main(String[] args) {
		// Aceptar un vector de 5 numeros y obtener el numero de pares e impares
		System.out.println("Aceptar un vector de 5 números");
		int contpar = 0, contimpar = 0;
		int i;
		
		int numeros [] = new int [5];
		Scanner teclado = new Scanner (System.in);
		
		// Carga del Vector
		for(i = 0; i < numeros.length; i++)
			{
			System.out.println("Introduce número entero: ");
			numeros [i] = teclado.nextInt();
			}
		
		//Obtener total de pares e impares
		
		
		for(i = 0; i < numeros.length; i++)
		{
			if(numeros[i] % 2 == 0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
		}
		
		System.out.println("Del total de "+numeros.length+" numeros, "+contpar+" son Pares y "+contimpar+" son Impares.");	
	}

}
