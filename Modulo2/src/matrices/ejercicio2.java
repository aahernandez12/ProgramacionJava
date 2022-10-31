package matrices;

public class ejercicio2 {

	public static void main(String[] args) {
		// En una matriz de 5x3 y con numeros entre 0 y 50 hallar el mayor
		
		int matriz[][] = new int [5][3];
		int mayor = 0; 
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				matriz[i][j] = (int) Math.ceil(Math.random()*50);
			}
		}
		// Mostar matriz
		
				for(int i = 0; i < 5; i++)
				{
					for(int j = 0; j < 3; j++)
					{
						System.out.print(matriz[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
		
		//Buscar el valor mayor
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(matriz[i][j] > mayor)
				{
					mayor = matriz[i][j];
				}
			}
		}
		System.out.println("El valor mayor es: "+mayor);
		
	}

}
