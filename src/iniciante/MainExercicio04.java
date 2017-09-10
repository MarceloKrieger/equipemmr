package iniciante;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainExercicio04 {
		public static void main(String[] args) throws ParseException {			
			
			Scanner input = new Scanner(System.in);
			Exercicio04 exercicio04 = new Exercicio04();
			
			//Pega Data Inicial
			System.out.println("Data inicial: ");
			exercicio04.setDataInicial(input.nextLine());
	    
		    //Pega Data Final
			System.out.println("Data final: ");
			exercicio04.setDataFinal(input.nextLine());
			
			System.out.print("Diferença: " + (int) exercicio04.getDiferencaEmDias());
			System.out.print(" dias");
		}
	}