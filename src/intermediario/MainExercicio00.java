package intermediario;

import java.util.Scanner;

public class MainExercicio00OLD {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Exercicio00OLD criptografia = new Exercicio00OLD();

		System.out.print("Insira um nome: ");
		criptografia.setFrase(teclado.nextLine());
		System.out.print(criptografia.getAUXILIAR());
	}
}
