package cafeOpciones;

public class Opcion1 {

	public static void main(String[] args) {
		String respuesta1 = "Si";
		String respuesta2 = "no";
		System.out.println("- ¿Quieres un cafe?");
		System.out.println("* " + respuesta1);
		if(respuesta1 == "Si")
		{
			
			System.out.println("- ¿Vas a comprarlo?");
			if(respuesta2 == "Si")	
			{
				System.out.println("* " + respuesta2);
				System.out.println("- Comprar Café");
			}
			else
			{
				System.out.println("* " + respuesta2);
				System.out.println("- Hacer el café");
			}
			System.out.println("- Beber");
		}
		else
		{
			System.out.println("- Sigue estudiando");
		}
		
		

	}

}
