package intermediario;

import java.util.Scanner;

public class MainExercicio02 {
	public static void main(String [] args)	{
	
	Exercicio02 polindromo = new Exercicio02();
	Scanner teclado = new Scanner (System.in);
	
	System.out.println("Digite uma frase: ");
	polindromo.frase = teclado.nextLine();
	System.out.print(polindromo.getResultado());
	}
}