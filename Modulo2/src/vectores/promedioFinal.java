package vectores;

public class promedioFinal {

	public static void main(String[] args) {
		// Mediante 2 vectores almacenar 5 notas de un estudiante para calcular su promedio final
		
		double notas[] = new double [5];
		int porcentajes[] = {20,10,30,20,20};
		
		notas[0] = 4.5;
		notas[1] = 3.2;
		notas[2] = 5.0;
		notas[3] = 1.5;
		notas[4] = 4.3;
		
		double promedio = 0;
		
		for(int i = 0; i < notas.length; i++)
		{
			promedio = ( notas[i] * (porcentajes[i]) / 100) + promedio;
		}
		System.out.println("Promedio final " + Math.round(promedio));
	}

}
