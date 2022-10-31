package condicionalesComplejas;

public class ejercicio4a {

	public static void main(String[] args) {
		int cantPreguntas = 50;
		int totalPreguntas = 100;
		double porcentaje = (cantPreguntas*100) / totalPreguntas;
		
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
