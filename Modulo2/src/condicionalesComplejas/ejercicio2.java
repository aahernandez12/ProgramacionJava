package condicionalesComplejas;

public class ejercicio2 {

	public static void main(String[] args) {
		int num1 = 214;
		if (num1 >= 0 && num1 <= 9)
		{
			System.out.println(num1+" tiene una cifra!");
		}
		else if (num1 >= 10 && num1 <= 99)
		{
			System.out.println(num1+" tiene dos cifras!");
		}
		else if (num1 >= 100 && num1 <= 999)
		{
			System.out.println(num1+" tiene tres cifras!");
		}
		else if (num1 >= 1000 && num1 <= 9999)
		{
			System.out.println(num1+" tiene cuatro cifras!");
		}

	else
	{
		System.out.println(num1+" supera las 4 cifras!");
	}
	}
}
