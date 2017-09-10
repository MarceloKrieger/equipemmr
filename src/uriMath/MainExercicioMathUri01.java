package uriMath;

import java.util.Scanner;

// URI Online Judge | 1197

public class MainExercicioMathUri01 {
	public static void main (String []args){
		
		Scanner teclado = new Scanner(System.in);
		ExercicioMathUri01 distancia = new ExercicioMathUri01();
		System.out.println("Digite a velocidade em km/h");
		distancia.setVelocidadeInicial(teclado.nextInt());
		System.out.println("Digite o tempo em h");
		distancia.setTempo(teclado.nextInt());
		System.out.print("Sua distancia com o tempo dobrado é " + distancia.getDistancia());
		System.out.print(" km.");
		
	}

}

