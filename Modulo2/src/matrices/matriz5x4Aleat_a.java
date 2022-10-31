package matrices;

public class matriz5x4Aleat_a {

	public static void main(String[] args) {
		// Matriz 5 -filas- x4 -columnas- Aleatoria, mostrarla
		
		int numeros[][] = new int[5][4];
		
		//Generación de la matriz con numero aleatorios
		for(int i = 0; i < 5 ; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					numeros[i][j] = (int) Math.ceil(Math.random()*100);
				}
			}
		
		//Presentación en pantalla de la matriz
		for(int i = 0; i < 5 ; i++)
			{
				for(int j = 0; j < 4; j++)
				{
					System.out.print(numeros[i][j] + "  ");
				}
				System.out.println(); // Impresión de línea vacia para saltos de línea cada vez que se recorra una fila
			}
		// Suma de los números de la matriz
		
		int sumaA = 0;
		for(int m=0; m < 5; m++)
			{
			for(int n = 0; n < 4; n++)
				{
					sumaA = sumaA + numeros[m][n];
				}
			}
		System.out.println("La suma de todos los elementos de la matriz es: "+sumaA);
		
		// Resta de los números de la matriz
		
		int restaA = 0;
		for(int p = 0; p < 5; p++)
		{
			for(int q = 0; q < 4 ; q++)
			{
				restaA = restaA - numeros[p][q];
			}
				
		}
		System.out.println("La resta de todos los elementos de la matriz es: "+restaA);
		
		//Multiplicación de todos los valores
		
		double multiplicA = 1;
		for(int s = 0; s < 5; s++)
		{
			for(int t = 0; t < 4; t++)
			{
				multiplicA = multiplicA * numeros[s][t];
			}
		}
		System.out.println("El producto de la multiplicación de todos los elementos de la matriz es: "+multiplicA);
		
		// Raíz cuadrada de la suma de todos los valores
		
		System.out.println("La raíz cuadrada de la suma de todos los elementos de la matriz es: "+Math.sqrt(sumaA));
		System.out.println("El resultado de la división de la multiplicación por la suma es: "+multiplicA/sumaA);
	}
}