package cicloWhile;

public class numAleatorios {

	public static void main(String[] args) {
		// Generar numeros aleatorios entre 1 y 50 y detenerse cuando alguno sea multiplo de 10
		
		boolean x = true;
		
		while(x)
		{
			double n = Math.ceil(Math.random()*50);
			System.out.println(n);
			
			if(n % 10 == 0)
			{
				x = false;
			}
		}

	}

}
