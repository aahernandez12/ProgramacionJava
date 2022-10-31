package cicloWhile;

public class ejercicio3 {

	public static void main(String[] args) {
		// Contar cuantas vocales hay en un párrafo dado
		
		String texto = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.";
		
		int contadorVocal = 0, letrasTexto = texto.length()-1;
		int contadorVocala = 0;
		int contadorVocale = 0;
		int contadorVocali = 0;
		int contadorVocalo = 0;
		int contadorVocalu = 0;
		
		char auxLetras;
				
			//System.out.println(letrasTexto);
		
		while(letrasTexto >= 0)
		{
			auxLetras = texto.charAt(letrasTexto);
			
			if(auxLetras == 'a')
					{
						contadorVocala = contadorVocala + 1;
						
					}
			if(auxLetras == 'e')
					{
						contadorVocale = contadorVocale + 1;
						
					}
			if(auxLetras == 'i')
					{
						contadorVocali = contadorVocali + 1;
						
					}
			if(auxLetras == 'o')
					{
						contadorVocalo = contadorVocalo + 1;
						
					}
			if(auxLetras == 'u')
					{
						contadorVocalu = contadorVocalu + 1;
						
					}
			letrasTexto--;
		}
		contadorVocal = contadorVocala + contadorVocale + contadorVocali + contadorVocalo + contadorVocalu; 
		System.out.println("El Texto contiene "+contadorVocal+" vocales:");
		System.out.println("El Texto contiene "+contadorVocala+" vocales a.");
		System.out.println("El Texto contiene "+contadorVocale+" vocales e.");
		System.out.println("El Texto contiene "+contadorVocali+" vocales i.");
		System.out.println("El Texto contiene "+contadorVocalo+" vocales o.");
		System.out.println("El Texto contiene "+contadorVocalu+" vocales u.");
	}

}
