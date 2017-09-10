package uriOnline;
import java.util.Scanner;

public class Exerciciouri01 {
	
	Scanner teclado = new Scanner(System.in);
	
	int entrada, AUXILIAR;

	public double getAUXILIAR() {
		
		int contador = 0;
		float media = 0, soma = 0;;
		
		while(entrada >= 0) {
			
			System.out.println("Digite uma idade aleatória : ");
			entrada = teclado.nextInt();
			contador++;
			soma = entrada + soma;
		}
	    soma = soma + (entrada * -1);
		media = soma / --contador; 	
		return media;
	}
	
}