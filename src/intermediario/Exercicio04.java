package intermediario;

import java.util.LinkedList;
import java.util.Scanner;
public class Exercicio04 {
	
	int entrada,aux,resultado, decimalParaBinario;
	
	public int getEntrada() {
		return entrada;
	}

	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}

	public LinkedList<Integer> getDecimalParaBinario() {
		LinkedList<Integer> retorno = new LinkedList<Integer>();
		if(aux > 0) {	
			aux = entrada % 2;
			resultado = entrada / 2;
			retorno.add( resultado );
		}
		return retorno;
	}
	
}

