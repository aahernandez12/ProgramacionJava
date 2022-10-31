package ClasesOperadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		String estudianteNombre = "Alfredo A. Hernández López";
		double n1 = 8.2;
		double n2 = n1*n1;
		double n3 = n1/n1;
		double n4 = n1%n2;
		double n5 = n1*n1*n1;
		double promedio = (n1+n2+n3+n4+n5)/5;
		System.out.println("Nombre: "+estudianteNombre);
		System.out.println("variable tipo double: "+n1);
		System.out.println("multiplicación: "+n2);
		System.out.println("división: "+n3);
		System.out.println("módulo: "+n4);
		System.out.println("potencia: "+n5);
		System.out.println("El promedio de "+ estudianteNombre + " es: "+promedio);
		
		
		
		
	}
}