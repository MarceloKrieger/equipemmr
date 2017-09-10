package uriOnline;

import java.text.DecimalFormat;

public class Exerciciouri05 {

	int S, AUXILIAR;

	public double getAUXILIAR() {

		double resultado = 0;
		double impar = 1, multiplicando2 = 1;

		DecimalFormat df = new DecimalFormat("0.00");
		
		while (impar <= 39){
			resultado = resultado + (impar/multiplicando2);
			impar = impar + 2;
			multiplicando2 = multiplicando2 * 2;
		}
		return resultado;
	}
}