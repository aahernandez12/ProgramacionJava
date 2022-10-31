package cicloWhile;

public class numerosImpares {

	public static void main(String[] args) {
		// numeros impares entre 2 números dados
		
		int num1 = (int) Math.round(Math.random()*100);
		int num2 = (int) Math.round(Math.random()*100);
		int nImpar = num1 + 1;

		
		System.out.println("Los numeros impares entre "+num1+" y "+num2+" son: ");
		while (nImpar <= num2 - 1 )
		{
			
			if(nImpar % 2 != 0)
			{
				System.out.print(nImpar+" ");
			}
			nImpar++;
		}

	}

}
