package uriOnline;

import java.util.LinkedList;

public class Exerciciouri03 {
	public int numero, divisor, contador,resultado;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDivisor() {
		return divisor;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public LinkedList<Integer> getResultado() {
		LinkedList<Integer> retorno = new LinkedList<Integer>(); 
		contador = numero;
		while(contador > 0){
			divisor = (numero % contador);	
			if (divisor == 0){
				retorno.add( contador );
			}
			contador--;
		}		
		return retorno;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
}
