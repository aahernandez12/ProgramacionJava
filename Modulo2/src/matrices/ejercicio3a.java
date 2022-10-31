package matrices;

public class ejercicio3a {

	public static void main(String[] args) {
		// Solucion - En una matriz aleatoria de 3x4 imprimir algunas filas y columnas
		
		int matriz[][] = new int [3][4];
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				matriz[i][j] = (int) Math.ceil(Math.random()*100);
			}
		}
		
		// Mostrar matriz
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		
		// Imprimir 1a fila
		System.out.println("Primera Fila");
		for(int i = 0; i < 4; i++)
		{
			System.out.print(matriz[0][i] + " ");	// 0 equivale a Fila 1
		}		
		System.out.println("");
		System.out.println("");
		
		
		// Imprimir 2a columna
		System.out.println("Segunda Columna");
		for(int i = 0; i < 3; i++)
		{
			System.out.println(matriz[i][1] + " ");	// 1 equivale a Columna 2
		}	
		System.out.println("");
			
				
		// Imprimir 3a fila
		System.out.println("Tercera Fila");			// 1 equivale a Fila 2
		for(int i = 0; i < 4; i++)
		{
			System.out.print(matriz[2][i] + " ");
		}	
	}
}

