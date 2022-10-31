package matrices;

public class ejercicio1 {

	public static void main(String[] args) {
		// Por medio de 3 matrices (3x4) aleatorias haga distintas operaciones
		
		int filas = 4;
		int columnas = 3;
		int aux = 0;
		
		int matrizA[][] = new int [filas][columnas];
		int matrizB[][] = new int [filas][columnas];
		int matrizC[][] = new int [filas][columnas];
		
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < columnas; j++)
			{
				aux = (int) Math.ceil(Math.random()*100);
				if(aux % 2 == 0)
				{
					matrizA[i][j] = aux;
				}
				else
				{
					j--;
				}
					
				
				
			}
		}
		
		
		for(int i = 0; i < filas; i++)
		{
			for(int j = 0; j < columnas; j++)
			{
				aux = (int) Math.ceil(Math.random()*100);
				
				if(aux % 2 != 0)
				{
					matrizB[i][j] = aux;
				}
				else
				{
					j--;
				}
				
			}
		}
		
		
		// Calcular la 3a matriz
		
				
		for(int i = 0; i < filas ; i++)
		{
			for(int j = 0; j < columnas; j++)
			{
			matrizC[i][j] = (matrizA[i][j] + matrizB[i][j]);
			}
		}
		
		// Mostar matrices
		
				System.out.println("Matriz A");
				for(int i = 0; i < filas; i++)
				{
					for(int j = 0; j < columnas; j++)
					{
						System.out.print(matrizA[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				
				System.out.println("Matriz B");
				for(int i = 0; i < filas; i++)
				{
					for(int j = 0; j < columnas; j++)
					{
						System.out.print(matrizB[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				
				System.out.println("Suma");
				for(int i = 0; i < filas; i++)
				{
					for(int j = 0; j < columnas; j++)
					{
						System.out.print(matrizC[i][j] + " ");
					}
					System.out.println();
				}
	}

}
