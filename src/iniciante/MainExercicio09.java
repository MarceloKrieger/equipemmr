package iniciante;

import java.util.Scanner;

public class MainExercicio09 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		Exercicio09 saque = new Exercicio09();
		System.out.println("Digite o valor que deseja sacar: ");
		saque.setValorSaque(teclado.nextInt());
		System.out.println(saque.getAUXILIAR());
	}
}
