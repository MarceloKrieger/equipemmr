package uriOnline;

import java.util.LinkedList;
import java.util.Scanner;

public class MainUriExercicio03 {
	
	public static void main(String[] args) {

		Exerciciouri03 divisores = new Exerciciouri03 ();
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um n�mero ");
		divisores.setNumero(teclado.nextInt());
		System.out.println("Os divisores s�o: ");
		LinkedList<Integer> lista = divisores.getResultado();
		for (Integer valor : lista) {
			System.out.println(valor);
		}
	}
}
