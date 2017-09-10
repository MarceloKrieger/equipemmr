package iniciante;

import java.util.Scanner;

public class MainExercicio03 {

	public static  void main (String []args){
		
		Exercicio03 calc = new Exercicio03 ();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Raio:");
		calc.setR(teclado.nextDouble());
		System.out.println("A area  é: " + calc.getArea());
	}
	
	
	
	

}
