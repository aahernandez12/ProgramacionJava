package cicloWhile;

public class descomponerPalabra {

	public static void main(String[] args) {
		// Descomponer una palabra en sus carácteres 
		
		String palabra = "Pólitecnico de Colombia";
		int cont = 0;
		
		System.out.println("La palabra "+palabra+" tiene "+palabra.length()+" caracteres.");
		
		while(cont < palabra.length())
		{
			System.out.println(palabra.charAt(cont)+" en la posición "+cont);
			cont++;
		}
	}
}