package condicionalesSimples;

public class ejercicio4 {

	public static void main(String[] args) {
		int n1 = 65, n2 = 5;
		int n3 = n1%n2;
		if (n3 == 0)
		{
			System.out.println(n1+" es múltiplo de "+n2);
		}
		else
		{
			System.out.println(n1+" no es múltiplo de "+n2);
		}
	}

}
