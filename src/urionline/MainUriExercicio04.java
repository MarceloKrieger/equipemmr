package uriOnline;

// URI Online Judge | 1165


import java.util.Scanner;

public class MainUriExercicio04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Exerciciouri04 entrada = new Exerciciouri04();

		System.out.print("Digite o numero: ");
		entrada.setNumero(teclado.nextInt());
		System.out.println(entrada.mensagem());
		System.out.println(entrada.éPrimo());
	}

}
