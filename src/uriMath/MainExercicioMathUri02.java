package uriMath;

import java.util.Scanner;

// URI Online Judge | 1805 | [P1]


public class MainExercicioMathUri02 {
	public static void main (String args []){
		
		Scanner teclado = new Scanner(System.in);
		ExercicioMathUri02 intervalo = new ExercicioMathUri02();
		System.out.println("Digite um número: ");
		intervalo.setNumero1(teclado.nextInt());
		System.out.println("Digite outro número: ");
		intervalo.setNumero2(teclado.nextInt());
		System.out.println("A somatoria do intervalo entre estes dois números é: ");
		System.out.print(intervalo.getResultado());
	}
}
