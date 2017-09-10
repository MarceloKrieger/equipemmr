package iniciante;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercicio05 {
	
	public static double getarray() {
		int entrada;

		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Digite o valor de entrada: ");
		entrada = teclado.nextInt();
	
		int valores[] = new int[1000];
	
		for(int i = 0; i< valores.length; i++) {
			System.out.println("[" + (i + 1) + "] " + i * entrada);
		}
    	return entrada;
	}
}