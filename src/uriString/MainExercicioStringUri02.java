package uriString;

import java.util.Scanner;

public class MainExercicioStringUri02 {
	public static void main (String args []){
		
		Scanner teclado = new Scanner(System.in);
		ExercicioStringUri02 jokenpo = new ExercicioStringUri02();
		System.out.println("Escolha entre 1, 2, 3, 4 e 5, sendo:");
		System.out.println("Pedra   = 1");
		System.out.println("Papel   = 2");
		System.out.println("Tesoura = 3");
		System.out.println("Lagarto = 4");
		System.out.println("Spock   = 5");
		System.out.println("Digite o número de partidas ");
		jokenpo.setPartidas(teclado.nextInt());
		System.out.println("Opção Jogador 1: ");
		jokenpo.setJogador1(teclado.nextInt());
		System.out.println("Opção Jogador 2: ");
		jokenpo.setJogador2(teclado.nextInt());
	}
	
	
}
