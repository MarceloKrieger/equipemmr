package iniciante;

import java.util.Scanner;

public class MainExercicio06 {

	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		Exercicio06 somaImpares = new Exercicio06();
		System.out.println("DIGITE PRIMEIRO O MENOR NÚMERO E DEPOIS O MAIOR.");
		System.out.println("Digite o primeiro número inteiro: ");
		somaImpares.setValorInicial(teclado.nextInt());
		System.out.println("Digite o segundo número inteiro: ");
		somaImpares.setValorFinal(teclado.nextInt());
		System.out.println("Resultado: " + somaImpares.getTotal());
		return ;
		

	}
	
}