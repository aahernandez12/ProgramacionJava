package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		double num1 = Math.round(Math.random()*50), num2 = Math.ceil(Math.random()*50);
		System.out.println("Los números son: "+num1+" y "+num2);
		System.out.println("De los cuales, el mayor es: "+Math.max(num1, num2));
	}

}
