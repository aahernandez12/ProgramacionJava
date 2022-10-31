package ciclosFor;

public class ejercicio2 {

	public static void main(String[] args) {
		// Divisores de un número previo
		int num = 54;
		
		for(int div = 1; div <= num; div++)
		{
			if(num % div == 0)
			{
				System.out.println(+div+" es divisor de "+num);
			}
		}

	}

}
