package vectores;

public class ejercicio3 {

	public static void main(String[] args) {
		// Dada una palabra, que la divida en sus carácteres y los almacene en un vector del mismo tamaño que la palabra
		
		String palabra = "America";
		char caracteres[] = new char[palabra.length()];
		
		for(int i = 0; i < palabra.length(); i++)
			{
				caracteres[i] = palabra.charAt(i);
			}
		
		for(int i = 0; i < caracteres.length; i++)
			{
				System.out.println("Caracter: "+caracteres[i]);
			}

		
	}

}
