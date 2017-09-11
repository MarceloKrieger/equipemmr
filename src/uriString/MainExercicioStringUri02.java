package uriString;

import java.util.Scanner;

public class MainExercicioStringUri02 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ExercicioStringUri02 SPOCK = new ExercicioStringUri02();
		
		System.out.print("Seja bem vindo ao jogo Pedra, papel, tesoura, lagarto e Spock.\n");
		System.out.print("--------------------------\n");
		System.out.print("|Pedra   =   [1]         |\n");
		System.out.print("|Papel   =   [2]         |\n");
		System.out.print("|Tesoura =   [3]	 |\n");
		System.out.print("|Lagarto =   [4]	 |\n");
		System.out.print("|Spock   =   [5]	 |\n");
		System.out.print("--------------------------\n\n");
		System.out.print("Player 1: ");
		SPOCK.setPlayer1(teclado.nextInt());
		System.out.print("Player 2: ");
		SPOCK.setPlayer2(teclado.nextInt());
		
		System.out.println(SPOCK.getJOGO());
		
		
		
	}
}
