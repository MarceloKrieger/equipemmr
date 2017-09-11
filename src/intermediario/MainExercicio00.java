package intermediario;

import java.util.Scanner;

public class MainExercicio00 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Exercicio00 criptografia = new Exercicio00();

		System.out.print("Insira um nome: ");
		criptografia.setFrase(teclado.nextLine());
		System.out.print(criptografia.getAUXILIAR());
	}
}
