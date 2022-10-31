package condicionalesComplejas;

public class ejercicio4 {

	public static void main(String[] args) {
		double cantPreguntas = 90;
		double totalPreguntas = 100;
		float porcentaje = (float) ((cantPreguntas / totalPreguntas)*100);
		
		if (porcentaje < 50 ) {
			System.out.println("Esta Usted Fuera de nivel pues su porcentaje de respuestas correctas es de: "+porcentaje+"%");
		}
		else if (porcentaje >= 50 && porcentaje < 75) {
			System.out.println("Su nivel es Regular pues su porcentaje de respuestas correctas es de: "+porcentaje+"%");
		}
		else if (porcentaje >= 75 && porcentaje < 90) {
			System.out.println("Su nivel es Medio pues su porcentaje de respuestas correctas es de: "+porcentaje+"%");
		}
		else if (porcentaje >= 90)
		{
			System.out.println("Su nivel es Máximo pues su porcentaje de respuestas correctas es de: "+porcentaje+"%");
		}
	}

}
