package condicionalesComplejas;

public class ejercicio1 {

	public static void main(String[] args) {
		int x = (int) Math.round(Math.random()*100);
		int edad = x;
		
		if(edad >= 0 && edad <= 5)
		{
			System.out.println(edad+" Pertenece a Intante");
		}
		else if(edad >= 6 && edad <= 10)
		{
			System.out.println(edad+" Pertenece a Niño");
		}
		else if(edad >= 10 && edad <= 15)
		{
			System.out.println(edad+" Pertenece a Pre adolescente");
		}
		else if(edad >= 16 && edad <= 18)
		{
			System.out.println(edad+" Pertenece a Adolescente");
		}
		else if(edad >= 19 && edad <= 25)
		{
			System.out.println(edad+" Pertenece a Pre adulto");
		}
		else if(edad >= 26 && edad <= 40)
		{
			System.out.println(edad+" Pertenece a Adulto");
		}
		else if(edad >= 41 && edad <= 55)
		{
			System.out.println(edad+" Pertenece a Pre anciano");
		}
	else
	{
		System.out.println(edad+" Pertenece a anciano");
	}
	}
	
}