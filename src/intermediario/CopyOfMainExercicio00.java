package intermediario;

import java.util.LinkedList;
import java.util.Scanner;

public class CopyOfMainExercicio00 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		CopyOfExercicio00 criptografia = new CopyOfExercicio00();

		System.out.print("Insira um nome: ");
		criptografia.setFrase(teclado.nextLine());
		LinkedList<Character> lista = new LinkedList<Character>();
		for (Character valor : lista){
			System.out.println(valor);
		}
	}
}