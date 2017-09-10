package iniciante;

import java.util.Scanner;

public class MainExercicio01 {

	public static void main(String[] args) {

		Exercicio01 soma = new Exercicio01();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro termo: ");
		soma.setTermo1(teclado.nextInt());
		System.out.println("Digite o segundo termo: ");
		soma.setTermo2(teclado.nextInt());
		System.out.println("O total é: " + soma.getResultado());
	}
}
