package matrices;

public class matrices3x3a {

	public static void main(String[] args) {
		//Matriz 3x3 edades
		
		int edades [][] = {{19,18,16},{15,14,12},{12,11,18}};
		
		for (int i = 0; i < edades.length; i++)
		{
			for(int j = 0; j < edades.length; j++)
			{
				System.out.print(edades[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
