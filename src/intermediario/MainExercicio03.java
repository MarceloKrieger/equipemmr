package intermediario;

import java.util.Scanner;

public class MainExercicio03 {

	public static void main(String [] args){
		
		Exercicio03 exercicio03 = new Exercicio03();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Escreva uma frase ");
		exercicio03.setFrase(input.nextLine());
		System.out.println(exercicio03.getFrase());
	}
}
