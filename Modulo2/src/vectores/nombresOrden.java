package vectores;

public class nombresOrden {

	public static void main(String[] args) {
		// Dados unos nombres numerarlos
		
		String nombres [] = new String [3];
		nombres[0] = "Juan";
		nombres[1] = "Stiven";
		nombres[2] = "Andrés";
		
		for(int i = 0; i < nombres.length; i++)
		{
			System.out.println("Nombre: "+i+" - "+nombres[i]);
		}
	}

}
