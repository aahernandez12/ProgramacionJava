package vectores;

public class ejercicio1a {

	public static void main(String[] args) {
		// Solución Promediar el peso de 5 personas y otras operaciones
		
		float pesos[] = {65.2f,89.4f,45.7f,56.1f,72.9f};
		float prom = 0.0f, promedio = 0.0f;
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < pesos.length; i++)
		{
			prom = prom + pesos[i];
		}
		promedio = prom / 5;
		
		// Cuántas personas superan/estan abajo del peso promedio
		
		for(int i = 0; i < pesos.length; i++)
		{
			if(pesos[i] > promedio)
			{
				max++;
			}
			else
			{
				min++;
			}
		}
		System.out.println("El peso promedio es: "+promedio);
		System.out.println("Por encima del promedio: "+max);
		System.out.println("Por debajo del promedio: "+min);
	}

}
