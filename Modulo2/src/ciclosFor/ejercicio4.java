package ciclosFor;

public class ejercicio4 {

	public static void main(String[] args) {
		// Sumatoria  de las iteraciones desde 0 hasta un número definido entre 1 y 10 y al resultado de la suma realizar otras operaciones
		int numero = 3, sumaIteracciones = 0;
		
		for(int i = 0; i <= numero; i++)
		{
			sumaIteracciones = sumaIteracciones + i;
		}
		System.out.println("La suma de las iteraciones es: "+sumaIteracciones);
		System.out.println("La raíz cuadrada de "+sumaIteracciones+" es: "+Math.sqrt(sumaIteracciones));
		
		int numAleat = (int) Math.round((Math.random()*sumaIteracciones));
		System.out.println("Un número aleatorio entre 1 y "+sumaIteracciones+" es "+numAleat);
		
		
		System.out.print("Los divisores de "+sumaIteracciones+" son: ");
		int divisorSuma;
		for(divisorSuma = 1; divisorSuma <= sumaIteracciones; divisorSuma++)
		{
			if(sumaIteracciones % divisorSuma == 0)
				{
				System.out.print(+divisorSuma+" ");
				
				}
		}	
		System.out.println();
		
		//factorial
		int facto, sumaFacto = 1;
		for(facto = 1; facto <= sumaIteracciones; facto++)
		{
			sumaFacto = sumaFacto * facto;
		}
		 System.out.println("El factorial de "+sumaIteracciones+" es: "+sumaFacto);

		//Definir si la suma es perfecto
		 int num = sumaIteracciones, sumaDivisores = 0;
			
			for(int numGuia = 1; numGuia < num; numGuia++ )
			{
				if( num % numGuia == 0)
				{
					sumaDivisores = numGuia + sumaDivisores;
				}
			}
			if( sumaDivisores == num)
			{
				System.out.println(+num+" es Número Perfecto pues la suma de sus divisores es: "+sumaDivisores);

			}
			else System.out.println(+num+" no es Número Perfecto pues la suma de sus divisores es: "+sumaDivisores);
		
		
		
	}
}