package iniciante;

import java.util.Scanner;

public class MainExercicio02 {
	public static void main(String[] args){
		
		Exercicio02 atributos = new Exercicio02();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do vendedor: ");
		atributos.setNome(teclado.next());
		System.out.println("Digite o salário fixo do vendedor: ");
		atributos.setSalarioFixo(teclado.nextInt());
		System.out.println("Digite o total de vendas do vendedor: ");
		atributos.setTotalVendasMes(teclado.nextInt());
		System.out.println("Vendedor: " + atributos.getNome());
		System.out.println("Salário fixo: " + atributos.getSalarioFixo());
		System.out.println("Total de vendas: " + atributos.getTotalVendasMes());
		System.out.println("Percentual de vendas: " + atributos.getPercentualVendas());
				
	}

}