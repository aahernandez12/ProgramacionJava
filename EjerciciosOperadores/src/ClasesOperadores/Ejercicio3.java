package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numeroUno = 8;
		int numeroDos = 2;
		System.out.println("Variable1: "+numeroUno);
		System.out.println("Variable2: "+numeroDos);
		int vAuxiliar = numeroUno;
		numeroUno = numeroDos;
		numeroDos = vAuxiliar;
		System.out.println("Variable1: "+numeroUno);
		System.out.println("Variable2: "+numeroDos);
		
	}
}
