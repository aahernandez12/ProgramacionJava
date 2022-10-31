package switchCase;

public class ejercicio2a {

	public static void main(String[] args) {
		// Solución a Calculadora con base en un operador dado
		
		float num1 = 15, num2 = 2; 
		float resultado = 0;
		char operador = '#';
		
		switch (operador)
		{
		case '+':
			resultado = num1+num2;
			System.out.println("La suma de "+num1+" y "+num2+" es "+resultado);
			break;
		case '-':
			resultado = num1-num2;
			System.out.println("La resta de "+num1+" y "+num2+" es "+resultado);
			break;
		case '*':
			resultado = num1*num2;
			System.out.println("El producto de "+num1+" y "+num2+" es "+resultado);
			break;
		case '/':
			resultado = num1/num2;
			System.out.println("La división de "+num1+" y "+num2+" es "+resultado);
			break;
		case '%':
			resultado = num1%num2;
			System.out.println("El módulo de "+num1+" y "+num2+" es "+resultado);
			break;
		default:
			System.out.println("Error");
		}

	}

}
