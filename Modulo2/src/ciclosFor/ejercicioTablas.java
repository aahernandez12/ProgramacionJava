package ciclosFor;

public class ejercicioTablas {

	public static void main(String[] args) {
		// Imprimir las tablas de multiplicar del 1 al 10 con resultado
		for(int i = 1; i <= 10; i++)
		{
			System.out.println();
			System.out.println("Tabla de multiplicar del "+i);
			for(int j = 1; j <= 10; j++) // Un ciclo dentro de otro ciclo
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}

	}

}
