package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		int ladoCuadrado = 8;
		int area = ladoCuadrado*ladoCuadrado;
		int perimetro= ladoCuadrado*4;
		System.out.println("Área Cuadrado: "+area);
		System.out.println("Perimetro Cuadrado: "+perimetro);
		
		int baseTriangulo = 9;
		int alturaTriangulo = 8;
		int ladoUnoTriangulo=8, ladoDosTriangulo=8;
		int areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		int perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + baseTriangulo;
		System.out.println("Área Triángulo: "+areaTriangulo);
		System.out.println("Perimetro Triángulo: "+perimetroTriangulo);
		
		int baseRectangulo = 8;
		int alturaRectangulo = 6;
		int areaRectangulo = (baseRectangulo * alturaRectangulo);
		int perimetroRectangulo = (baseRectangulo + alturaRectangulo)*2;
		System.out.println("Área Rectángulo: "+areaRectangulo);
		System.out.println("Perimetro Rectángulo: "+perimetroRectangulo);

	}

}
