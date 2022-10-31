package matrices;

public class matriz5x4Aleat {

	public static void main(String[] args) {
		// Matriz 5 -filas- x4 -columnas- Aleatoria, mostrarla - Solución
		
		int numeros[][] = new int[5][4];
		int sumaA = 0, restaA = 0;
		double multiplicA = 1;	// debe ser tipo double porque int - me imagino - que no toma en cuenta todos los digitos 
		double division;
		double raiz;
				
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
					sumaA = sumaA + numeros[i][j];
					restaA = restaA - numeros[i][j];
					multiplicA = multiplicA * numeros[i][j];
					System.out.print(numeros[i][j] + "  ");
				}
				System.out.println(); // Impresión de línea vacia para saltos de línea cada vez que se recorra una fila
			}						
		
		division = multiplicA/sumaA;
		raiz = Math.sqrt(sumaA);
		
		System.out.println("La suma de todos los elementos de la matriz es: "+sumaA);
		System.out.println("La resta de todos los elementos de la matriz es: "+restaA);
		System.out.println("La multiplicación de todos los elementos de la matriz es: "+multiplicA);
		System.out.println("El resultado de la división de la multiplicación por la suma es: "+division);
		System.out.println("La raíz cuadrada de la suma de todos los elementos de la matriz es: "+raiz);
		
	}
}