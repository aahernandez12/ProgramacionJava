package condicionalesSimples;

public class ejercicio1 {

	public static void main(String[] args) {
		int n1 = (int) (Math.round(Math.random()*100));
		if(n1 < 50)
		{
			System.out.println(+n1+" es menor de 50");
		}
		else
		{
			System.out.println(+n1+" es mayor de 50");
		}

	}

}
