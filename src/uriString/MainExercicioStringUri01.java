package uriString;

import java.util.Scanner;

// URI Online Judge | 1768

public class MainExercicioStringUri01 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		ExercicioStringUri01 NATAL = new ExercicioStringUri01();

		System.out.print("Digite um número IMPAR para que ele seja o tamaho da sua árvore natalina:");
		NATAL.setPosicao1(teclado.nextInt());
		System.out.println(NATAL.getArvore());
	}
}