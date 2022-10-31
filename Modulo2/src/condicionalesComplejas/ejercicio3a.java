package condicionalesComplejas;

public class ejercicio3a {

	public static void main(String[] args) {
		int num1 = (int) Math.round(Math.random()*100);
		int num2 = (int) Math.round(Math.random()*100);
		int num3 = (int) Math.round(Math.random()*100);
		int mayor = num1;
		
		if(num2 > mayor) {
			mayor = num2;
		}
		if(num3 > mayor) {
			mayor = num3;
		}
		System.out.println("De "+num1+", "+num2+", "+num3+", el numero mayor es: "+mayor);

	}

}
