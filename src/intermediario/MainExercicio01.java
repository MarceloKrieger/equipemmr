package intermediario;

import java.util.Scanner;

public class MainExercicio01 {

	public static void main(String [] args){
		
		Exercicio01 exercicio1 = new Exercicio01();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Escreva uma frase ");
		exercicio1.frase = input.nextLine();
		System.out.println(exercicio1.getQuantidadecaracteres());
	}
}

