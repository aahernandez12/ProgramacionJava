package switchCase;

public class ejercicio2 {

	public static void main(String[] args) {
		// Calculadora con base en un operador dado
		
		int num1 = 20, num2 = 4;
		String operador = ("porcentaje");
		
		switch (operador)
		{
		case "suma":
			System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
			break;
		case "resta":
			System.out.println("La resta de "+num1+" y "+num2+" es "+(num1-num2));
			break;
		case "producto":
			System.out.println("El producto de "+num1+" y "+num2+" es "+(num1*num2));
			break;
		case "división":
			System.out.println("La división de "+num1+" y "+num2+" es "+(num1/num2));
			break;
		case "módulo":
			System.out.println("El módulo de "+num1+" y "+num2+" es "+(num1%num2));
			break;
		default:
			System.out.println("Error");
		}
		
	}

}
