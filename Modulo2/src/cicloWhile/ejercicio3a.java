package cicloWhile;

public class ejercicio3a {

	public static void main(String[] args) {
		// Contar cuantas vocales hay en un párrafo dado
		
		String frase = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.";
		
		int vocales = 0, aux = frase.length()-1;
		
		while(aux >= 0)
		{
			if(frase.charAt(aux) == 'a' || frase.charAt(aux) == 'e' || frase.charAt(aux) == 'i' || frase.charAt(aux) == 'o' || frase.charAt(aux) == 'u')
				{
					vocales++;
				}
			aux--;
		}
		System.out.println("La cantidad es: "+vocales+" vocales.");
	}

}
