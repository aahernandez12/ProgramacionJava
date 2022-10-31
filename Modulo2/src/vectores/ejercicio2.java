package vectores;

public class ejercicio2 {

	public static void main(String[] args) {
		// Dados 2 grupos (A y B) c/u con 10 estudiantes y notas finales
		
		int grupoA [] = {1,2,3,4,5,6,7,8,9,10};
		int grupoB [] = {1,2,3,4,5,6,7,8,9,10};
		int notaA [] = {10,9,5,3,8,7,10,7,10,9};
		int notaB [] = {1,10,8,2,9,6,6,7,10,10};
		
		//Promedio General de cada grupo
		
		int sumaA = 0, sumaB = 0;
		for(int i = 0; i < grupoA.length; i++ )
		{
			sumaA = sumaA + notaA[i];
		}
		
		for(int j = 0; j < grupoA.length; j++ )
		{
			sumaB = sumaB + notaB[j];
		}
		System.out.println("El promedio general del Grupo A es "+(float) sumaA/grupoA.length);
		System.out.println("El promedio general del Grupo B es "+(float) sumaB/grupoB.length);
		System.out.println("El promedio general de los dos grupos es "+(float) (sumaB + sumaA)/(grupoA.length + grupoB.length));
		
		// Grupo con mejor promedio
		System.out.print("El grupo con mejor promedio es el Grupo ");
		if((float) sumaA/grupoA.length > (float) sumaB/grupoB.length)
			{
			System.out.println("A");
			}
		else
		{
			System.out.println("B");

		}

	}

}
