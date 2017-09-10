package uriOnline;

import java.text.DecimalFormat;
import java.lang.reflect.Array;

public class Exerciciouri02 {
	
	int AUXILIAR;
	public double getAUXILIAR() {
		double s = 0;

		for (double i = 1 ; i <= 100; i++) {
			s = s + (1/i);
		}
		double resultado = s;
		return resultado;
	}
}