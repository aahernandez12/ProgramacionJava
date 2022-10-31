package condicionalesComplejas;

public class ejercicio2a {

	public static void main(String[] args) {
		int numero = 56184;
		int cifras = (int) (Math.log10(numero)+1);
		
		if(cifras <= 4)
		{
			System.out.println(cifras+" cifras");
		}
		else 
		{
			System.out.println("mayor de 4 cifras");
		}

	}

}
