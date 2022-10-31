package vectores;

public class ejercicio2a {

	public static void main(String[] args) {
		// Dados 2 grupos (A y B) c/u con 10 estudiantes y notas finales
			
				double promedioA = 0, promedioB = 0, promG = 0;
				double promA = 0, promB = 0;
				
				String estudiantesA [] = {"Diego","Ana","Stiven","Rafael","Camila","Andrés","Toño","Esteban","Evelin","Juan"};
				double notasA [] = {10,9,5,3,8,7,10,7,10,9};
				
				String estudiantesB [] = {"Camilo","Ana","Stiven","Liciño","Camila","Elizabeth","Alex","Esteban","Evelin","Fernando"};
				double notasB [] = {1,10,8,2,9,6,6,7,10,10};
				
				for(int i = 0; i < notasA.length; i++ )
				{
					promA = promA + notasA[i];
					promB = promB + notasB[i];
				}
				promedioA = promA / 10;
				System.out.println("Promedio A: "+promedioA);
				
				promedioB = promB / 10;
				System.out.println("Promedio B: "+promedioB);

				 promG = (promedioA + promedioB) / 2;
				System.out.println("Promedio General: "+promG);
						
				if(promedioA > promedioB)
					{
					System.out.println("El grupo con mejor promedio es el A");
					}
				else
				{
					System.out.println("El grupo con mejor promedio es el B");
	}

}
}
