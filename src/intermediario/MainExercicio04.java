package intermediario;

import java.util.LinkedList;
import java.util.Scanner;

public class MainExercicio04 {
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		Exercicio04 binario = new Exercicio04();
		
		System.out.print("Digite um número inteiro e positivo: "); 
		binario.setEntrada(teclado.nextInt());
		//System.out.println(binario.getDecimalParaBinario());	
		LinkedList<Integer> lista = binario.getDecimalParaBinario();
		for (Integer valor : lista){
			System.out.println(valor);
		}
	}
}