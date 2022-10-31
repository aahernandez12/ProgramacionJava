package vectores;

public class ejercicio1 {

	public static void main(String[] args) {
		// Promediar el peso de 5 personas y otras operaciones
		
		int personas[] = {1,2,3,4,5};
		float pesoPersonal[] = {65.2f,89.4f,45.7f,56.1f,72.9f};
		
		float sumaPeso = 0.0f, pesoPromedio = 0.0f;
		for(int i = 0; i < personas.length; i++)
		{
			sumaPeso = sumaPeso + pesoPersonal[i];
		}
		pesoPromedio = sumaPeso / personas.length;
		System.out.println("El peso promedio es: "+pesoPromedio);
		
		// Cuántas personas superan el peso promedio
		
		int contadorPersonas = 0, j;
		for(j = 0; j < personas.length; j++)
		{
			if(pesoPersonal[j] > pesoPromedio)
			{
				contadorPersonas++;
			}
		}
		System.out.println(contadorPersonas+" personas superan el peso promedio.");
		
		// Cuántas pesonas son inferiores al peso promedio
		
		contadorPersonas = 0;
		int k = 0;
		for(k = 0; k < personas.length; k++)
		{
			if(pesoPersonal[k] < pesoPromedio)
			{
				contadorPersonas++;
			}
		}
		System.out.println(contadorPersonas+" son inferiores al peso promedio.");
		
		
		
	}
}
