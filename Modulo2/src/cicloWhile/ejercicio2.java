package cicloWhile;

public class ejercicio2 {

	public static void main(String[] args) {
		// Determinar si una palabra dada es ó no palíndroma
		
		String palabra = "reconocido";
		String palindroma = "";
		
		int aux = palabra.length()-1;
		
		while(aux >= 0)
		{
			palindroma = palindroma + palabra.charAt(aux);
			aux--;
		}
		if(palabra.equals(palindroma))
		{
			System.out.println("La palabra "+palabra+" es Palabra Palíndroma: "+palindroma);
		}
		else 
		{
			System.out.println("La palabra "+palabra+" No es Palabra Palíndroma: "+palindroma);
		}

	}

}
