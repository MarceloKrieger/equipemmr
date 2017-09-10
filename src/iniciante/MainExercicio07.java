package iniciante;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Scanner;

public class MainExercicio07 {
	
	public static void main(String args[]){
		int entrada;
		int numeroDigitado;
		
		Scanner teclado = new Scanner(System.in);
		Exercicio07 aux = new Exercicio07();
		
		System.out.println("Digite um número: ");
		aux.setNumeroDigitado(teclado.nextInt());
		LinkedList<Integer> lista = aux.getAUXILIAR();
		for (Integer valor : lista){
			System.out.println(valor);
		}			
	}		
}
		
	

